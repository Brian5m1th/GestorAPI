package br.com.first.gestorapi.application.infra;

import br.com.first.gestorapi.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioSpringDataJpaRepository extends JpaRepository<Funcionario, UUID> {

}
