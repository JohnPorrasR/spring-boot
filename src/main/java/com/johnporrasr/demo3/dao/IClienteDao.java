package com.johnporrasr.demo3.dao;

import java.util.List;

import com.johnporrasr.demo3.identity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);

}
