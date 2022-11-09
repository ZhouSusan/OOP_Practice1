package org.example;

public class Main {
    public static void main(String[] args) {

        Piano piano = new Piano("Piano");
        Pianist john = new Pianist(piano, "John");
        john.play();

        Drum drums = new Drum("Drums");
        Drummer emma = new Drummer(drums, "Emma");
        emma.play();
    }
}