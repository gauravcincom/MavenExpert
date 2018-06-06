package it.test;

import org.junit.Assert;
import org.junit.Test;

import domain.Department;
import domain.Employee;

public class EmpDeptIT
{
   @Test
   public void employeeEqual()
   {
      System.out.println("This is property value :: "+System.getProperty("test.type"));

      Department deptFirst = new Department();
      Department deptSec = new Department();


      deptFirst.setDeptName("QA");
      deptSec.setDeptName("Dev");

      Employee empFirst = new Employee();
      Employee empSec = new Employee();


      empFirst.setName("Gaurav");
      empFirst.setDept(deptFirst);

      empSec.setName("Rahul");
      empSec.setDept(deptFirst);

      Assert.assertNotEquals(empFirst, empSec);
   }

}
