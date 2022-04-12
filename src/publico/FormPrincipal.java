package publico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelos.Pessoa;
import controle.ControlePessoa;

import static java.time.LocalDate.now;

public class FormPrincipal {

   static ControlePessoa cadastrar;
    boolean sair = false;
    Scanner scanner = new Scanner(System.in);
    int opcao;
    private int codCad = 0;
    public ArrayList<Pessoa> pessoa = new ArrayList<>();

    public FormPrincipal() {


        while(!sair) {

            System.out.println("Digite a opção desejada:");
            System.out.println("1 -Adicionar Cadastro");
            System.out.println("2 -Excluir Cadastro");
            System.out.println("3 -Lista Cadastros");
            System.out.println("4 -Sair");

            opcao = scanner.nextInt();
            if (opcao == 4) break;
            if (opcao == 1){this.codCad++;
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
                System.out.println("Cadastro adicionado com sucesso!");}
            if (opcao == 2){ exclCad();}
            if (opcao == 3){
                System.out.println(pessoa);
            }
        }
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


