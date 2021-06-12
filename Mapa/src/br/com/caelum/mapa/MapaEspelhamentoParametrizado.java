package br.com.caelum.mapa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspelhamentoParametrizado<C, V> {
    private List<List<AssociacaoParametrizada<C, V>>> tabela = new ArrayList<List<AssociacaoParametrizada<C, V>>>();

    public MapaEspelhamentoParametrizado(){
        for(int i = 0; i < 100; i++){
            this.tabela.add(new LinkedList<AssociacaoParametrizada<C, V>>());
        }
    }

    private int calculaIndiceDaTabela(C chave){
        return Math.abs(chave.hashCode()) % this.tabela.size();
    }

    public void add(C chave, V valor){
        if(this.exists(chave)){
            this.remove(chave);
        }

        int indice = this.calculaIndiceDaTabela(chave);
        List<AssociacaoParametrizada<C, V>> lista = this.tabela.get(indice);
        lista.add(new AssociacaoParametrizada<>(chave, valor));
    }

    public V get(C chave){
        int indice = this.calculaIndiceDaTabela(chave);
        List<AssociacaoParametrizada<C, V>> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            AssociacaoParametrizada associacao = lista.get(i);
            if(associacao.getChave().equals(chave)){
                return (V) associacao.getValor();
            }
        }

        throw new IllegalArgumentException("A chave não existe");
    }

    public boolean exists(C chave){
        int indice = this.calculaIndiceDaTabela(chave);
        List<AssociacaoParametrizada<C, V>> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            AssociacaoParametrizada associacao = lista.get(i);
            if(associacao.getChave().equals(chave)){
                return true;
            }
        }

        return false;
    }

    public void remove(C chave){
        int indice = this.calculaIndiceDaTabela(chave);
        List<AssociacaoParametrizada<C, V>> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            AssociacaoParametrizada associacao = lista.get(i);
            if(associacao.getChave().equals(chave)){
                lista.remove(i);
                return;
            }
        }

        throw  new IllegalArgumentException("A chave não existe");
    }
}
