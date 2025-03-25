package Atividade_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_Fila {
	
	public static void main (String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
		Scanner scannerCliente = new Scanner(System.in);
		int opcaoMenu = -1;
		
		while (opcaoMenu != 0) {
			System.out.println("\n=== Menu ===");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Chamar Cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = scannerCliente.nextInt();
            scannerCliente.nextLine();

			if (opcaoMenu == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scannerCliente.nextLine();
                filaClientes.add(nomeCliente);
                System.out.println(nomeCliente + " foi adicionado à fila!");
            } else if (opcaoMenu == 2) {
                if (filaClientes.isEmpty()) {
                    System.out.println("A fila está vazia!");
                } else {
                    System.out.println("Clientes na fila: " + filaClientes);
                }
            } else if (opcaoMenu == 3) {
                if (filaClientes.isEmpty()) {
                    System.out.println("Não há clientes para chamar!");
                } else {
                    String clienteChamado = filaClientes.poll();
                    System.out.println("Chamando: " + clienteChamado);
                }
            } else if (opcaoMenu == 0) {
                System.out.println("Até logo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scannerCliente.close();
    }
}
