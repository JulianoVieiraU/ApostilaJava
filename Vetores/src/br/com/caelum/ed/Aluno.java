package br.com.caelum.ed;

public class Aluno {

    public String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public boolean equals(Object o){
        Aluno other = (Aluno)o;
        return this.name.equals(other.name);
    }
}
