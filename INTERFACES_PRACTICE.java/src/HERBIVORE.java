public interface HERBIVORE {
  //non abstract
   static void eatinggrass() {
        System.out.println("cow is eating grass");
    }
    default void green(){
        System.out.println("only eating green stuff");
    }
}
