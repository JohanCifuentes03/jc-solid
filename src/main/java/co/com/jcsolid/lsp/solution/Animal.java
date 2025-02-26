package co.com.jcsolid.lsp.solution;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}
