package program;

//import java.io.*;
import java.util.*;

public class Multi {

    public static void main(String[] args) {
    	System.out.print("Enter a Integer number: ");
        Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
        for (int i = 1; i <= 10 && n>=2 && n<=20; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
        input.close();
    }
}
