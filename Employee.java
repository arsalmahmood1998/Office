class Employee{
  private  String name;
  private  int age;
  Employee(String _name,int _age){
    name=_name;
    age=_age;
  }
  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }
  void details(){
    System.out.println("Employee name: "+ getName());
    System.out.println("Employee age: "+getAge());
  }
}
