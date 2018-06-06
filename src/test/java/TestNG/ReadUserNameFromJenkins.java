package TestNG;

import org.testng.annotations.Test;

public class ReadUserNameFromJenkins
{

   @Test
   public void readUserName()
   {
      String userName = System.getProperty("UserName");
      System.out.println("This is user name :: "+userName);

   }


}
