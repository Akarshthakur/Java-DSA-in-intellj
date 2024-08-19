
import java.util.*;
public class  Main {
    public static void main(string[] acm){
    Scanner Sc = new Scanner(System.ln);
    System.out.print("enter two number");
    int a = Sc.nextInt();
    int b = Sc.nextInt();
    int c;
    System.out.print("enter operator");
    String operator = Sc.next();
    switch(operator)

    {
        case "+"
            ;
            c = a + b;
            System.out.print(c);
            break;
        case "-"
            ;
            c = a - b;
            System.out.print(c);
            break;
        case "*"
            ;
            c = a * b;
            System.out.print(c);
            break;
        case "/"
            ;
            c = a / b;
        default
            ;
            System.out.print("error");
        }
    }
}