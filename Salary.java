import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salary 
{
	public static void main(String[] args) 
	{
		List lObj=new ArrayList();
		lObj.add(new Employee("Sathish",1001, 50000.0));
		lObj.add(new Employee("Rahul",1003, 10000.0));
		lObj.add(new Employee("Saikishore",1005, 20500.0));
		lObj.add(new Employee("vaibhav",1004, 30000.0));
		lObj.add(new Employee("swami",1007, 20000.0));
		lObj.add(new Employee("krishna",1006, 25000.0));
		System.out.println(lObj);
		
		Collections.sort(lObj);
		Collections.reverse(lObj);
		
		System.out.println();
		System.out.println("Top Three paid Salary for Employees  ");
		for(int i=0;i<3;i++)
		{
			System.out.println(lObj.get(i));
		}
		
		
	}
	
}
class Employee implements Comparable<Employee>
{
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, double salary) {
	
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) 
	{
		if(this.salary>o.salary)
			return 1;
		else if(this.salary<o.salary)
			return -1;
		else
			return 0;
	}
		
}
