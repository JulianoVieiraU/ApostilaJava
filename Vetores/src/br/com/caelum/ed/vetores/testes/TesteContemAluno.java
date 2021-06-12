package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteContemAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");

        VetorSecondForm list = new VetorSecondForm();

        list.add(a1);
        list.add(a2);
        System.out.println("Verificar se a lista contem um dado aluno");
        System.out.println(list.exists(a1));
        System.out.println(list.exists(a2));

        Aluno a3 = new Aluno();
        a3.setName("Ana");
        System.out.println(list.exists(a3));

        //Retorno true \n true \n false
    }
}
