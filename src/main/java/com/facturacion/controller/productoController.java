package com.facturacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facturacion.entity.Producto;
import com.facturacion.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class productoController {

	@Autowired
	ProductoService productoService;

	@GetMapping({"","/"})
	public String buscarTodo(Model model) {
		List<Producto> productos = productoService.buscarTodo();
		model.addAttribute("productos",productos);
		return "/views/productos/lista";
	}

}
