package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteRemovePorPosicao {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add("Paulo");
        list.add("Camila");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
