package com.example.demo.service;

import com.example.demo.modelo.RegistroTransferencia;

public interface IRegistroService {

	public void agregar(RegistroTransferencia registroTransferenecia);
	public void modificar(RegistroTransferencia registroTransferencia);
	
	public RegistroTransferencia buscar(Integer id);
	public void eliminar(Integer id);
}
