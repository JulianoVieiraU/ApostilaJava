package br.com.caelum.mapa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspelhamento {
    private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();

    public MapaEspelhamento(){
        for(int i = 0; i < 100; i++){
            this.tabela.add(new LinkedList<Associacao>());
        }
    }

    private int calculaIndiceDaTabela(String placa){
        return Math.abs(placa.hashCode()) % this.tabela.size();
    }

    public void add(String placa, Car car){
        if(this.exists(placa)){
            this.remove(placa);
        }

        int indice = this.calculaIndiceDaTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);
        lista.add(new Associacao(placa, car));
    }

    public Car get(String placa){
        int indice = this.calculaIndiceDaTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            Associacao associacao = lista.get(i);
            if(associacao.getPlaca().equals(placa)){
                return associacao.getCar();
            }
        }

        throw new IllegalArgumentException("A chave não existe");
    }

    public boolean exists(String placa){
        int indice = this.calculaIndiceDaTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            Associacao associacao = lista.get(i);
            if(associacao.getPlaca().equals(placa)){
                return true;
            }
        }

        return false;
    }

    public void remove(String placa){
        int indice = this.calculaIndiceDaTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            Associacao associacao = lista.get(i);
            if(associacao.getPlaca().equals(placa)){
                lista.remove(i);
                return;
            }
        }

        throw  new IllegalArgumentException("A chave não existe");
    }
}
