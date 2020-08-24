class HR{
String name;
String manager;
int employeeCount;
HR(String _manager,int _employeeCount){
  manager=_manager;
  employeeCount=_employeeCount;
}
HR(String _name){
  name=_name;
}
void details(){
  System.out.println("HR Department is managed by "+manager);
  System.out.println("There are "+employeeCount+ " employees in this Department");
}
void employeNames(){
  System.out.println(name+" works in this Department");
}
}
