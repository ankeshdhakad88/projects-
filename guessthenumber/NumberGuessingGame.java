import java.util.*;
class NumberGuessingGame
{
    public static void main(String args[])
    {
        int guess=1,user,random;
        random = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0 to 100");
        user = sc.nextInt();
        while(user!= random)
        {
           if(user>random)
           {
              System.out.println("Number is greater..");
              System.out.println("Try Again!!");
              user = sc.nextInt();
              guess++;
           }

           if(user<random)
           {
              System.out.println("Number is Small..");
              System.out.println("Try Again!!");
              user = sc.nextInt();
              guess++;
            }
        }
        System.out.println("*Congratulations You Won by "+guess+" guesses*");
    }
}