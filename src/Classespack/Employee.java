package Classespack;

public class Employee 
{
	int empid;       //data members
	String empname;  //data members

	final static String companyname="xyz company";
	
	public static void main(String[] args) 
	{
	Employee e1=new Employee(); //creating object of class
	System.out.println(Employee.companyname); //calling static by classname.variable name
	e1.empid=123;
	e1.empname="mukesh";
	System.out.println("employee id ="+e1.empid);
	System.out.println("employee name ="+e1.empname);
	System.out.println();
	
	Employee e2=new Employee();
	System.out.println(Employee.companyname);
	e2.empid=124;
	e2.empname="suresh";
	System.out.println("employee id ="+e2.empid);
	System.out.println("employee name ="+e2.empname);
	}

}
