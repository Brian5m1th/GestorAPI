package br.com.first.gestorapi.application.service;

import br.com.first.gestorapi.application.api.FuncionarioAlteracaoRequest;
import br.com.first.gestorapi.application.api.FuncionarioListResponse;
import br.com.first.gestorapi.application.api.FuncionarioRequest;
import br.com.first.gestorapi.application.api.FuncionarioResponse;
import br.com.first.gestorapi.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Log4j2
@Service
public class BeneficiarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] BeneficiarioApplicationService - criaFuncionario");
        Funcionario funcionario = new Funcionario(funcionarioRequest);
        funcionarioRepository.salva(funcionario);
        log.info("[finish] BeneficiarioApplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> buscarTodosFuncionarios() {
        log.info("[start] BeneficiarioApplicationService - buscarTodosFuncionarios");
        List<Funcionario> beneficiarioList = funcionarioRepository.findByAll();
        log.info("[finish] BeneficiarioApplicationService - buscarTodosFuncionarios");
        return FuncionarioListResponse.converte(beneficiarioList);
    }

    @Override
    public Funcionario buscarBeneficiarioPorId(UUID idFuncionario) {
        log.info("[start] BeneficiarioApplicationService - buscarBeneficiarioPorId");
        Funcionario funcionarioPorId = funcionarioRepository.findById(idFuncionario);
        log.info("[finish] BeneficiarioApplicationService - buscarBeneficiarioPorId");
        return funcionarioPorId;
    }

    @Override
    public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[start] BeneficiarioApplicationService - patchAlteraFuncionario");
        Funcionario funcionario = funcionarioRepository.findById(idFuncionario);
        funcionario.altera(funcionarioAlteracaoRequest);
        funcionarioRepository.salva(funcionario);
        log.info("[finish] BeneficiarioApplicationService - patchAlteraFuncionario");
    }

    @Override
    public void deleta(UUID idFuncionario) {
        log.info("[start] BeneficiarioApplicationService - deleta");
        Funcionario funcionario =  funcionarioRepository.findById(idFuncionario);
        funcionarioRepository.delete(funcionario);
        log.info("[finish] BeneficiarioApplicationService - deleta");
    }

}
