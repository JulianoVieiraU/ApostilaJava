package br.com.caelum.mapa;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {
    private List<Associacao> associacoes = new ArrayList<Associacao>();

    public void add(String placa, Car car){
        if(!this.exists(placa)){
            Associacao associacao = new Associacao(placa, car);
            this.associacoes.add(associacao);
        }
    }

    public Car get(String placa){
        for(Associacao associacao : this.associacoes){
            if(placa.equals(associacao.getPlaca())){
                return associacao.getCar();
            }
        }

        throw new IllegalArgumentException("Chave não existe");
    }

    public void remove(String placa){
        if(this.exists(placa)){
            for(int i = 0; i < this.associacoes.size(); i++) {
                Associacao associacao = this.associacoes.get(i);

                if(placa.equals(associacao)){
                    this.associacoes.remove(i);
                }
            }
        }else{
            throw new IllegalArgumentException("Cjave não existe");
        }
    }

    public boolean exists(String placa){
        for(Associacao associacao : this.associacoes){
            if(placa.equals(associacao.getPlaca())){
                return true;
            }
        }

        return false;
    }

    public int size(){
        return this.associacoes.size();
    }
}
