package br.com.caelum.alunos;

import java.util.LinkedList;
import java.util.List;

public class FilaParametrizada<T> {

    private List<T> objects = new LinkedList<T>();

    public void add(T object){
        this.objects.add(object);
    }

    public T remove(){
        return this.objects.remove(0);
    }

    public boolean empty(){
        return this.objects.size() == 0;
    }
}
