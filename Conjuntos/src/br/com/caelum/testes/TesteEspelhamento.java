package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;
import br.com.caelum.conjuntos.ConjuntoEspelhamentoEficiente;

public class TesteEspelhamento {
    public static void main(String[] args) {
        ConjuntoEspelhamentoEficiente conjunto = new ConjuntoEspelhamentoEficiente();
        ConjuntoEspelhamento conjunto2 = new ConjuntoEspelhamento();

        for(int i = 0; i < 100; i++){
            conjunto.add(""+i);
        }

        for(int i = 0; i < 100; i++){
            conjunto2.add(""+i);
        }

        System.out.println("Lsita otimizada!!!");
        conjunto.print();

        System.out.println("\nLista não otimizada!!!");
        conjunto2.print();
    }
}
