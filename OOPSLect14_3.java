
public class OOPSLect14_3 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name ="rajat";
        s1.roll = 456;
        s1.marks = 98;
        s1.password  ="qwert";
        s1.marks2[0]=100;
        s1.marks2[1]=90;
        s1.marks2[2]=87;


        student s2 = new student(s1);
        s2.password="sert";
        s1.marks2[2]=19;
        s1.marks = 45;
        System.out.println(s1.marks);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks2[i]);
        }

    }
      
}

class student {
    String name;
    int roll;
    int marks;
    String password;
    int marks2[];
// shallow copy constructor
// this constructor copies a properties of one object into another object;
    // student(student s1){
        // marks2 = new int[3];
        // this.roll=s1.roll;
        // this.name=s1.name;
        // this.marks=s1.marks;
        // this.marks2= s1.marks2;
    // }/

    //deep copy constructor
    student(student s1){
        marks2 = new int[3];
        this.roll=s1.roll;
        this.name=s1.name;
        this.marks=s1.marks;
        for(int i=0;i<marks2.length;i++){
            this.marks2[i] = s1.marks2[i];
        }
    }
 
    student(String name){
        marks2 = new int[3];
         this.name = name;
    }
   student(){
    marks2 = new int[3];
    this.roll = roll;
   }
    
    student(int marks){
        marks2 = new int[3];
       this.marks = marks;
    }
}