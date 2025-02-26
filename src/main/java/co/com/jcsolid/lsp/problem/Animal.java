package co.com.jcsolid.lsp.problem;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void jump() {
        System.out.println(name + " jumps.");
    }
}

