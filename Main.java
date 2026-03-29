/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.raquel.projetoto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Activities> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int option = -1;
        while (option != 0) {
            System.out.println("\n---Menu do metodo TO-DO list---");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefa");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("0 - Sair");
            System.out.println("Escolha:");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Descricao da tarefa: ");
                    String desc = scanner.nextLine();
                    lista.add(new Activities(desc));
                    System.out.println("Tarefa adicionada!!!!");
                    break;

                case 2:
                    System.out.println("\n Suas Tarefas: ");
                    if (lista.isEmpty()) {
                        System.out.println("A lista esta vazia, Raquel");
                    }
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ". " + lista.get(i));
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println(
                                "Lista vazia raquel ");
                    } else {
                        System.out.println("Indice da tarefa para concluir: ");
                    }
                    int index = scanner.nextInt();

                    if (index >= 0 && index < lista.size()) {
                        lista.get(index).concluida();
                        System.out.println("Tarefa concluida");

                    } else {
                        System.out.println("Indice invalido, raquel");
                    }

                    break;

                case 0:
                    System.out.println("Saindoooooo raquellll");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }
        System.out.println(
                "Ate logo, javeiro ou melhor Raquel!!");
        scanner.close();

    }
}
