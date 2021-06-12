package br.com.caelum.testes;

import br.com.caelum.mapa.Car;
import br.com.caelum.mapa.MapaLista;

public class TesteTempoMapaLista {
    public static void main(String[] args) {

        MapaLista mapaLista = new MapaLista();
        int numeroDeElementos = 15000;
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            mapaLista.add(""+i, new Car("c"+i));
        }

        for(int i = 0; i < numeroDeElementos; i++){
            mapaLista.get(""+i);
        }

        for(int i = 0; i < numeroDeElementos; i++){
            mapaLista.exists(""+i);
        }

        for(int i = 0; i < numeroDeElementos; i++){
            mapaLista.remove(""+i);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: "+(fim-inicio)/1000.0);

        //Tempo de ciclo: 1.767
    }
}
