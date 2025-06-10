package br.com.first.gestorapi.application.api;

import br.com.first.gestorapi.domain.Funcionario;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@Getter
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nome;
    private String telefone;
    private Funcionario funcionario;
    private String designacao;
    private String salario;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarioList) {
        return funcionarioList.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }

    public FuncionarioListResponse(Funcionario Request) {
        this.idFuncionario = Request.getIdFuncionario();
        this.nome = Request.getNome();
        this.telefone = Request.getTelefone();
        this.designacao = Request.getDesignacao();
        this.salario = Request.getSalario();
        this.telefone = Request.getTelefone();
        this.endereco = Request.getEndereco();
    }

}
