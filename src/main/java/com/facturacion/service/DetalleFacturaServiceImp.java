package com.facturacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.entity.DetalleFactura;
import com.facturacion.entity.Factura;
import com.facturacion.repository.DetalleFacturaRepository;

@Service
public class DetalleFacturaServiceImp implements DetalleFacturaService {

	@Autowired
	DetalleFacturaRepository detalleFacturaRepository;

	@Override
	public List<DetalleFactura> buscarTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DetalleFactura> buscarPorFactura(Factura factura) {
		List<DetalleFactura> lista = detalleFacturaRepository.findByFactura(factura);
		return lista;
	}

}
