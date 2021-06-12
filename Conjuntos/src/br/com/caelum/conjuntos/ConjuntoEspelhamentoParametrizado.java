package br.com.caelum.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspelhamentoParametrizado<T> {

    private List<List<T>> tabela = new ArrayList<List<T>>();
    private int size = 0;

    public ConjuntoEspelhamentoParametrizado(){
        for(int i = 0; i < 26; i++){
            LinkedList<T> lista = new LinkedList<T>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(T t){
        int codigoDeEspelhamento = t.hashCode();
        codigoDeEspelhamento = Math.abs(codigoDeEspelhamento);
        return codigoDeEspelhamento % this.tabela.size();
    }

    private void redimensionarTabela(int novaCapacidade){
        List<T> object = this.getAll();
        this.tabela.clear();

        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<T>());
        }

        for(T t : object){
            this.add(t);
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

    public void add(T t){
        if(!exists(t)) {
            this.verificaCarga();
            int indice = this.calculaIndiceDaTabela(t);
            List<T> lista = this.tabela.get(indice);
            lista.add(t);
            this.size++;
        }
    }

    public void remove(T t){
        if(this.exists(t)){
            int indice =  this.calculaIndiceDaTabela(t);
            List<T> lista = this.tabela.get(indice);
            lista.remove(t);
            this.size--;
            this.verificaCarga();
        }
    }

    public boolean exists(T t){
        int indice =  this.calculaIndiceDaTabela(t);
        List<T> lista = this.tabela.get(indice);

        return lista.contains(t);
    }

    public List<T> getAll(){
        List<T> objects = new ArrayList<T>();
        for(int i = 0; i < this.tabela.size(); i++){
            objects.addAll(this.tabela.get(i));
        }

        return objects;
    }

    public int size(){
        return this.size;
    }

    public void print(){
        for(List<T> lista : this.tabela){
            System.out.print("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

}
