/**
 * OOPS_static
 */
public class OOPS_static {
    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolName = "JMV";
        
        student s2 = new student();
        System.out.println(s2.schoolName);

        horse h = new horse();
        System.out.println(h.color);
    }
}

class student{
    String name ;
    int roll; 
     
    static String schoolName;

    void setName(String name){
        this.name  = name;
    }
    String getName(){
        return this.name;
    }
}

//below code for implementing super keyowrd

class animal {
    String color;
    animal(){
        System.out.println("animal constructor is callled");
    }
}
class horse extends animal{
    horse(){
        super.color = " brown";
    System.out.println("horse constrctor is called");
}
}