package com.folha.boot.dao;

import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
