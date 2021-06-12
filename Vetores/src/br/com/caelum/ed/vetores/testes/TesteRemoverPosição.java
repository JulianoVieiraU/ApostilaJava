package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

public class TesteRemoverPosição {

    public static void main(String[] args) {
        //Remover um aluno por posição
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");

        VetorSecondForm list = new VetorSecondForm();

        list.add(a1);
        list.add(a2);

        System.out.println("Remover um aluno por posição");
        System.out.println("\nLista antes Remove");
        System.out.println(list);

        list.remove(0);

        System.out.println("\nLista apos Remove");
        System.out.println(list);

        //Retorn [PAulo]
    }
}
