package br.com.caelum.alunos;

import java.util.ArrayList;
import java.util.List;

public class FilaComArrayList {
    private List<Aluno> alunos = new ArrayList<Aluno>();

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
