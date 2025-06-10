package br.com.first.gestorapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@ToString
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class fucionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idFucionario", updatable = false, unique = true, nullable = false)
    private UUID idFucionario;
    private String nome;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;
}
