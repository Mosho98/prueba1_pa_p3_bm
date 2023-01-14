package com.example.demo.service;

import java.math.BigDecimal;


public interface IRealizarTransferencia {

	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	
}
