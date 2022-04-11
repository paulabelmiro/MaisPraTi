package modelos;
//@autor Paula Bemiro

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    private Integer id;
    private String nome;
    private Integer ddd;
    private Integer telefone;
    private String dataNasc;
    private LocalDate dataCad;
    private LocalDate dataAtual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public LocalDate getDataCad() {
        return dataCad;
    }

    public void setDataCad(LocalDate dataCad) {
        this.dataCad = dataCad;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }

   @Override
    public String toString() {
       return  "____________________________________________________________________"+
              '\n' + "* Código do Cadastro: "  + id + '\n' +
                "- Nome Completo: " + nome + '\n' +
                "- Telefone: " + "(" +ddd+ ")" + telefone + '\n' +
                "- Data de nascimento = " + dataNasc + '\n' +
                "- Cadastro realizado em " + dataCad + '\n' +
                "- Última atualização em " + dataAtual + '\n';
    }
}
