package lecture04;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private final Engine engine = new Engine(); // Car creates its dependency

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class WithoutDependencyInjection {
    public static void main(String[] args) {
        new Car().drive();
    }
}
