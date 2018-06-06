package unit.test;

import org.junit.Assert;
import org.junit.Test;

import domain.Department;

public class DeptUnitTest
{
   @Test
   public void checkDeptNameExist()
   {
      Department first = new Department();
      Department sec = new Department();
      Department third = new Department();
      Department fourth = new Department();

      first.setDeptName("QA");
      sec.setDeptName("Dev");
      third.setDeptName("Admin");
      fourth.setDeptName("HR");

      Assert.assertNotSame(first.getDeptName(), fourth.getDeptName());


   }
}
