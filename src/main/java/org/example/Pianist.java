package org.example;

class Pianist extends Musician {
    public Pianist(Instrument instrument, String name){
        super(instrument, name);
    }

    void play(){
        System.out.println(this.name + " sits at the " + myInstrument.name);
        myInstrument.sound();
    }
}
