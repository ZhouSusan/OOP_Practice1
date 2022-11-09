package org.example;

class Drummer extends Musician{
    public Drummer(Instrument instrument, String name) {
        super(instrument, name);
    }

    void play() {
        System.out.println(this.name + " sits at the " + myInstrument.name);
        myInstrument.sound();
    }
}
