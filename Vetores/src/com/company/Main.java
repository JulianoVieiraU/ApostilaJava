package com.company;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorSecondForm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Exercicio 12
        //1)
        VetorSecondForm vetor = new VetorSecondForm();
        System.out.println("Tamanho do vetor antes de adicionar: "+vetor.size());
        for(int i = 0; i < 1000; i++){
            Aluno aluno = new Aluno();
            vetor.add(aluno);
        }

        //2)
        System.out.println("Tamanho do vetor apos adicionar: "+vetor.size());

        //3)
        VetorSecondForm newVetor = new VetorSecondForm();
        System.out.println("\nTamanho do vetor novo antes de adicionar: "+newVetor.size());
        newVetor = vetor;
        System.out.println("Tamanho do vetor novo apos adicionar: "+newVetor.size());

        //4)
        ArrayList list = new ArrayList();

        System.out.println("\nTamanho do ArrayList antes de adicionar: "+list.size());
        for(int i = 0; i < newVetor.size(); i++){
            list.add(newVetor.getAlunos(i));
        }
        System.out.println("Tamanho do ArrayList apos adicionar: "+list.size());

        //Exercicios opcionais
        //1)
        ArrayList<String> arrayString = new ArrayList<String>();

        arrayString.add("Ronaldo");
        arrayString.add("Messi");
        //Erro
        /*
        Aluno aluno = new Aluno();
        arrayString.add(aluno);
        */
        //Não podemos adicionar um objeto do tipo diferente do declarado na criação da lista
        //a propria ide vai me relatar que estou tentando add um tipo diferente do da declaração
        //um erro de compilação

        arrayString.remove(0);

        //Não precisa fazer casting para adicionar uma string, pois declaramos a lista
        //como uma lista de strings, logo precisamos passar apenas objetos do tipo string

        ListExcOpcionais listExc = new ListExcOpcionais();

        for(int i=0; i < 20; i++){
            if(i%2 == 0){
                listExc.add("String");
            }else{
                listExc.add("Ronaldo");
            }
        }

        System.out.println("\nLista com dados");
        System.out.println(listExc);

        //2)
        /*
        listExc.remove("Ronaldo");
        System.out.println("\nLista apos remover dados");
        System.out.println(listExc);
        */

        //3)
        /*
        listExc.clear();
        System.out.println("\nLista apos limpar toda a lista");
        System.out.println(listExc);
        */

        //4)
        listExc.indexOf("String");

        //5)
        listExc.lastIndexOf("Ronaldo");

        //6)
        //Analise amortizada, a eficiencia é melhor quando se dobra o tamanho, pois
        //a propria operação de se gerar mais espaço exige bastante processo,
        //uma vez que eu crio um novo array com espaço maior que o primeiro,
        //para poder pegar os valores e depois setar o primeiro vetor com esse novo espaço
        //então eu tenho dois vetores em um dado momento, seria melhor dobrar o tamanho,
        //pois eu diminuo a ocorrencia de gerar mais espaço, como o custo de inserir
        //um novo dado é constante ate que estoure o tamanho do vetor e precise criar
        //mais espaço novamente.

    }
}
