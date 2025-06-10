package br.com.first.gestorapi.application.service;

import br.com.first.gestorapi.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {

    void salva(Funcionario funcionario);

    List<Funcionario> findByAll();
}
