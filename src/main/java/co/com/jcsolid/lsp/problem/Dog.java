package co.com.jcsolid.lsp.problem;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void jump() {
        System.out.println(name + " jumps happily.");
    }
}
