package br.com.first.gestorapi.application.api;

import br.com.first.gestorapi.application.service.FuncionarioService;
import br.com.first.gestorapi.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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
    public List<FuncionarioListResponse> getFuncionarios() {
        log.info("[start] FuncionarioController - getFuncionario");
        List<FuncionarioListResponse> beneficiarios = funcionarioService.buscarTodosFuncionarios();
        log.info("[finish] FuncionarioController - getFuncionario");
        return beneficiarios;
    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionarioPorId(UUID idFuncionario) {
        log.info("[start] FuncionarioController - getFuncionarioPorId");
        Funcionario funcionarioPorId = funcionarioService.buscarBeneficiarioPorId(idFuncionario);
        log.info("[finish] FuncionarioController - getFuncionarioPorId");
        return new FuncionarioDetalhadoResponse(funcionarioPorId);
    }

    @Override
    public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[start] FuncionarioController - patchAlteraFuncionario");
        funcionarioService.patchAlteraFuncionario(idFuncionario, funcionarioAlteracaoRequest);
        log.info("[finish] FuncionarioController - patchAlteraFuncionario");
    }

}

