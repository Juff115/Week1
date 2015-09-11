import hsa.*;

public class Main {

    public static void main(String[] args) {
        Console c = new Console();
        c.print("Hur mår dur?");
        int age;
        c.print("\nHow old are you? ");
        age=c.readInt();
        age++;
        c.print("\nnext year you will be "+ age +" years old");
    }
    
}
