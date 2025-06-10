package br.com.first.gestorapi.application.api;

import br.com.first.gestorapi.domain.Funcionario;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class FuncionarioDetalhadoResponse {
    private String nome;
    private String telefone;
    private String designacao;
    private String salario;
    private String endereco;

    public FuncionarioDetalhadoResponse(Funcionario Request) {
        this.nome = Request.getNome();
        this.telefone = Request.getTelefone();
        this.designacao = Request.getDesignacao();
        this.salario = Request.getSalario();
        this.endereco = Request.getEndereco();
    }
}
