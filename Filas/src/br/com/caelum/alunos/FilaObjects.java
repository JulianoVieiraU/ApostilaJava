package br.com.caelum.alunos;

import java.util.LinkedList;
import java.util.List;

public class FilaObjects {

    private List<Aluno> objects = new LinkedList<Aluno>();

    public void add(Aluno object){
        this.objects.add(object);
    }

    public Aluno remove(){
        return this.objects.remove(0);
    }

    public boolean empty(){
        return this.objects.size() == 0;
    }
}
