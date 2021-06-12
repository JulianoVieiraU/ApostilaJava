package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;
import br.com.caelum.conjuntos.ConjuntoEspelhamentoDinamica;
import br.com.caelum.conjuntos.ConjuntoEspelhamentoEficiente;

public class TesteDesempenho {
    public static void main(String[] args) {
        //Utilizando conjunto simples
        ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++){
            conjunto.add("palavra" + i);
        }

        for(int i = 0; i < 50000; i++){
            conjunto.exists("palavra" + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo Conjunto Simples: "+((fim - inicio) / 1000.0));

        //Utilizando conjunto otimizado

        ConjuntoEspelhamentoEficiente conjuntoEficiente = new ConjuntoEspelhamentoEficiente();

        inicio = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++){
            conjuntoEficiente.add("palavra" + i);
        }

        for(int i = 0; i < 50000; i++){
            conjuntoEficiente.exists("palavra" + i);
        }

        fim = System.currentTimeMillis();

        System.out.println("\nTempo Conjunto Eficiente: "+((fim - inicio) / 1000.0));

        //Utilizando conjunto dinamico

        ConjuntoEspelhamentoDinamica conjuntoDinamico = new ConjuntoEspelhamentoDinamica();

        inicio = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++){
            conjuntoDinamico.add("palavra" + i);
        }

        for(int i = 0; i < 50000; i++){
            conjuntoDinamico.exists("palavra" + i);
        }

        fim = System.currentTimeMillis();

        System.out.println("\nTempo Conjunto Dinamico: "+((fim - inicio) / 1000.0));
    }
}
