package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> vetor = new ArrayList<String>();
        LinkedList<String> lista = new LinkedList<String>();

        //adicionando no começo
        System.out.println("Adicionando no inicio");
        int numeroDeElementos = 40000;

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            vetor.add(0, ""+i);
        }

        long fim = System.currentTimeMillis();
        long time = (long) ((fim - inicio) / 1000.0);
        System.out.println("Vetor adiciona no começo: "+(fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            lista.add(0, ""+i);
        }

        fim = System.currentTimeMillis();
        time = (long) ((fim - inicio) / 1000.0);
        System.out.println("Lista ligada adiciona no começo: "+(fim - inicio) / 1000.0);

        //percorrendo
        System.out.println("\nPercorrendo elementos");
        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            vetor.get(i);
        }

        fim = System.currentTimeMillis();
        time = (long) ((fim - inicio) / 1000.0);
        System.out.println("Vetor percorrendo: "+(fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            lista.get(i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Lista ligada percorrendo: "+(fim - inicio) / 1000.0);

        //Removendo do começo
        System.out.println("\nRemovendo do inicio");

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            vetor.remove(0);
        }

        fim = System.currentTimeMillis();
        time = (long) ((fim - inicio) / 1000.0);
        System.out.println("Vetor removendo inicio: "+(fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            lista.remove(0);
        }

        fim = System.currentTimeMillis();
        System.out.println("Lista ligada removendo inicio: "+(fim - inicio) / 1000.0);

    }
}
