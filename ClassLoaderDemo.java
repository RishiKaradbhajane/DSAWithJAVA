import java.sql.Date;
public class ClassLoaderDemo {
    public static void main(String[] args)
    {
        ClassLoader details1 = args.getClass().getClassLoader();
        printDetails(details1);
    }
    public static void printDetails(ClassLoader details) {
        if (details == null)
            System.out.println("BootStrap ClassLoader ");
        else
            System.out.println("ClassLoader Name : " + details.getName() + "; ClassLoader Class : " + details.getClass().getName());
    }
}
