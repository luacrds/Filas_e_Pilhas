package Atividade_1;

import java.util.Stack;
import java.util.Scanner;

public class Atividade_Pilha {
	
	  public static void main(String[] args) {
	        Stack<String> pilhaLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcaoMenu = -1;

	        while (opcaoMenu != 0) {
	            System.out.println("\n=== Menu ===");
	            System.out.println("1 - Adicionar Livro");
	            System.out.println("2 - Listar Livros");
	            System.out.println("3 - Retirar Livro");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcaoMenu = scanner.nextInt();
	            scanner.nextLine();

	            if (opcaoMenu == 1) {
	                System.out.print("Digite o nome do livro: ");
	                String nomeLivro = scanner.nextLine();
	                pilhaLivros.push(nomeLivro);
	                System.out.println(nomeLivro + " foi adicionado à pilha!");
	            } else if (opcaoMenu == 2) {
	                if (pilhaLivros.isEmpty()) {
	                    System.out.println("A pilha está vazia!");
	                } else {
	                    System.out.println("Livros na pilha:");
	                    for (String livro : pilhaLivros) {
	                        System.out.println(livro);
	                    }
	                }
	            } else if (opcaoMenu == 3) {
	                if (pilhaLivros.isEmpty()) {
	                    System.out.println("A pilha está vazia, não há livros para retirar!");
	                } else {
	                    String livroRetirado = pilhaLivros.pop();
	                    System.out.println("Livro retirado: " + livroRetirado);
	                }
	            } else if (opcaoMenu == 0) {
	                System.out.println("Até logo!");
	            } else {
	                System.out.println("Opção inválida! Tente novamente.");
	            }
	        }

	        scanner.close();
	    }
	}


