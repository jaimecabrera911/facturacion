/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facturacion.repository;

import com.facturacion.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DesarrolladorWeb6
 */
public interface RolRepository extends JpaRepository<Rol, Integer>{
    
}
