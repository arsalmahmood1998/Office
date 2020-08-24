package EmployeesPackage;
public class Employee{
  private  String name;
  private  int age;
  public Accounts(String _manager, int _employeeCount){
    manager=_manager;
    employeeCount=_employeeCount;
  }
  public Employee(String _name,int _age){
    name=_name;
    age=_age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void details(){
    System.out.println("Employee name: "+ getName());
    System.out.println("Employee age: "+getAge());
  }
}
