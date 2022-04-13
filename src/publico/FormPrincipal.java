package publico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import modelos.Pessoa;
import controle.ControlePessoa;

import static java.time.LocalDate.now;

public class FormPrincipal {

    boolean sair = false;
    Scanner scanner = new Scanner(System.in);
    int opcao;
    private int codCad = -1;
    public ArrayList<Pessoa> pessoa = new ArrayList<>();

    public FormPrincipal() {


        while(!sair) {

            System.out.println("_MENU_______________________________________________________________");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 -Adicionar Cadastro");
            System.out.println("2 -Listar Cadastros");
            System.out.println("3 -Alterar Cadastro");
            System.out.println("4 -Excluir Cadastro");
            System.out.println("0 -Sair");
            System.out.println("____________________________________________________________________");

            opcao = scanner.nextInt();
            if (opcao == 0) break;
            if (opcao == 1) {addCad();}
            if (opcao == 2) {System.out.println(pessoa);}
            if (opcao == 3) {alteraCad();}
            if (opcao == 4) {exclCad();}
        }
    }

    public void addCad(){
            this.codCad++;
            Pessoa novaPessoa = new Pessoa();
            Scanner cadastro = new Scanner(System.in);
            novaPessoa.setId(this.codCad);
            System.out.println("Digite o nome completo:");
            novaPessoa.setNome(cadastro.nextLine());
            System.out.println("Digite o código de área de seu telefone - DDD:");
            novaPessoa.setDdd(Integer.valueOf(cadastro.next()));
            System.out.println("Digite o número de seu telefone:");
            novaPessoa.setTelefone(Integer.valueOf(cadastro.next()));
            System.out.println("Digite sua data de nascimento:(ddmmaaaa)");
            novaPessoa.setDataNasc(cadastro.next());
            novaPessoa.setDataCad(now());
            novaPessoa.setDataAtual(now());
            pessoa.add(novaPessoa);
            System.out.println("Cadastro adicionado com sucesso!");
    }

    public void alteraCad(){
        Pessoa altPessoa = new Pessoa();
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Digite o código do cadastro que deseja alterar:");
        int altCod = scanner.nextInt();
                altPessoa.setId(altCod);
                System.out.println("Digite o novo nome completo:");
                altPessoa.setNome(cadastro.nextLine());
                System.out.println("Digite o novo DDD do telefone:");
                altPessoa.setDdd(Integer.valueOf(cadastro.next()));
                System.out.println("Digite o número de seu telefone:");
                altPessoa.setTelefone(Integer.valueOf(cadastro.next()));
                System.out.println("Digite a nova data de nascimento:(ddmmaaaa)");
                altPessoa.setDataNasc(cadastro.next());
                altPessoa.setDataCad(now()); //ainda não consegui puxar a data original.
                altPessoa.setDataAtual(now());
                pessoa.set(altCod, altPessoa);
                System.out.println("Cadastro "+altCod + " alterado com sucesso!");
        }

    public void exclCad(){
        Scanner cadastro = new Scanner(System.in);
        Iterator<Pessoa> i = pessoa.iterator();
        System.out.println("Digite o código do cadastro que deseja excluir:");
        int altCod = scanner.nextInt();
        while(i.hasNext()){
            Pessoa alt = i.next();
            if(alt.getId() == altCod){
                i.remove();
            }
        }
        System.out.println("Cadastro "+altCod + " excluído com sucesso!");
        }


    }



