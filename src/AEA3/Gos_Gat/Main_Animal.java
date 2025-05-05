package AEA3.Gos_Gat;

public class Main_Animal {
    public static void main(String[] args) {
        //animal
        Animal a = new Animal();
        //animal crida la funció sound();
        a.sound();

        Animal a1 = new Animal();
        //animal crida la funció sound();
        a1.sound();

        //dog
        Dog d = new Dog();
        //dog crida la funció sound();
        d.sound();

        Cat c1 = new Cat(2);
        c1.sound();

    }
}
