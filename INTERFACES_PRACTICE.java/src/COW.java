public class COW implements ANIMAL,HERBIVORE {

    @Override
    public void walk() {
        System.out.println("cow is walking");
    }

    @Override
    public void eat() {
        System.out.println("cow is eating");
    }

    public void bydefault(){
        walk();
        eat();
        HERBIVORE.eatinggrass(); //non abstract static call
        green(); //not abstract default call
    }

}
