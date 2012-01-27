import java.util.ArrayList;

interface Contents {
    int value();
}
interface Destination {
    String readLabel();
}





/*
public class Parcel {
    public Destination destination(final String toCountry, final float price) {
        return new Destination() {
            private int cost;
            private String whereTo = toCountry;

            {
                cost = Math.round(price);
                if (cost > 100) System.out.println("Превышение бюджета: " + cost
                        + " Допустимая сумма меньше 100");
            }

            public String readLabel() { return whereTo; }
        };
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Destination destination = parcel.destination("Russia", 101.395f);
    }
}
*/











/*public class Parcel {
    
    class Contents {
        private int i = 11;
        int value() { return i; }
    }
    
    class Destination {
        private String whereTo;
        Destination(String whereTo) { this.whereTo = whereTo; }
        String whereTo() { return whereTo; }
    }
    
    void track(String toCountry) {
        Contents contents = new Contents();
        Destination destination = new Destination(toCountry);
        System.out.println(destination.whereTo());
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.track("Russia");
        
    }
}*/




/*
public class Parcel {

    Destination destination(String whereTo) {
        class PDestination implements Destination {
            private String whereTo;

            PDestination(String whereTo) { this.whereTo = whereTo; }

            public String readLabel() { return whereTo; }
        }
        return new PDestination(whereTo);
    }
*/




/*
public class Parcel {

    Destination destination(final String toCountry) {
        return new Destination() {
            private String whereTo = toCountry;
            public String readLabel() { return whereTo; }
        };
    }

    public static void main(String[] args) {
        System.out.println(new Parcel().destination("Russia").readLabel());
    }
}
*/






/*
public class Parcel {       // anonymous class
    public Contents contents() {
        return new Contents() {
                    private int x = 11;
                    public int value() { return x; }
        };
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Contents contents = parcel.contents();
    }
}*/





/*public class Parcel {

    Contents contents() { return new MyContents(); }

    class MyContents implements Contents {
        private int i = 11;

        public int value() { return i; }
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Contents contents = parcel.contents();
    }
}*/
