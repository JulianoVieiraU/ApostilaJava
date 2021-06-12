package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TestePegaPorPosição {

    public static void main(String[] args) {
        //Pegar um aluno por posição
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");

        VetorSecondForm list = new VetorSecondForm();

        list.add(a1);
        list.add(a2);

        Aluno a3 = (Aluno)list.getAlunos(0);
        Aluno a4 = (Aluno)list.getAlunos(1);

        System.out.println("Pegar um aluno por posição");
        System.out.println(a3);
        System.out.println(a4);

        //Return Rafael \n Paulo

    }
}
