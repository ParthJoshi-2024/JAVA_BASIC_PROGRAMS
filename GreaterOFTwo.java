package Basic_Programs;

import java.util.Scanner;

public class GreaterOFTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("b is greater");
            }
        }
        sc.close();

    }
}
