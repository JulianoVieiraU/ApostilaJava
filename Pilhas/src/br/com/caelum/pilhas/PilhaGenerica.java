package br.com.caelum.pilhas;

import java.util.LinkedList;
import java.util.List;

public class PilhaGenerica {

    private List<Object> objects = new LinkedList<Object>();

    public void add(Object o){
        this.objects.add(o);
    }

    public Object remove(){
        return this.objects.remove(this.objects.size() - 1);
    }

    public boolean empty(){
        return this.objects.size() == 0;
    }
}
