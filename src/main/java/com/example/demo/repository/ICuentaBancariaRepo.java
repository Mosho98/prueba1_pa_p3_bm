package com.example.demo.repository;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {

	public void insertar(CuentaBancaria cuentaBancaria);
	public void actualziar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String numero);
	public void eliminar(String numero);
}
