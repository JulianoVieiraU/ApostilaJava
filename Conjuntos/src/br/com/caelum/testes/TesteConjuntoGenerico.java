package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;
import br.com.caelum.conjuntos.ConjuntoEspelhamentoGenerico;

public class TesteConjuntoGenerico {
    public static void main(String[] args) {
        ConjuntoEspelhamentoGenerico conjunto = new ConjuntoEspelhamentoGenerico();

        conjunto.add("Rafael");
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");

        System.out.println(conjunto.getAll());
    }
}
