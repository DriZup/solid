package liskov;

public class Penguin extends Bird {

    @Override
    public void move() {
        System.out.println("Pinguim nadando...");
    }
}
