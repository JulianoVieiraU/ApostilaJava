package br.com.caelum.alunos;

public class Celula {
    private Celula next;
    private Celula previous;
    private Object element;

    public Celula(Celula next, Object element){
        this.next = next;
        this.element = element;
    }

    public Celula(Object element){
        this.element = element;
    }

    public void setNext(Celula next){
        this.next = next;
    }

    public Celula getNext(){
        return next;
    }

    public void setPrevious(Celula previous){
        this.previous = previous;
    }

    public Celula getPrevious(){
        return previous;
    }

    public Object getElement(){
        return element;
    }
}
