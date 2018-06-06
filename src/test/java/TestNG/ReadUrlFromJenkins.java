package TestNG;

import org.testng.annotations.Test;

public class ReadUrlFromJenkins
{

   @Test
   public void readUrl()
   {
      String url = System.getProperty("UATURL");
      System.out.println("This is url :: "+url);

   }


}
