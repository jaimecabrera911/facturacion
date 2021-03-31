package com.facturacion.service;

import java.util.List;
import java.util.Optional;

import com.facturacion.entity.Producto;

public interface ProductoService {

	public List<Producto> buscarTodo();

	public void guardar(Producto producto);

	public Optional<Producto> buscarPorId(int id);

}
