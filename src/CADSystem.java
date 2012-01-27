class Shape {
    
    Shape(int i) {
        System.out.println("Конструктор Shape()");
    }
    
    void dispose() {
        System.out.println("Стираем dispose()");
    } 
}
class Circle extends Shape {
    
    Circle(int i) {
        super(i);
        System.out.println("Рисуем окружность");
    }
    
    void dispose() {
        System.out.println("Стираем окружность");
        super.dispose();
    }
}
class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        System.out.println("Рисуем треугольник");
    }

    void dispose() {
        System.out.println("Стираем треугольник");
        super.dispose();
    }
}
class Line extends Shape {
    private int x;
    private int y;

    Line(int x, int y) {
        super(x + y);
        this.x = x;
        this.y = y;
        
        System.out.println("Рисуем линии [" + x + ", " + y +"]");
    }
    
    void dispose() {
        System.out.println("Стираем рилинии [" + x + ", " + y + "]");
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] line = new Line[3];

    CADSystem(int i) {
        super(i + 1);
        c = new Circle(i);
        t = new Triangle(i);
        
        for(int j = 0; j < line.length; j++)
            line[j] = new Line(j, j * j);
        
        System.out.println("Конструктор CADSystem()");
    }

    void dispose() {
        System.out.println("Стираем CADSystem()");

        for(int j = line.length - 1; j >= 0; j--)
            line[j].dispose();

        t.dispose();
        c.dispose();

        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);

        try {
        }   finally {
                x.dispose();
        }
    }
}