package interfaceSegregation;

public class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Trabalhando...");
    }

    @Override
    public void eat() {
        System.out.println("Comendo...");
    }
}
