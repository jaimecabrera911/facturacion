/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facturacion.service;

import com.facturacion.entity.Factura;
import com.facturacion.repository.FacturaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DesarrolladorWeb6
 */
@Service
public class FacturaServiceImp implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    @Override
    public List<Factura> buscarTodo() {
        return facturaRepository.findAll();
    }

    @Override
    public void guardar(Factura factura) {
        facturaRepository.save(factura);
    }

    @Override
    public Optional<Factura> bucarPorId(Integer id) {
        return facturaRepository.findById(id);
    }

}
