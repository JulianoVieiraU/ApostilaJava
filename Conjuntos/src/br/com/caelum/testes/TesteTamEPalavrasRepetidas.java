package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;

import java.util.List;

public class TesteTamEPalavrasRepetidas {

    public static void main(String[] args) {
        ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");

        List<String> words = conjunto.getAll();

        for(String word : words){
            System.out.println(word);
        }

        System.out.println(conjunto.size());

        conjunto.add("Ana");

        System.out.println(conjunto.size());
    }
}
