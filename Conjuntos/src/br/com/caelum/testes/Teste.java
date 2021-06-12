package br.com.caelum.testes;

import br.com.caelum.conjuntos.ConjuntoEspelhamento;

public class Teste {

    public static void main(String[] args) {
        ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();

        conjunto.add("palavra");
        conjunto.add("computador");
        conjunto.add("apostila");
        conjunto.add("instrutor");
        conjunto.add("mesa");
        conjunto.add("telefone");

        if(!conjunto.exists("apostila")){
            System.out.println("Erro: não tem a palavra: apostila");
        }

        conjunto.remove("apostila");

        if(conjunto.exists("apostila")){
            System.out.println("Erro: não tem a palavra: apostila");
        }

        if(conjunto.size() != 5){
            System.out.println("Erro: o tamanho do conjunto deveria ser 5");
        }
    }
}
