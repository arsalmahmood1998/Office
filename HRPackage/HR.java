package HRPackage;
public class HR{
  String name;
  String manager;
  int employeeCount;
  public HR(String _manager,int _employeeCount){
    manager=_manager;
    employeeCount=_employeeCount;
  }
  public HR(String _name){
    name=_name;
  }
  public void details(){
    System.out.println("HR Department is managed by "+manager);
    System.out.println("There are "+employeeCount+ " employees in this Department");
  }
  public void employeNames(){
    System.out.println(name+" works in this Department");
  }
}
