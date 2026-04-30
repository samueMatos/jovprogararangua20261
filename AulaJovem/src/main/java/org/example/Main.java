package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> usuarios = new ArrayList<>();


        //Exemplo de inicialização de lista
        //  List<String> listaPreenchida = List.of("Samuel|0634154654654|Ruyaasldjk","Item2","Item3");


        System.out.println("============================");
        System.out.println("BEM VINDO AO SISTEMA DE USUÁRIO!");
        System.out.println("============================");

        int opcao = 0;

        while (opcao != 10) {
            exibirMenu();

            System.out.println("Escolha uma opção: ");

            if (scan.hasNextInt()) {
                opcao = scan.nextInt();
                scan.nextLine();

            } else {
                System.out.println("Por favor digite uma opção valida!");
                scan.nextLine();
                continue;
            }

            switch (opcao){
                case 1 :
                    cadastrarUsuario(scan,usuarios);
                    break;
                case 2:
                    listarTodosUsuarios(usuarios);
                    break;
                case 3:
                    //Consultar por nome
                    break;
                case 10:
                    System.out.println("Encerrando o sistema .... Até logo!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
        scan.close();
    }


    public static void exibirMenu() {

        System.out.println("=============MENU===========");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Listar todos");
        System.out.println("3 - buscar por nome");
        System.out.println("10 - Sair");
        System.out.println("===========================");
    }

    public static void cadastrarUsuario(Scanner scan, List<String> usuarios){
        String dados = "";

        System.out.println("---Cadastro de USUÁRIO---");

        System.out.println("Digite o nome: ");
        dados = scan.nextLine();

        System.out.println("Digite o CPF: ");
        dados += " | " + scan.nextLine();

        System.out.println("Digite o endereço: ");
        dados += " | " + scan.nextLine();

        System.out.println("Digite o E-mail: ");
        String email = scan.nextLine();
        if(email.contains("@")) {
            dados += " | " + email;
        }else {
            System.out.println("E-mail é invalido");
        }

        System.out.println("Digite o Telefone: ");
        dados += " | " + scan.nextLine();

        usuarios.add(dados);

        System.out.println("Usuário salvo com SUCESSO!");
    }

    public static void listarTodosUsuarios(List<String> usuarios){

        System.out.println("Lista de usuários");

        if (usuarios.isEmpty()){
            System.out.println("Nenhum usuário encontrado!");
        }else {

            for (int i = 0; i< usuarios.size();i++){
                System.out.println( "Código: " +  (i +1) +". " + usuarios.get(i).toString() );
            }

        }


    }






}