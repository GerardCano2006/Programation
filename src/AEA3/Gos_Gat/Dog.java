package AEA3.Gos_Gat;

public class Dog extends Animal{

    public Dog(){
        int id = this.getId();
        this.setId(++id);
    }

    public Dog (int id) {
        this.setId(id);
    }

    // Own behavior
    private void bark () {
        System.out.println("Dog '" + this.getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound () {
        bark();
    }
}