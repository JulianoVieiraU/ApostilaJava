package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorFirstForm;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TestePega {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setName("Rafael");

        VetorFirstForm vetor1 = new VetorFirstForm();
        VetorSecondForm vetor2 = new VetorSecondForm();

        //TEstando metodo get com primeira forma
        /*vetor1.add(a1);
        vetor1.getAlunos(0);
        vetor1.getAlunos(1);
        vetor1.getAlunos(1000000000);*/

        //TEstando metodo get com segunda forma
        vetor2.add(a1);
        vetor2.getAlunos(0);
        vetor2.getAlunos(1);
        vetor2.getAlunos(1000000000);
    }
}
