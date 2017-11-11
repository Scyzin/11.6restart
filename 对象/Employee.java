/*
	员工类
		成员变量：
			姓名，年龄，编号
		构造方法：
			无参构造
		成员方法：
			show()
*/
class Employee{
	private String employeeID;
	private String name;
	private int age;
	
	public void Employee(){
	}
	
	public String getEmpoyeeID(){
		return employeeID;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void show(){
		System.out.println("员工编号："employeeID + "-员工姓名" + name +"-员工年龄" + age);
	}
}
class EmployeeTest{
	public static void main(String[] args){
		Employee s = new Employee();
		s.setEmployeeID("9527");
		s.setAge(19);
		s.setName("陈遵胜");
		s.show();
	}
}