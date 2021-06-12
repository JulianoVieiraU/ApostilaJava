package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TestePegaPorPosicao {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add("Paulo");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
