package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;

import java.util.List;

public class TesteContem {

    public static void main(String[] args) {
        ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");

        List<String> words = conjunto.getAll();

        for(String word : words){
            System.out.println(word);
        }

        System.out.println("\nContem Rafael no conjunto = "+conjunto.exists("Rafael"));
        System.out.println("Contem Ana no conjunto = "+conjunto.exists("Ana"));
        System.out.println("Contem Pedro no conjunto = "+conjunto.exists("Pedro"));
    }
}
