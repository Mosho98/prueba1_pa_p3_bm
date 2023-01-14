package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.RegistroTransferencia;
import com.example.demo.repository.IRegistroRepo;

@Service
public class RegistroTransferenciaServiceImpl implements IRegistroService{

	@Autowired
	private IRegistroRepo iRegistroRepo;
	
	@Override
	public void agregar(RegistroTransferencia registroTransferenecia) {
		// TODO Auto-generated method stub
		this.iRegistroRepo.insertar(registroTransferenecia);
	}

	@Override
	public void modificar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.iRegistroRepo.actualziar(registroTransferencia);
	}

	@Override
	public RegistroTransferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRegistroRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iRegistroRepo.eliminar(id);
	}

}
