package br.com.first.gestorapi.infra;

import br.com.first.gestorapi.application.service.FuncionarioRepository;
import br.com.first.gestorapi.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

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

}
