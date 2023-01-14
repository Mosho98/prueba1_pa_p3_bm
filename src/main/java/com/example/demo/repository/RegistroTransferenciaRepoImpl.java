package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.RegistroTransferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RegistroTransferenciaRepoImpl implements IRegistroRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registroTransferencia);
	}

	@Override
	public void actualziar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(registroTransferencia);
	}

	@Override
	public RegistroTransferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(RegistroTransferencia.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		RegistroTransferencia registro = this.buscar(id);
		this.entityManager.refresh(registro);
	}
	
	
	

}
