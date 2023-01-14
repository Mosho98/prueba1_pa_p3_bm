package com.example.demo.service;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void agregar(CuentaBancaria cuentaBancaria);
	public void modificar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String numero);
	public void eliminar(String numero);
}
