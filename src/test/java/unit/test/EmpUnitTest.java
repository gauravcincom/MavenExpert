package unit.test;

import org.junit.Assert;
import org.junit.Test;

import domain.Employee;

public class EmpUnitTest
{
   @Test
   public void checkEmpName()
   {
      Employee first = new Employee();
      Employee sec = new Employee();
      Employee third = new Employee();
      Employee fourth = new Employee();

      first.setName("Gaurav");
      sec.setName("Rahul");
      third.setName("Sanjay");
      fourth.setName("Gaurav");

      Assert.assertSame(first.getName(), fourth.getName());


   }
}
