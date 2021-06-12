package br.com.caelum.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspelhamentoDinamica {

    private List<List<String>> tabela = new ArrayList<List<String>>();
    private int size = 0;

    public ConjuntoEspelhamentoDinamica(){
        for(int i = 0; i < 26; i++){
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(String word){
        int codigoDeEspelhamento = this.calculaCodigoDeEspelhamento(word);
        codigoDeEspelhamento = Math.abs(codigoDeEspelhamento);
        return codigoDeEspelhamento % this.tabela.size();
    }

    private int calculaCodigoDeEspelhamento(String word){
        int codigo = 1;
        for(int i = 0; i < word.length(); i++){
            codigo = 31 * codigo + word.charAt(i);
        }
        return codigo;
    }

    private void redimensionarTabela(int novaCapacidade){
        List<String> words = this.getAll();
        this.tabela.clear();

        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<String>());
        }

        for(String word : words){
            this.add(word);
        }
    }

    private void verificaCarga(){
        int capacidade = this.tabela.size();
        double carga = (double) this.size / capacidade;

        if(carga > 0.75){
            this.redimensionarTabela(capacidade * 2);
        }else if(carga < 0.25){
            this.redimensionarTabela(Math.max(capacidade / 2, 10));
        }
    }

    public void add(String word){
        if(!exists(word)) {
            verificaCarga();
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
            verificaCarga();
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
