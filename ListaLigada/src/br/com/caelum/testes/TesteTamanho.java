package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteTamanho {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add("Paulo");
        System.out.println(list);
        System.out.println("Tamanho da lista: "+list.size());

        list.add("Camila");
        System.out.println(list);
        System.out.println("Tamanho da lista: "+list.size());
    }
}
