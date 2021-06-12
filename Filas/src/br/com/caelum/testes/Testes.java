package br.com.caelum.testes;

import br.com.caelum.alunos.Aluno;
import br.com.caelum.alunos.FilaParametrizada;

import java.util.LinkedList;
import java.util.Queue;

public class Testes {
    public static void main(String[] args) {
        FilaParametrizada<Aluno> fila = new FilaParametrizada<Aluno>();

        Aluno aluno = new Aluno();
        fila.add(aluno);

        Aluno alunoRemovido = fila.remove();

        if(fila.empty()){
            System.out.println("A fila esta vazia");
        }

        FilaParametrizada<String> filaDeString = new FilaParametrizada<String>();

        filaDeString.add("Rafael Cosetino");
        filaDeString.add("Paulo Silveira");

        if(filaDeString.empty()){
            System.out.println("A fila esta vazia");
        }

        String paulo = filaDeString.remove();
        String rafael = filaDeString.remove();

        System.out.println(paulo);
        System.out.println(rafael);

        Queue<Aluno> filaJava = new LinkedList<Aluno>();

        Aluno alunoQueue = new Aluno();
        filaJava.offer(alunoQueue);

        Aluno alunoQueueRemovido = filaJava.poll();

        if(filaJava.isEmpty()){
            System.out.println("A fila esta vazia");
        }
    }
}
