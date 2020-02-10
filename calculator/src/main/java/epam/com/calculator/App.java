package epam.com.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Select the operator type: ");
            System.out.println("Select 1 for Addition : ");
            System.out.println("Select 2 for Subtraction : ");
            System.out.println("Select 3 for Multiplication : ");
            System.out.println("Select 4 for Division : ");
            System.out.println("Select 0 to exit the calculator : ");
            int optype=in.nextInt();
            switch(optype){
                case 1:
                    System.out.println("Enter first number : ");
                    double a=in.nextDouble();
                    System.out.println("Enter second number : ");
                    double b=in.nextDouble();
                    Add a1=new Add(a,b);
                    System.out.println("Result : "+a1.add());
                    break;
                case 2:
                    System.out.println("Enter first number : ");
                    double c=in.nextDouble();
                    System.out.println("Enter second number : ");
                    double d=in.nextDouble();
                    Sub a2=new Sub(c,d);
                    System.out.println("Result : "+a2.sub());
                    break;
                case 3:
                    System.out.println("Enter first number : ");
                    double e=in.nextDouble();
                    System.out.println("Enter second number : ");
                    double f=in.nextDouble();
                    Mul a3=new Mul(e,f);
                    System.out.println("Result : "+a3.mul());
                    break;
                case 4:
                    System.out.println("Enter first number : ");
                    double g=in.nextDouble();
                    System.out.println("Enter second number : ");
                    double h=in.nextDouble();
                    if(h==0){
                        System.out.println("Cannot be divided by 0");
                    }
                    else{
                    Div a4=new Div(g,h);
                    System.out.println("Result : "+a4.div());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option");
             }
    }
    }
}
