package controle;
//@autor Paula Bemiro

import modelos.Pessoa;
import publico.FormPrincipal;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static java.time.LocalDate.now;

public class ControlePessoa {
    static FormPrincipal executar;
    private int codCad = 0;
    private Integer id;
    private String nome;
    private Integer ddd;
    private Integer telefone;
    private Date dataNasc;
    private LocalDate dataCad;
    private LocalDate dataAtual;

    public ControlePessoa(int codCad, Integer id, String nome, Integer ddd, Integer telefone, Date dataNasc, LocalDate dataCad, LocalDate dataAtual) {
        this.codCad = codCad;
        this.id = id;
        this.nome = nome;
        this.ddd = ddd;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCad = dataCad;
        this.dataAtual = dataAtual;
    }

}
