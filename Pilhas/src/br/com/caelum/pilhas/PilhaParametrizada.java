package br.com.caelum.pilhas;

import java.util.LinkedList;
import java.util.List;

public class PilhaParametrizada<T> {
    private List<T> objects = new LinkedList<T>();

    public void add(T t){
        this.objects.add(t);
    }

    public T remove(){
        return this.objects.remove(this.objects.size() - 1);
    }

    public boolean empty(){
        return this.objects.size() == 0;
    }
}
