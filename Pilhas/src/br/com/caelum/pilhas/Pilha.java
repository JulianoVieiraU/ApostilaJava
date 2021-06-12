package br.com.caelum.pilhas;

import br.com.caelum.pecas.Peca;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<Peca> pecas = new LinkedList<Peca>();

    public void add(Peca p){
        this.pecas.add(p);
    }

    public Peca remove(){
        return this.pecas.remove(this.pecas.size() - 1);
    }

    public boolean empty(){
        return this.pecas.size() == 0;
    }
}
