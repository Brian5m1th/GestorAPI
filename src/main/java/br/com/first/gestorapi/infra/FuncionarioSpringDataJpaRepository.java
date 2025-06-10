package br.com.first.gestorapi.infra;

import br.com.first.gestorapi.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioSpringDataJpaRepository extends JpaRepository<Funcionario, UUID> {
    Optional<Funcionario> findByIdFuncionario(UUID idFuncionario);
}
