package br.com.first.gestorapi.application.service;

import br.com.first.gestorapi.application.api.FuncionarioAlteracaoRequest;
import br.com.first.gestorapi.application.api.FuncionarioListResponse;
import br.com.first.gestorapi.application.api.FuncionarioRequest;
import br.com.first.gestorapi.application.api.FuncionarioResponse;
import br.com.first.gestorapi.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscarTodosFuncionarios();

    Funcionario buscarBeneficiarioPorId(UUID idFuncionario);

    void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);

    void deleta(UUID idFuncionario);
}
