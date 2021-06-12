package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteAdicionaNoFim {

    public static void main(String[] args) {
        //Adiciona no fim da fila
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");

        VetorSecondForm list = new VetorSecondForm();

        list.add(a1);
        list.add(a2);

        System.out.println("Adiciona no fim da fila");
        System.out.println(list);

        //Return [Rafael, Paulo]
    }
}
