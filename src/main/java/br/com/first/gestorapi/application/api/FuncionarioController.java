package br.com.first.gestorapi.application.api;

import br.com.first.gestorapi.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FucionarioAPI {
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest fucionarioRequest) {
        log.info("[start] FuncionarioController - postFuncionario");
        FuncionarioResponse criaFuncionario = funcionarioService.criaFuncionario(fucionarioRequest);
        log.info("[finish] FuncionarioController - postFuncionario");
        return criaFuncionario;
    }

}
