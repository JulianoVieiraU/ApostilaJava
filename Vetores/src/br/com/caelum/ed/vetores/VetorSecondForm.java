package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class VetorSecondForm {
    private Aluno[] alunos = new Aluno[100];
    private int size = 0;

    public void add(Aluno aluno){
        this.setEpace();
        this.alunos[this.size] = aluno;
        this.size++;
    }

    public void add(int pos, Aluno aluno){
        this.setEpace();
        if(!posTrue(pos)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = this.size-1; i >= pos; i--){
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[pos] = aluno;
        this.size++;
    }

    private boolean posTrue(int pos){
        return pos >= 0 && pos < this.size;
    }

    public Object getAlunos(int pos){
        if(!this.posExists(pos)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[pos];
    }

    private boolean posExists(int pos){
        return pos >= 0 && pos < this.size;
    }

    public void remove(int pos){
        if(!this.posExists(pos)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = pos; i < this.size; i++){
            this.alunos[i] = this.alunos[i + 1];
        }

        this.size --;
    }

    public boolean exists(Aluno aluno){
        for(int i=0; i < this.size; i++){
            if(this.alunos[i] != null) {
                if (aluno == this.alunos[i]) {
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
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.size - 1]);
        builder.append("]");

        return builder.toString();
    }

    private void setEpace(){
        if(this.size == this.alunos.length) {
            Aluno[] newArray = new Aluno[this.alunos.length * 2];

            for (int i = 0; i < this.alunos.length; i++) {
                newArray[i] = this.alunos[i];
            }

            this.alunos = newArray;
        }
    }
}
