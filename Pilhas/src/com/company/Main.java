package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cryptography crip = new Cryptography();
        String text = "Uma mensagem confidencial";
        crip.criptography(text);
        System.out.println(crip);

        crip.deCriptography();
        System.out.println(crip);
    }
}
