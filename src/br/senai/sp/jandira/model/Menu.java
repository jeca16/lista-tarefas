package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    
    Tarefas tarefasObj = new Tarefas();
    int resposta;
    public void Menu(){


     while (true){
         System.out.println("----------------------------------------------------------------------------------");
         System.out.println("                                 Bem vindo, o que deseja?");
         System.out.println("[1-Adicionar uma tarefa, 2-listar tarefas, 3-Ver as tarefas pendentes, 4-Alterar tarefa]");
         System.out.println("----------------------------------------------------------------------------------");
         resposta = teclado.nextInt();

         if (resposta == 1){
             Tarefas tarefas = tarefasObj.NovaTarefa();
             tarefasObj.adicionarTarefa(tarefas);
         } else if (resposta == 2) {
             tarefasObj.listarTarefas();
         } else if (resposta == 3) {
             
         } else if (resposta == 4) {
             tarefasObj.alterarResponsavel();
         } else{


         }
     }

    }
}
