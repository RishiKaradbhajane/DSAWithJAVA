
public class OOPSLecture14 {
    public static void main(String[] args) {
       Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yello";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "myNameIsKhan";
        myAcc.setPassword("pasword");
    }
}

class BankAccount{
    public String username;
    String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void percentageCal(int phy,int che,int math){
        percentage = (phy + che + math)/3;
    }
}