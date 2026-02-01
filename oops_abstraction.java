
public class oops_abstraction {
    public static void main(String[] args) {
        // horse h = new horse();
        // h.eat();
        // h.walk();
        // h.changeColor();
        
        // chicken c = new chicken();
        // c.eat();
        // c.walk();
        // c.changeColor();

        mustang myMustang = new mustang(); 
    }
}

abstract class animal{
    String color;
    animal(){
        System.out.println("animal constrctor called");
    }
    animal(String color){
        color = "brown";
         
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); 
}

class horse extends animal{
     horse(){
        System.out.println("horse constructor called");
     }
    void changeColor(){
        color = "dark brown";
        System.out.println(color);
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chicken extends animal{
    chicken(){
        System.out.println("chicken constructor called");
    }
    void changeColor(){
        color = "white";
        System.out.println(color);
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}