package org.example;

public class Drum extends Instrument{
    public Drum(String name) {
        super(name);
    }

    void Sound() {
        System.out.println("Drums go boom");
    }
}
