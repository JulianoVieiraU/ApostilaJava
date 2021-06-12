package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteAdicionaPorPosição {

    public static void main(String[] args) {
        //Adiciona em uma dada posição
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");
        a3.setName("Ana");

        VetorSecondForm list = new VetorSecondForm();

        list.add(a1);
        list.add(0, a2);
        list.add(1, a3);

        System.out.println("Adiciona em uma dada posição");
        System.out.println(list);

        //Retorn [Paulo, Ana, Rafael]

    }
}
