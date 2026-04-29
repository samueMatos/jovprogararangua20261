import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("============================");
    	System.out.println("BEM VINDO AO SISTEMA DE USUÁRIO!");
    	System.out.println("============================");   	
    	
    	int opcao = 0;
    	
    	while(opcao!= 4) {
    		exibirMenu();
    		
    		System.out.println("Escolha uma opção: ");
    		
    		if(scan.hasNextInt()) {
    			opcao = scan.nextInt();
    			scan.nextLine();
    			
    		}else {
    			System.out.println("Por favor digiti uma opção valida!");
    			scan.nextLine();
    			continue;
    		}
    		
    		System.out.println(opcao);
    		
    		
    		
    	}
    	
    	    	    	
    }
    
    
    public static void exibirMenu() {
    	
    	System.out.println("=============MENU===========");
    	System.out.println("1 - Cadastro");
    	System.out.println("2 - Listar todos");
    	System.out.println("3 - buscar por nome");
    	System.out.println("4 - Sair");
    	System.out.println("===========================");
    }
    
    
    
}