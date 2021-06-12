package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class VetorFirstForm {

    private Aluno[] alunos = new Aluno[100000];

    public void add(Aluno aluno){
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] == null){
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public void add(int pos, Aluno aluno){
        if(pos >= 0 && pos < this.alunos.length){
            for (int i = pos; i < this.alunos.length; i++){

            }
        }
    }

    public Aluno getAlunos(int pos){
        if(pos >= 0 && pos < this.alunos.length){
            if(this.alunos[pos] != null){
                return this.alunos[pos];
            }
        }

        return null;
    }

    public void remove(int pos){
        if(pos >= 0 && pos < this.alunos.length) {
            this.alunos[pos] = null;
        }
    }

    public boolean exists(Aluno aluno){
        for(int i = 0; i < this.alunos.length; i++){
            if(aluno == this.alunos[i]){
                return true;
            }
        }

        return false;
    }

    public int size(){
        int cont = 0;
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] != null){
                cont++;
            }
        }

        return cont;
    }

    public String toString(){
        if(this.alunos[0] == null){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(int i = 0; i < this.alunos.length-1; i++){
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.alunos.length - 1]);
        builder.append("]");

        return builder.toString();
    }
}
