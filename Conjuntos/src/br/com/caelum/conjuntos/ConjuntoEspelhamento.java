package br.com.caelum.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class ConjuntoEspelhamento {

    private List<List<String>> tabela = new ArrayList<List<String>>();
    private int size = 0;

    public ConjuntoEspelhamento(){
        for(int i = 0; i < 26; i++){
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(String word){
        return word.toLowerCase().charAt(0) % 26;
    }

    public void add(String word){
        if(!exists(word)) {
            int indice = this.calculaIndiceDaTabela(word);
            List<String> lista = this.tabela.get(indice);
            lista.add(word);
            this.size++;
        }
    }

    public void remove(String word){
        if(this.exists(word)){
            int indice =  this.calculaIndiceDaTabela(word);
            List<String> lista = this.tabela.get(indice);
            lista.remove(word);
            this.size--;
        }
    }

    public boolean exists(String word){
        int indice =  this.calculaIndiceDaTabela(word);
        List<String> lista = this.tabela.get(indice);

        return lista.contains(word);
    }

    public List<String> getAll(){
        List<String> words = new ArrayList<String>();
        for(int i = 0; i < this.tabela.size(); i++){
            words.addAll(this.tabela.get(i));
        }

        return words;
    }

    public int size(){
        return this.size;
    }

    public void print(){
        for(List<String> lista : this.tabela){
            System.out.print("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.print("*");
            }
            System.out.println("]");
        }
    }
}
