/*
	Ա����
		��Ա������
			���������䣬���
		���췽����
			�޲ι���
		��Ա������
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
		System.out.println("Ա����ţ�"employeeID + "-Ա������" + name +"-Ա������" + age);
	}
}
class EmployeeTest{
	public static void main(String[] args){
		Employee s = new Employee();
		s.setEmployeeID("9527");
		s.setAge(19);
		s.setName("����ʤ");
		s.show();
	}
}