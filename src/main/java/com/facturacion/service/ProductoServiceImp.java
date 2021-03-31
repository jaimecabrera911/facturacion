package com.facturacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.entity.Producto;
import com.facturacion.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> buscarTodo() {

		return productoRepository.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> buscarPorId(int id) {

		return productoRepository.findById(id);
	}

}
