package OfficePackage;
import EmployeesPackage.Employee;
import HRPackage.HR;
import AccountsPackage.Accounts;
public class Office{
  public static void main (String [] args){
    System.out.println("Welcome to our Office");
    System.out.println("--------------------------");
    Employee adil;
    Employee ali;
    Employee umair;
    Employee hamza;
    Accounts accounts;
    Accounts displayAccountsEmployeeNames;
    HR hr;
    HR displayHREmployeeNames;
    adil=new Employee("Adil",22s);
    ali= new Employee("Ali",23);
    umair=new Employee("Umair",34);
    hamza=new Employee("Hamza",40);
    accounts=new Accounts(adil.getName(),5);
    displayAccountsEmployeeNames=new Accounts(umair.getName());
    hr=new HR(ali.getName(),4);
    displayHREmployeeNames= new HR(hamza.getName());
    System.out.println("Thi is list of Our Employees ");
    adil.details();
    ali.details();
    umair.details();
    hamza.details();
    System.out.println("--------------------------");
    System.out.println("Our Office has two Departments");
    accounts.details();
    displayAccountsEmployeeNames.employeNames();
    System.out.println("--------------------------");
    hr.details();
    displayHREmployeeNames.employeNames();
  }
}
