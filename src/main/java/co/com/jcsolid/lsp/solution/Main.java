package co.com.jcsolid.lsp.solution;

public class Main {
    public static void makeAnimalWalk(Animal animal) {
        animal.walk();
    }

    public static void makeAnimalJump(LightAnimal lightAnimal) {
        lightAnimal.jump();
    }

    public static void main(String[] args) {
        Animal elephant = new Elephant("Dumbo");
        LightAnimal dog = new Dog("Buddy");

        makeAnimalWalk(elephant);
        makeAnimalWalk(dog);

        makeAnimalJump(dog);
        //makeAnimalJump(elephant); // ❌ ERROR DE COMPILACIÓN: Un elefante no puede saltar.
    }
}
