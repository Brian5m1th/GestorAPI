package br.com.first.gestorapi.application.infra;

import br.com.first.gestorapi.application.service.FuncionarioRepository;
import br.com.first.gestorapi.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJpaRepository funcionarioSpringDataJpaRepository;

    @Override
    public void salva(Funcionario funcionario) {
        funcionarioSpringDataJpaRepository.save(funcionario);
    }

}
