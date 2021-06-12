package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add("Paulo");

        System.out.println(list);

        list.add("Ronaldo");

        System.out.println(list);
    }
}
