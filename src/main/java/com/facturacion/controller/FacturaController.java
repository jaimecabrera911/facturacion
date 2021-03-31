/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facturacion.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facturacion.entity.DetalleFactura;
import com.facturacion.entity.Factura;
import com.facturacion.service.DetalleFacturaService;
import com.facturacion.service.FacturaService;

/**
 *
 * @author DesarrolladorWeb6
 */
@Controller
@RequestMapping("/facturas")
public class FacturaController {

	@Autowired
	FacturaService facturaService;

	@Autowired
	DetalleFacturaService detalleFacturaService;

	@GetMapping({ "", "/" })
	public String listarTodo(Model model) {
		List<Factura> facturas = facturaService.buscarTodo();
		model.addAttribute("facturas", facturas);
		return "views/facturas/lista";
	}

	@GetMapping("/{id}")
	public String buscarPorId(@PathVariable int id, Model model) {
		Optional<Factura> factura = facturaService.bucarPorId(id);
		List<DetalleFactura> detalleFacturas = detalleFacturaService.buscarPorFactura(factura.get());
		Double subtotal=0.0;
		
		for (Iterator<DetalleFactura> iterator = detalleFacturas.iterator(); iterator.hasNext();) {
			DetalleFactura detalleFactura = (DetalleFactura) iterator.next();
			subtotal+=detalleFactura.getCantidad()*detalleFactura.getProducto().getPrecio();
		}
		
		model.addAttribute("factura", factura.get());
		model.addAttribute("detalleFacturas", detalleFacturas);
		model.addAttribute("subtotal", subtotal);
		return "views/facturas/detalle";
	}
}
