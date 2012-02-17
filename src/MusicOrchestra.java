import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}
interface Instrument { void play(Note n); }

class InstrumentAdapter implements Instrument {
    public void play(Note n) { System.out.println(getClass().getSimpleName() + " " + n); }
    }

class Wind extends InstrumentAdapter {}
class Percussion extends InstrumentAdapter {}
class Stringer extends InstrumentAdapter {}
class Brass extends Wind {}
class Woodwind extends Wind {}

class Generator {
    private static Random random = new Random(47);
    
    static Instrument choice() {
        switch(random.nextInt(5)) {
            case 0 : return new Wind();
            case 1 : return new Percussion();
            case 2 : return new Stringer();
            case 3 : return new Brass();
            case 4 : return new Woodwind();

            default : return null;
        }
    }
}
public class MusicOrchestra {
    
    static void tuneAll(Instrument i) { i.play(Note.MIDDLE_C);}
    
    public static void main(String[] args) {
        ArrayList<Instrument> orchestra = new ArrayList<Instrument>();
        
        System.out.print("Ведите кол-во инструментов в оркестре: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        
        for(int i = 0; i < count; i++) {
            orchestra.add(Generator.choice());
        }
        
        for(Instrument i : orchestra)
            tuneAll(i);
    }
}