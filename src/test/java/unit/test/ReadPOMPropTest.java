package unit.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class ReadPOMPropTest
{
   @Test
   public void readProp() throws Exception
   {
      System.out.println("This is property value for test type in unit:: "+System.getProperty("test.type"));
      Properties props = new Properties();

      // Get hold of the path to the properties file
      // (Maven will make sure it's on the class path)
     // URL url = Config.class.getClassLoader().getResource("sql.properties");

      // Load the file
     // props.load(url.openStream());
    //  System.out.println("This is path :: "+this.getClass());
    // // String filePath= this.getClass().getResource("src/test/resources/maven.properties").getPath();
    //  System.out.println("This is path :: "+filePath);
    //  InputStream input = new FileInputStream(filePath);
      //C:/Gaurav/workspace_mars/MavenExpert/src/test/resources/
    //  String respath = "maven";//.properties";

    //  InputStream input = ReadPOMPropTest.class.getResourceAsStream(respath);
    //  if ( input == null )
  //        throw new Exception("resource not found: " + respath);



      //String filePath= Employee.class.getResource("maven.properties").getPath();
    //  InputStream input = new FileInputStream(filePath);
      InputStream input = new FileInputStream("target/classes/maven.properties");
    //  ClassLoader cl = getClass().getClassLoader();
   //   InputStream input = cl.getResourceAsStream("src/main/resources/maven.properties");
      props.load(input);
     String actValue = props.getProperty("project.version");
     System.out.println("This is var value :: "+actValue);
      // Accessing values
      Assert.assertEquals("0.0.1-SNAPSHOT", actValue);
   }

}
