package co.com.jcsolid.lsp.problem;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("Elephants cannot jump!");
    }
}