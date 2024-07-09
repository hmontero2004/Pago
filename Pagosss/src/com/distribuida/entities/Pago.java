package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table (name="pagos")
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pago")
    private int idPago;

    @Column(name = "IdPedido")
    private int pedido;

    @Column(name = "FechaPago")
    private Date fechaPago;

    @Column(name = "IdTipoPago")
    private int idTipoPago;

    @Column(name = "Monto")
    private double monto;
	
    @JoinColumn(name = "id_tipo_pago")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private TipoPago tipoPago;
	
	public Pago () {    }


	public Pago(int idPago, int pedido, Date fechaPago, int idTipoPago, double monto) {
		this.idPago = idPago;
		this.pedido = pedido;
		this.fechaPago = fechaPago;
		this.idTipoPago = idTipoPago;
		this.monto = monto;
	}


	public int getIdPago() {
		return idPago;
	}


	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}


	public int getPedido() {
		return pedido;
	}


	public void setPedido(int pedido) {
		this.pedido = pedido;
	}


	public Date getFechaPago() {
		return fechaPago;
	}


	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}


	public int getIdTipoPago() {
		return idTipoPago;
	}


	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public String toString() {
		return "Pago [idPago=" + idPago + ", pedido=" + pedido + ", fechaPago=" + fechaPago + ", idTipoPago="
				+ idTipoPago + ", monto=" + monto + "]";
	}
	
	
}
