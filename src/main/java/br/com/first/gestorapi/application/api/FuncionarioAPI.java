package br.com.first.gestorapi.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest fucionarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionarioListResponse> getFuncionarios();

    @GetMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    FuncionarioDetalhadoResponse getFuncionarioPorId(@PathVariable @Valid UUID idFuncionario);

    @PatchMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    void patchAlteraFuncionario(@PathVariable UUID idFuncionario, @Valid @RequestBody FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);

    @DeleteMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaFuncionario(@PathVariable @Valid UUID idFuncionario);
}
