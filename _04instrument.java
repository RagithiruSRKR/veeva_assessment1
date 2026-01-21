abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

 class TestInstrument {
    public static void main(String[] args) {

        Instrument i;

        i = new Piano();   
        i.play();
        i = new Flute();  
         i.play();
        i = new Guitar(); 
         i.play();
    }
}
