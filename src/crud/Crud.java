package crud;

//@author Paula Belmiro

import java.util.ArrayList;
import java.util.Scanner;

 
public class Crud {

    
    public static void main(String[] args) {
        
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        
    boolean sair = false;
    Scanner scanner = new Scanner(System.in);
    
    int opcao = 0;
    
        while(!sair){
        System.out.println("Bem Vindo, digite a opção desejada:");
        System.out.println("1 -Adicionar Cadastro");
        System.out.println("2 -Mostrar Cadastros");
        System.out.println("3 -Lista Cadastros");
        System.out.println("4 -Sair");
        
        opcao = scanner.nextInt();
    if (opcao == 4) break;
    if (opcao == 1) {    
    Scanner cadastro = new Scanner(System.in);
      
    System.out.println("Digite o nome:");
    pessoa.setNome(cadastro.next());
    System.out.println("Digite a Cidade");
    pessoa.setCidade(cadastro.next());
    System.out.println("Digite a UF");
    pessoa.setUf(cadastro.next());
    listaPessoa.add(pessoa);
    System.out.println(listaPessoa);
    }
    if (opcao == 2){System.out.println(listaPessoa);}
      
        }
}
}