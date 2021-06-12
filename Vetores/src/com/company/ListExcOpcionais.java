package com.company;

import br.com.caelum.ed.Aluno;

public class ListExcOpcionais {
    private Object[] objects = new Object[100];
    private int size = 0;

    public void add(Object obj){
        this.objects[this.size] = obj;
        size++;
    }

    //2)
    public void remove(Object obj){
        for(int i = 0; i < this.size; i++){
            if(this.objects[i] == obj){
                for(int j = i; j < this.size; j++){
                    this.objects[j] = this.objects[j+1];
                }
            }
            size--;
        }
    }

    //3)
    public void clear(){
        while(size > 0) {
            for (int i = 0; i < size; i++) {
                this.objects[i] = null;
                this.size--;
                break;
            }
        }
    }

    //4)
    public void indexOf(Object obj){
        for(int i = 0; i < size; i++){
            if(this.objects[i] == obj){
                //somente para teste se esta retornando a posição da primeira ocorrencia
                System.out.println(i);
                //
                break;
            }
        }
    }

    //5)
    public void lastIndexOf(Object obj){
        for(int i = size - 1; i >= 0; i--){
            if(this.objects[i] == obj){
                //somente para teste se esta retornando a posição da ultima ocorrencia
                System.out.println(i);
                //
                break;
            }
        }
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
}
