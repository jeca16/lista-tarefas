package br.senai.sp.jandira.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    public String titulo, descricao, dataDeInicio, dataDeVencimento, responsavel, resposta;
    Scanner teclado = new Scanner(System.in);
    public Tarefas NovaTarefa(){
        Tarefas tarefas = new Tarefas();
        System.out.println("--------------Tarefa-----------------");
        System.out.println("Qual o titulo da tarefa? ");
        tarefas.titulo = teclado.next();
        System.out.println("Descreva o intuíto da tarefa: ");
        tarefas.descricao = teclado.next();
        System.out.println("Data de inicio: ");
        tarefas.dataDeInicio = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Data de vencimento: ");
        tarefas.dataDeVencimento = teclado.nextLine();
        System.out.println(" A tarefa tem um responsavel pela conclusão? (S - N)");
        tarefas.resposta = teclado.nextLine();

        if (tarefas.resposta.equalsIgnoreCase("S")){
            System.out.println("Digite o nome do responsavel:");
            tarefas.responsavel = teclado.nextLine();
        } else{
            tarefas.resposta.equalsIgnoreCase("N");
        }

        return tarefas;
    }

    List <Tarefas> listTarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefas tarefas){
        listTarefas.add(tarefas);
    }

    public void listarTarefas(){
        for (Tarefas tarefas : listTarefas){
            System.out.println(tarefas.titulo);
            System.out.println(tarefas.descricao);
            System.out.println(tarefas.dataDeInicio);
            System.out.println(tarefas.dataDeVencimento);
            System.out.println(tarefas.responsavel);
        }
    }


    public void alterarTarefa(){

        System.out.println("O que deseja mudar? [1- ]");
        resposta = teclado.nextLine();




    }



    }
