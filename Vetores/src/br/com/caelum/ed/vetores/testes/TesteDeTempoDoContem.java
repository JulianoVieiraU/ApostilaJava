package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorFirstForm;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteDeTempoDoContem {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        //Adiconando e testando da forma nao otimizada
        ///*
        VetorFirstForm vetor = new VetorFirstForm();

        for(int i = 0; i < 30000; i++){
            Aluno aluno = new Aluno();
            vetor.add(aluno);
            if(!vetor.exists(aluno)){
                System.out.println("Erro: aluno "+aluno+" não foi adicionado.");
            }
        }

        for(int i = 0; i < 30000; i++) {
            Aluno aluno = new Aluno();
            if (vetor.exists(aluno)) {
                System.out.println("Erro: aluno " + aluno + " foi adicionado.");
            }
        }
        //---------------------
        //*/

        //Adiconando e testando da forma otimizada
        /*
        VetorSecondForm vetor = new VetorSecondForm();
        for(int i = 0; i < 30000; i++){
            Aluno aluno = new Aluno();
            vetor.add(aluno);
            if(!vetor.exists(aluno)){
                System.out.println("Erro: aluno "+aluno+" não foi adicionado.");
            }
        }

        for(int i = 0; i < 30000; i++) {
            Aluno aluno = new Aluno();
            if (vetor.exists(aluno)) {
                System.out.println("Erro: aluno " + aluno + " foi adicionado.");
            }
        }
        */

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;

        System.out.println("Tempo = "+tempo);

        System.out.println("Diferença de tempo = "+(1.017-0.595));

        //Tempo da forma não otimizada 1.017
        //Tempo da segunda forma 0.595
    }
}
