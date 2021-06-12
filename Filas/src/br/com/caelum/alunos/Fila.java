package br.com.caelum.alunos;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<Aluno> alunos = new LinkedList<Aluno>();

    public void add(Aluno object){
        this.alunos.add(object);
    }

    public Aluno remove(){
        return this.alunos.remove(0);
    }

    public boolean empty(){
        return this.alunos.size() == 0;
    }
}
