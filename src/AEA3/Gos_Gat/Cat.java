package AEA3.Gos_Gat;

public class Cat extends Animal{

    public Cat(){
        int id = this.getId();
        this.setId(++id);
    }

    public Cat (int id) {
        this.setId(id);
    }

    // Own behavior
    private void miau () {
        System.out.println("Cat '" + this.getId() + "' is saying miau");
    }

    // Overriding super class behavior
    @Override
    public void sound () {
        miau();
    }
}
