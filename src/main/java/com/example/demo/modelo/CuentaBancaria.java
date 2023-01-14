package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cuenta")
public class CuentaBancaria {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuen_seq")
	//@SequenceGenerator(name = "cuen_seq", sequenceName = "cuen_seq", allocationSize = 1)
	@Column(name = "cuenNumero")
	private String cuen_numero;
	@Column(name = "cuen_nombre_propietario")
	private String nombrePropietario;
	@Column(name = "tipo")
	private String tipoCuenta;
	@Column(name = "cuen_saldo")
	private BigDecimal saldo;
	@Column(name = "cuen_cedula_propietario")
	private String cedula_propietario;
	
	
	
	
	
	public String getCuen_numero() {
		return cuen_numero;
	}
	public void setCuen_numero(String cuen_numero) {
		this.cuen_numero = cuen_numero;
	}
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedula_propietario() {
		return cedula_propietario;
	}
	public void setCedula_propietario(String cedula_propietario) {
		this.cedula_propietario = cedula_propietario;
	}
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [cuen_numero=" + cuen_numero + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo
				+ ", cedula_propietario=" + cedula_propietario + "]";
	}
	
	
	
	
	
	
}
