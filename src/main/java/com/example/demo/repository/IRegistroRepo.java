package com.example.demo.repository;

import com.example.demo.modelo.RegistroTransferencia;

public interface IRegistroRepo {
	public void insertar(RegistroTransferencia registroTransferencia);
	public void actualziar(RegistroTransferencia registroTransferencia);
	
	public RegistroTransferencia buscar(Integer id);
	public void eliminar(Integer id);
}
