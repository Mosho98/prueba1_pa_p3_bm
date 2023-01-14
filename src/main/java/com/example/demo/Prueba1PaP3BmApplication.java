package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IRegistroService;
import com.example.demo.service.RealizarTransferencia;

@SpringBootApplication
public class Prueba1PaP3BmApplication implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRegistroService iRegistroService;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3BmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNombrePropietario("Bryan");
		cuenta1.setCuen_numero("12345");
		cuenta1.setCedula_propietario("1753054285");
		cuenta1.setTipoCuenta("A");
		cuenta1.setSaldo(new BigDecimal(150));
		//this.bancariaService.agregar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNombrePropietario("Fernando");
		cuenta2.setCuen_numero("1234567");
		cuenta2.setCedula_propietario("17455765");
		cuenta2.setTipoCuenta("C");
		cuenta2.setSaldo(new BigDecimal(200));
		//this.bancariaService.agregar(cuenta2);
		
//		RealizarTransferencia op1 = new RealizarTransferencia();
//		op1.realizar("12345", "1234567", new BigDecimal(50));
		
		
		CuentaBancaria buscar = this.bancariaService.buscar("12345");
		System.out.println(buscar);
	}

}
