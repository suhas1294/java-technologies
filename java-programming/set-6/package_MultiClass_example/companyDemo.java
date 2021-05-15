import Company.*;

class companyDemo
{
  public static void main(String v[])
  {

    Company.Employ e = new Company.Employ(1 , "Rohan", 19000);

    Accounts.findSalary(e);

  }

}