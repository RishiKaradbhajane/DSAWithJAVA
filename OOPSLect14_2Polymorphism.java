import javax.sound.sampled.SourceDataLine;

public class OOPSLect14_2Polymorphism {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1.3f,2.7f));
        System.out.println(calc.sum(1,2,4));
        deer d = new deer();
        d.eat();

    }
}

class animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}

class calculator{
    int sum(int a,int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}