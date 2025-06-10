package br.com.first.gestorapi.application.api;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class FuncionarioResponse {
    private UUID idFuncionario;
}
