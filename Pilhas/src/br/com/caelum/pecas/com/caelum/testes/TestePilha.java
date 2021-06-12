package br.com.caelum.pecas.com.caelum.testes;

import br.com.caelum.pecas.Peca;
import br.com.caelum.pilhas.Pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        Peca peca = new Peca();
        pilha.add(peca);

        Peca pecaRemovida = pilha.remove();

        if(peca != pecaRemovida){
            System.out.println("Erro: a peça removida não é igual a que foi inserida");
        }

        if(!pilha.empty()){
            System.out.println("Erro: a pilha não esta vazia");
        }
    }
}
