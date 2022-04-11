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
    //public static void preencherCad(){}

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

    public void cadastrarPessoa(Integer id, String nome, Integer ddd, Integer telefone, Date dataNasc, LocalDate dataCad, LocalDate dataAtual){
        this.id = id;
        this.nome = nome;
        this.ddd = ddd;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCad = dataCad;
        this.dataAtual = dataAtual;
        Pessoa novaPessoa = new Pessoa();
        Scanner cadastro = new Scanner(System.in);
        novaPessoa.setId(this.codCad);
        System.out.println("Digite o nome completo:");
        novaPessoa.setNome(cadastro.next());
        System.out.println("Digite o código de área de seu telefone - DDD:");
        novaPessoa.setDdd(Integer.valueOf(cadastro.next()));
        System.out.println("Digite o número de seu telefone:");
        novaPessoa.setTelefone(Integer.valueOf(cadastro.next()));
        System.out.println("Digite sua data de nascimento:(ddmmaaaa)");
        novaPessoa.setDataNasc(cadastro.next());
        novaPessoa.setDataCad(now());
        novaPessoa.setDataAtual(now());
        executar.pessoa.add(novaPessoa);
        System.out.println("Cadastro adicionado com sucesso!");
    }
    public static void alterarPessoa(){
    }
    public static void excluirPessoa(){
    }
}
