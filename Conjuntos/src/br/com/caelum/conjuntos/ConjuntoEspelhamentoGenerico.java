package br.com.caelum.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspelhamentoGenerico {

    private List<List<Object>> tabela = new ArrayList<List<Object>>();
    private int size = 0;

    public ConjuntoEspelhamentoGenerico(){
        for(int i = 0; i < 26; i++){
            LinkedList<Object> lista = new LinkedList<Object>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(Object obj){
        int codigoDeEspelhamento = obj.hashCode();
        codigoDeEspelhamento = Math.abs(codigoDeEspelhamento);
        return codigoDeEspelhamento % this.tabela.size();
    }

    private void redimensionarTabela(int novaCapacidade){
        List<Object> object = this.getAll();
        this.tabela.clear();

        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<Object>());
        }

        for(Object obj : object){
            this.add(obj);
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

    public void add(Object obj){
        if(!exists(obj)) {
            this.verificaCarga();
            int indice = this.calculaIndiceDaTabela(obj);
            List<Object> lista = this.tabela.get(indice);
            lista.add(obj);
            this.size++;
        }
    }

    public void remove(Object obj){
        if(this.exists(obj)){
            int indice =  this.calculaIndiceDaTabela(obj);
            List<Object> lista = this.tabela.get(indice);
            lista.remove(obj);
            this.size--;
            this.verificaCarga();
        }
    }

    public boolean exists(Object obj){
        int indice =  this.calculaIndiceDaTabela(obj);
        List<Object> lista = this.tabela.get(indice);

        return lista.contains(obj);
    }

    public List<Object> getAll(){
        List<Object> objects = new ArrayList<Object>();
        for(int i = 0; i < this.tabela.size(); i++){
            objects.addAll(this.tabela.get(i));
        }

        return objects;
    }

    public int size(){
        return this.size;
    }

    public void print(){
        for(List<Object> lista : this.tabela){
            System.out.print("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

}
