package co.com.jcsolid.lsp.problem;

public class Main {
    public static void makeAnimalMove(Animal animal) {
        animal.walk();
        animal.jump();
        animal.walk();
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal elephant = new Elephant("Dumbo");

        makeAnimalMove(dog);
        makeAnimalMove(elephant);
    }
}
