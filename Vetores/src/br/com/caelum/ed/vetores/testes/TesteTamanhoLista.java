package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteTamanhoLista {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");

        VetorSecondForm list = new VetorSecondForm();

        list.add(a1);
        list.add(a2);
        System.out.println("Informar tamanaho da lista");
        System.out.println(list.size());

        list.add(a3);
        System.out.println(list.size());

        //REtorno 2 \n 3
    }
}
