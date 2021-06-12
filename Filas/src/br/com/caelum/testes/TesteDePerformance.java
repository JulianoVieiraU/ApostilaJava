package br.com.caelum.testes;

import br.com.caelum.alunos.Aluno;
import br.com.caelum.alunos.Fila;
import br.com.caelum.alunos.FilaComArrayList;

public class TesteDePerformance {

    public static void main(String[] args) {
        Fila filaLinked = new Fila();
        FilaComArrayList filaArray = new FilaComArrayList();
        int maxSize = 100000;

        //Adicionando

        System.out.println("Diferença de tempo adicionando elementos");

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < maxSize; i++){
            Aluno aluno = new Aluno();
            filaLinked.add(aluno);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo adicionar Fila com LinkedList: "+((fim-inicio)/1000.0));

        inicio = System.currentTimeMillis();

        for(int i = 0; i < maxSize; i++){
            Aluno aluno = new Aluno();
            filaArray.add(aluno);
        }

        fim = System.currentTimeMillis();

        System.out.println("Tempo adicionar Fila com ArrayList: "+((fim-inicio)/1000.0));

        //------------------

        //Removendo

        System.out.println("\nDiferença de tempo removendo elementos");

        inicio = System.currentTimeMillis();

        while(!filaLinked.empty()) {
            filaLinked.remove();
        }

        fim = System.currentTimeMillis();

        System.out.println("Tempo remover Fila com LinkedList: "+((fim-inicio)/1000.0));

        inicio = System.currentTimeMillis();

        while(!filaArray.empty()) {
            filaArray.remove();
        }

        fim = System.currentTimeMillis();

        System.out.println("Tempo remover Fila com ArrayList: "+((fim-inicio)/1000.0));

        //----------------
    }
}
