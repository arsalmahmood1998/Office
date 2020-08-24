package AccountsPackage;
public class Accounts{
  String name;
  String manager;
  int employeeCount;
  
  public Accounts(String _manager, int _employeeCount){
    manager=_manager;
    employeeCount=_employeeCount;
  }
  public Accounts(String _name){
    name=_name;
  }
  public void details(){
    System.out.println("Accounts department is managed by "+manager);
    System.out.println("There are "+employeeCount+ " employees in this Department");
  }
  public void employeNames(){
    System.out.println(name+" works in this Department");
  }
}
