package org.example;

class Piano extends Instrument{

    public Piano(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Piano keys clang");
    }
}
