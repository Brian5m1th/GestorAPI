package br.com.first.gestorapi.application.api;

import br.com.first.gestorapi.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest fucionarioRequest) {
        log.info("[start] FuncionarioController - postFuncionario");
        FuncionarioResponse criaFuncionario = funcionarioService.criaFuncionario(fucionarioRequest);
        log.info("[finish] FuncionarioController - postFuncionario");
        return criaFuncionario;
    }

    @Override
    public List<FuncionarioListResponse> getFuncionario() {
        log.info("[start] FuncionarioController - getFuncionario");
        List<FuncionarioListResponse> beneficiarios = funcionarioService.buscarTodosBeneficiarios();
        log.info("[finish] FuncionarioController - getFuncionario");
        return beneficiarios;
    }

    }

