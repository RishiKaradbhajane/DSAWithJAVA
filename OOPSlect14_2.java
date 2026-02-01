
public class OOPSlect14_2 {
    public static void main(String[] args) {
       student s1 = new student();
       s1.roll = 98;
       System.out.println(s1.roll);
       student s2 = new student("MADHAV");
       System.out.println(s2.name);
       student s3 = new student(98);
       System.out.println(s3.marks);

       
    }
}
class student {
    String name;
    int roll;
    int marks;
  // constructor overloading is where method with same name but different parameters as follows;
    student(String name){
         this.name = name;
    }
   student(){
    this.roll = roll;
   }
    
    student(int marks){
       this.marks = marks;
    }
}