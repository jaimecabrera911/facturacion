/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facturacion.service;

import com.facturacion.entity.Factura;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author DesarrolladorWeb6
 */
public interface FacturaService {

    public List<Factura> buscarTodo();

    public void guardar(Factura factura);

    public Optional<Factura> bucarPorId(Integer id);
}
