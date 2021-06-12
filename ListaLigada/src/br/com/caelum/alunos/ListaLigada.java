package br.com.caelum.alunos;

public class ListaLigada {
    private Celula first;
    private Celula last;
    private int size;

    public void add(Object element){
        if(this.size == 0){
            this.addFirst(element);
        }else{
            Celula newCel = new Celula(element);
            this.last.setNext(newCel);
            newCel.setPrevious(this.last);
            this.last = newCel;
            this.size++;
        }
    }

    public void add(int pos, Object element){
        if(pos == 0){
            this.addFirst(element);
        }else if(pos == this.size) {
            this.add(element);
        }else{
            Celula previous = this.getCelula(pos - 1);
            Celula next = previous.getNext();
            Celula newCel = new Celula(previous.getNext(), element);
            newCel.setPrevious(previous);
            previous.setNext(newCel);
            next.setPrevious(newCel);
            this.size++;
        }
    }

    public void addFirst(Object element){
        if(this.size == 0){
            Celula newCel = new Celula(element);
            this.first = newCel;
            this.last = newCel;
        }else{
            Celula newCel = new Celula(this.first, element);
            this.first.setPrevious(newCel);
            this.first = newCel;
        }

        this.size++;
    }

    public Object get(int pos){
        return this.getCelula(pos).getElement();
    }

    public void remove(int pos){
        if(!this.posTrue(pos)){
            throw new IllegalArgumentException("Posição não existe");
        }

        if(pos == 0){
            this.removeFirst();
        }else if(pos == this.size-1){
            this.removeLast();
        }else{
            Celula previous = this.getCelula(pos-1);
            Celula current = previous.getNext();
            Celula next = current.getNext();

            previous.setNext(next);
            next.setPrevious(previous);
            this.size--;
        }

    }

    public void removeFirst(){
        if(!this.posTrue(0)){
            throw new IllegalArgumentException("Posição não existe");
        }

        this.first = this.first.getNext();
        this.size--;

        if(this.size == 0){
            this.last = null;
        }
    }

    public void removeLast(){
        if(!this.posTrue(this.size - 1)){
            throw new IllegalArgumentException("Posição não existe");
        }

        if(this.size == 1){
            this.removeFirst();
        }else{
            Celula current = this.last.getPrevious();
            current.setNext(null);
            this.last = current;
            this.size--;
        }
    }

    private boolean posTrue(int pos){
        return pos >= 0 && pos < this.size;
    }

    private Celula getCelula(int pos){
        if(!this.posTrue(pos)){
            throw new IllegalArgumentException("Posição não existe");
        }

        Celula current = first;
        for(int i = 0; i < pos; i++){
            current = current.getNext();
        }

        return current;
    }

    public int size(){
        return this.size;
    }

    public boolean exists(Object element){
        Celula current = this.first;

        while(current != null){
            if(current.getElement().equals(element)){
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public String toString(){
        if(this.size == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula current = first;

        for(int i = 0; i < this.size - 1; i++){
            builder.append(current.getElement());
            builder.append(", ");
            current = current.getNext();
        }

        builder.append(current.getElement());
        builder.append("]");

        return builder.toString();
    }
}
