package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	
	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	

	@Override
	public void agregar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.insertar(cuentaBancaria);
	}

	@Override
	public void modificar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.actualziar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.bancariaRepo.eliminar(numero);
	}

}
