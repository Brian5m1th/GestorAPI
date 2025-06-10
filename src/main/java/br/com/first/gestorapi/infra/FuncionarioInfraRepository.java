package br.com.first.gestorapi.infra;

import br.com.first.gestorapi.application.service.FuncionarioRepository;
import br.com.first.gestorapi.domain.Funcionario;
import br.com.first.gestorapi.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJpaRepository funcionarioSpringDataJpaRepository;

    @Override
    public void salva(Funcionario funcionario) {
        funcionarioSpringDataJpaRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> findByAll() {
        log.info("[start] FuncionarioInfraRepository - findByAll");
        List<Funcionario> funcionarioList = funcionarioSpringDataJpaRepository.findAll();
        log.info("[finish] FuncionarioInfraRepository - findByAll");
        return funcionarioList;
    }

    @Override
    public Funcionario findById(UUID idFuncionario) {
        log.info("[start] FuncionarioInfraRepository - findById");
        Funcionario funcionario = funcionarioSpringDataJpaRepository.findByIdFuncionario(idFuncionario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Cliente não encontrado"  ));
        log.info("[finish] FuncionarioInfraRepository - findById");
        return funcionario;
    }

}
