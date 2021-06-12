package br.com.caelum.pecas.com.caelum.testes;

import br.com.caelum.pecas.Peca;

import br.com.caelum.pilhas.PilhaGenerica;

public class TestePilhaGenerica {

    public static void main(String[] args) {
        PilhaGenerica pilha = new PilhaGenerica();

        Peca peca = new Peca();
        pilha.add(peca);

        Object pecaRemovida = pilha.remove();

        if(peca != pecaRemovida){
            System.out.println("Erro: a peça removida não é igual a que foi inserida");
        }

        if(!pilha.empty()){
            System.out.println("Erro: a pilha não esta vazia");
        }
    }
}
