package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    
    Tarefas tarefas = new Tarefas();
    int resposta;
    public void Menu(){

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                                 Bem vindo, o que deseja?");
        System.out.println("[1-Adicionar uma tarefa, 2-Ver as tarefas pendentes, 3-Ver as tarefas finalizadas]");
        System.out.println("----------------------------------------------------------------------------------");
        
        if (resposta == 1){
            tarefas.NovaTarefa();
        } else if (resposta == 2) {
            
        }
    }
}
