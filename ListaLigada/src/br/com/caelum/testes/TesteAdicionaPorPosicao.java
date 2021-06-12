package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add(0,"Paulo");
        list.add(1,"Camila");
        System.out.println(list);

        list.add(1,"Ronaldo");
        System.out.println(list);
    }
}
