package br.com.caelum.testes;

import br.com.caelum.mapa.Car;

import java.util.HashMap;

public class TesteHashMap {

    public static void main(String[] args) {
        HashMap<String, Car> mapa = new HashMap<String, Car>();

        mapa.put("abc1234" , new Car("a"));
        System.out.println(mapa);
        mapa.put("abc1234" , new Car("b"));
        System.out.println(mapa);
        mapa.put("abc1234" , new Car("c"));
        System.out.println(mapa);

        System.out.println(mapa.containsKey("abc1234"));
        System.out.println(mapa.get("abc1234"));
        mapa.remove("abc1234");
        System.out.println(mapa);
    }
}
