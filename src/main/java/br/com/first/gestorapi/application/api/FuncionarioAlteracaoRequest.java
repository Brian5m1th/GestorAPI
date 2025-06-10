package br.com.first.gestorapi.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class FuncionarioAlteracaoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;
    @NotBlank
    private String designacao;

}
