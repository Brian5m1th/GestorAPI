package br.com.first.gestorapi.application.service;

import br.com.first.gestorapi.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {

    void salva(Funcionario funcionario);

    List<Funcionario> findByAll();

    Funcionario findById(UUID idFuncionario);
}
