package org.example;

class Drum extends Instrument{
    public Drum(String name) {
        super(name);
    }

    void sound() {
        System.out.println("Drums go boom");
    }
}
