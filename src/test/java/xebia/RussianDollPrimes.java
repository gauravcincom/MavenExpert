package xebia;

import java.util.HashMap;
import java.util.Map;

public class RussianDollPrimes
{
   //function for verifying number is prime or not
   //complexity o(n)
   private static Map<Integer, Boolean> numberList = new HashMap<Integer, Boolean>();

   public static boolean verifyNumberIsPrime(int number)
   {
      boolean isPrime = true;
       boolean numberContains = numberList.containsKey(number);
       if(numberContains == true)
          return numberList.get(number);

       for (int i = 2; i < number; i++)
      {
         if (number % i == 0)
         {
            isPrime = false;
            break;
         }
      }
    numberList.put(number, isPrime);
    return isPrime;
   }

   //function for verifying number is russian doll or not
   public static boolean verifyNumberIsRussianDoll(int number)
   {
      boolean isPrimeDoll=verifyNumberIsPrime(number);

      number = number/10;

      while(isPrimeDoll &&(number!=0) )
      {
         isPrimeDoll = verifyNumberIsPrime(number);
         number = number/10;
      }


     return isPrimeDoll;
   }

   public static void main(String args[])
   {
    // Provide the value of N ie the range of input integer(1toN)
     int n=787123;

     //for(int i=1; i<=n; i++)
   //  {
        boolean isPrimeDoll =verifyNumberIsRussianDoll(n);
        System.out.println("Is given number :: "+n+" prime doll number :: " + isPrimeDoll);
   //  }

     System.out.println("Print the map :: "+numberList);
   }
}
