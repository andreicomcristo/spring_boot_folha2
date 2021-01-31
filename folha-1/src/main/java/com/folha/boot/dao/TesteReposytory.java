package com.folha.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folha.boot.domain.Departamento;


public interface TesteReposytory extends JpaRepository<Departamento, Long>{

}
