package domain;

public class Employee
{
   String name;
   String id;
   Department dept;
   public Department getDept()
   {
      return dept;
   }
   public void setDept(Department dept)
   {
      this.dept = dept;
   }
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public String getId()
   {
      return id;
   }
   public void setId(String id)
   {
      this.id = id;
   }


}
