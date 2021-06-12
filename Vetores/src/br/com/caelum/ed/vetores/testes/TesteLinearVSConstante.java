package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorFirstForm;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteLinearVSConstante {

    public static void main(String[] args) {
        //Teste de velocidade implementação otimizada
        /*VetorSecondForm vetor = new VetorSecondForm();
        long inicio = System.currentTimeMillis();
        for(int i = 1; i < 100000; i++){
            Aluno aluno = new Aluno();
            vetor.add(aluno);//Testando da segunda maneira
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim = inicio) / 1000.0;
        System.out.println("Tempo em segundos = "+tempo);*/

        //Tempo de execução da primeira maneira 1.623334515471E9

        //Teste de velocidade implementação não otimizada
        VetorFirstForm vetor = new VetorFirstForm();
        long inicio = System.currentTimeMillis();
        for(int i = 1; i < 100000; i++){
            Aluno aluno = new Aluno();
            vetor.add(aluno);//Testando da segunda maneira
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim = inicio) / 1000.0;
        System.out.println("Tempo em segundos = "+tempo);
        //Tempo de execução da segunda maneira 1.623363524127E9

        System.out.println("Diferença de tempo = "+(1.623363524127E9-1.623334515471E9));
    }
}
