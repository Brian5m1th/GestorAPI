package br.com.first.gestorapi.application.service;

import br.com.first.gestorapi.application.api.FuncionarioRequest;
import br.com.first.gestorapi.application.api.FuncionarioResponse;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

}
