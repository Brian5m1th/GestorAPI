package br.com.first.gestorapi.application.api;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class FuncionarioRequest {
    private String nome;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;
}
