package co.com.jcsolid.lsp.solution;

public class Dog extends LightAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void jump() {
        System.out.println(name + " jumps happily.");
    }
}
