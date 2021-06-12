package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class VetorObjects {

    private Object[] objects = new Object[100];
    private int size = 0;

    public void add(Aluno object){
        this.setEpace();
        this.objects[this.size] = object;
        this.size++;
    }

    public void add(int pos, Object object){
        this.setEpace();
        if(!posTrue(pos)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = this.size-1; i >= pos; i--){
            this.objects[i + 1] = this.objects[i];
        }

        this.objects[pos] = object;
        this.size++;
    }

    private boolean posTrue(int pos){
        return pos >= 0 && pos < this.size;
    }

    public Object getObjects(int pos){
        if(!this.posExists(pos)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.objects[pos];
    }

    private boolean posExists(int pos){
        return pos >= 0 && pos < this.size;
    }

    public void remove(int pos){
        if(!this.posExists(pos)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = pos; i < this.size; i++){
            this.objects[i] = this.objects[i + 1];
        }

        this.size --;
    }

    public boolean exists(Object object){
        for(int i=0; i < this.size; i++){
            if(this.objects[i] != null) {
                if (object.equals(this.objects[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size(){
        return this.size;
    }

    public String toString(){
        if(this.size == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(int i = 0; i < this.size-1; i++){
            builder.append(this.objects[i]);
            builder.append(", ");
        }

        builder.append(this.objects[this.size - 1]);
        builder.append("]");

        return builder.toString();
    }

    private void setEpace(){
        if(this.size == this.objects.length) {
            Object[] newArray = new Object[this.objects.length * 2];

            for (int i = 0; i < this.objects.length; i++) {
                newArray[i] = this.objects[i];
            }

            this.objects = newArray;
        }
    }
}
