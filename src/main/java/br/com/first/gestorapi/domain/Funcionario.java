package br.com.first.gestorapi.domain;

import br.com.first.gestorapi.application.api.FuncionarioRequest;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@ToString
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idFucionario", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    private String nome;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;


    public Funcionario(FuncionarioRequest Request) {
        this.nome = Request.getNome();
        this.designacao = Request.getDesignacao();
        this.salario = Request.getSalario();
        this.telefone = Request.getTelefone();
        this.endereco = Request.getEndereco();
    }
}
