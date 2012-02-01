interface Service {
    void method1();
    void method2();
}
interface FactoryService {
    Service getService();
}
class Implementation implements Service {
    public void method1() { System.out.println("Implementation.method1();"); }
    public void method2() { System.out.println("Implementation.method2();"); }
    
    public static FactoryService factoryService() {
        return new FactoryService() {
            public Service getService() {
                return new Implementation();
            }
        };
    }
}

public class Factories {
    public static void serviceConsumer(FactoryService factoryService) {
        Service service = factoryService.getService();
        service.method1();
        service.method2();
    }
    
    public static void main(String[] args) {
        serviceConsumer(Implementation.factoryService());
    }    
}

/*interface Service {
    void method1();
    void method2();
}
interface FactoryService {
    Service getService();
}
class Implementation implements Service {
    public void method1() { System.out.println("Implementation.method1();"); }
    public void method2() { System.out.println("Implementation.method2();"); }

    static FactoryService factory() {
        return new FactoryService() {
            
            public Service getService() {
                return new Implementation();
            }
        };
    }
}
public class Factories {
    public static void serviceConsumer(FactoryService factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }
    
    public static void main(String[] args) {
        serviceConsumer(Implementation.factory());
    }*/
