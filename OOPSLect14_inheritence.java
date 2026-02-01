
public class OOPSLect14_inheritence {
    public static void main(String[] args) {
        fish sharks = new fish();
        sharks.eat();
        mammel man = new mammel();
        man.eat();
        man.breathe();
        man.walk();
    }
}
class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class fish extends animal{
    int fins;
    void swims(){
      System.out.println("Fish swims in water");  
    }
}
class mammel extends animal{
    void walk(){
        System.out.println("mammels can walk");
    }
}