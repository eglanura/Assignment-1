import java.util.Scanner;
/*
 *   Egla Nura #0592765
 *   COIS 2240 Assignment -- 1
 *   Name: Fibonacci Numbers
 *   Purpose: Tests the two fibonacci methods
 *       [ ] Fibonacci with iteration
 *       [ ] Fibonacci with Recursion
 *   Imports: Scanner Library
 *
 *
 * citation: DecimalFormation -- Taken from stack-overflow
 *           A way to format long decimal point
 * */
public class Main {
    public static void main(String[] args)
    {
        int n;
        long startTime,endTime, finalTime;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of the sequence: ");
        n = s.nextInt();


        /*-----------------------------------
                Fibonacci Iteration part
        ------------------------------------ */
        //Uncomment for the test
        System.out.println("The sequence for n = " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciLoop(i) + " ");
        }
        System.out.println("\nThe fibonacci number for n =  " + n + " is " + fibonacciLoop(n));

        startTime = System.nanoTime();
        fibonacciLoop(n);
        endTime = System.nanoTime();

        finalTime = endTime - startTime;
        System.out.println();
        System.out.println("Elapsed time in nanoseconds for iteration is: " + finalTime);
        System.out.println("Elapsed time in milliseconds for iteration is: " + (float)finalTime/1000000f);

        /*------------------------------------
                Fibonacci Recursion Part
          ------------------------------------*/
        System.out.println("\nFibonacci Recursion");
//        Uncomment for the test
//        System.out.println("The sequence for n = " + n);
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacciRecursion(i) + " ");
//        }
        System.out.println("\nThe fibonacci number for n =  " + n + " is " + fibonacciRecursion(n));

        startTime = System.nanoTime();
        fibonacciRecursion(n);
        endTime = System.nanoTime();
        //Get the final time of the process
        finalTime = endTime - startTime;

        System.out.println("Elapsed time in nanoseconds for recursion is: " + finalTime);
        System.out.println("Elapsed time in milliseconds for recursion is: " + (float)finalTime/1000000f);




    }


    /*
     * Fibonacci iteration
     * @n = the length of the sequence
     * */
    public static int fibonacciLoop(int n)
    {
        int temp, a = 0, b = 1;
        if(n == 1 || n == 0) { return n; }

        for (int i = 0; i < n; i++) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }





    /*
     * Fibonacci Recursion
     * @n = length of the sequence
     * */
    public static int fibonacciRecursion(int n)
    {
        //base case
        if(n == 1 || n == 0) { return n; }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n -2);
    }
}
