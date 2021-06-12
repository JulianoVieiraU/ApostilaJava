package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteAdicionaNoComeco {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.addFirst("Rafael");
        list.addFirst("Paulo");

        System.out.println(list);

        list.addFirst("Ronaldo");

        System.out.println(list);

    }
}
