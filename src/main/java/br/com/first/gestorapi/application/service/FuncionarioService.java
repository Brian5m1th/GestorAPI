package br.com.first.gestorapi.application.service;

import br.com.first.gestorapi.application.api.FuncionarioListResponse;
import br.com.first.gestorapi.application.api.FuncionarioRequest;
import br.com.first.gestorapi.application.api.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

}
