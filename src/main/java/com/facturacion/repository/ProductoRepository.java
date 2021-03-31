package com.facturacion.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.facturacion.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	

}
