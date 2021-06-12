package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteRemoveDoFim {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add("Paulo");
        list.add("Ana");
        list.add("Maria");
        list.add("Ronaldo");

        System.out.println(list);

        list.removeLast();

        System.out.println(list);
    }
}
