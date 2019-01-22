package com.johnporrasr.demo3.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.johnporrasr.demo3.identity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

}
