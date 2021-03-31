package com.facturacion.service;

import java.util.List;

import com.facturacion.entity.DetalleFactura;
import com.facturacion.entity.Factura;

public interface DetalleFacturaService {
	public List<DetalleFactura> buscarTodo();

	public List<DetalleFactura> buscarPorFactura(Factura factura);
}
