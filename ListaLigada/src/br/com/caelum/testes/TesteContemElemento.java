package br.com.caelum.testes;

import br.com.caelum.alunos.ListaLigada;

public class TesteContemElemento {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        list.add("Rafael");
        list.add("Paulo");
        System.out.println(list);

        System.out.println(list.exists("Rafael"));
        System.out.println(list.exists("Camila"));
    }
}
