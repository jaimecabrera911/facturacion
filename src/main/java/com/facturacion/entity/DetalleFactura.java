/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facturacion.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DesarrolladorWeb6
 */
@Entity
@Table(name = "detalle_facturas")
@NamedQueries({ @NamedQuery(name = "DetalleFactura.findAll", query = "SELECT d FROM DetalleFactura d"),
		@NamedQuery(name = "DetalleFactura.findByIdDetalleFactura", query = "SELECT d FROM DetalleFactura d WHERE d.idDetalleFactura = :idDetalleFactura"),
		@NamedQuery(name = "DetalleFactura.findByCantidad", query = "SELECT d FROM DetalleFactura d WHERE d.cantidad = :cantidad") })
public class DetalleFactura implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id_detalle_factura")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleFactura;
	@Column(name = "cantidad")
	private Integer cantidad;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@JoinColumn(name = "factura", referencedColumnName = "id_factura")
	@ManyToOne(optional = false)
	private Factura factura;
	@JoinColumn(name = "producto", referencedColumnName = "id_producto")
	@ManyToOne(optional = false)
	private Producto producto;

	public DetalleFactura() {
	}

	public DetalleFactura(Integer idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public Integer getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(Integer idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDetalleFactura != null ? idDetalleFactura.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof DetalleFactura)) {
			return false;
		}
		DetalleFactura other = (DetalleFactura) object;
		if ((this.idDetalleFactura == null && other.idDetalleFactura != null)
				|| (this.idDetalleFactura != null && !this.idDetalleFactura.equals(other.idDetalleFactura))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.facturacion.DetalleFactura[ idDetalleFactura=" + idDetalleFactura + " ]";
	}

}
