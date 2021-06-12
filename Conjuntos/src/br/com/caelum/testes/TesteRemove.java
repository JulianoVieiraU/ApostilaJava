package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;

import java.util.List;

public class TesteRemove {
    public static void main(String[] args) {
        ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");

        List<String> words = conjunto.getAll();

        System.out.println("Antes de remover");
        for(String word : words){
            System.out.println(word);
        }

        conjunto.remove("Rafael");

        words = conjunto.getAll();

        System.out.println("\nDepois de remover");
        for(String word : words){
            System.out.println(word);
        }
    }
}
