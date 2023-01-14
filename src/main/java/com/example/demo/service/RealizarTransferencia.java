package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;

@Service
public class RealizarTransferencia implements IRealizarTransferencia{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
//	@Autowired
//	@Qualifier("A")
//	private ICuentaBancariaService bancariaServiceAhorro;
//	
//	@Autowired
//	@Qualifier("C")
//	private ICuentaBancariaService bancariaServiceCorriente;
//	
    
	CuentaBancaria cuenta = new CuentaBancaria();
	
	@Override
	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
			
			CuentaBancaria cuenta = this.bancariaService.buscar(cuentaOrigen);
			System.out.println("Cuenta antes: " + cuenta);
			BigDecimal op= cuenta.getSaldo();
			BigDecimal res = op.subtract(monto);
			cuenta.setSaldo(res);
			this.bancariaService.modificar(cuenta);
			System.out.println("Cuenta despues: " + cuenta );
			
			CuentaBancaria cuentaD = this.bancariaService.buscar(cuentaDestino);
			BigDecimal saldo = cuentaD.getSaldo();
			BigDecimal nuevo = saldo.add(monto);
			cuentaD.setSaldo(nuevo);
			this.bancariaService.modificar(cuentaD);
		
	}
	
}
