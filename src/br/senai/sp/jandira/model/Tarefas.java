package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Tarefas {

    public String titulo, descricao;
    int dataDeInicio, dataDeVencimento;
    Scanner teclado = new Scanner(System.in);
    public void NovaTarefa(){
        System.out.println("--------------Tarefa-----------------");
        System.out.println("Qual o titulo da tarefa? ");
        titulo = teclado.next();
        System.out.println("Descreva o intuíto da tarefa: ");
        descricao = teclado.next();
        System.out.println("Data de inicio: ");
        dataDeInicio = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Data de vencimento: ");
        dataDeVencimento = teclado.nextInt();
        teclado.nextLine();
    }

    public void listarTarefas(){

    }

}
