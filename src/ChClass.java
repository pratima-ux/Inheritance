public class ChClass extends PaClass {

    void sub ()  //created sub method
    {
        double ans = a - b ;
        System.out.println("sub of a and b is" + ans);
    }

    public static void main(String[] args)   // main method
    {
        ChClass ch = new ChClass(); //created object for child class
        ch.add();
        ch.sub(); // call method


    }

}
