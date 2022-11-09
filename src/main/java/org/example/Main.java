package org.example;

public class Main {
    public static void main(String[] args) {
        Drum drums = new Drum("Drums");
        Drummer emma = new Drummer(drums, "Emma");
        drums.sound();
        emma.play();
    }
}