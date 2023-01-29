package q1;

public class Employee implements Comparable<Employee> {
	private int empno;
	private String name;
	private int salary;
	public Employee(int empno, String name, int salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if (this.empno == o.getEmpno())
			return 0;
		else if (this.empno > o.getEmpno())
			return 1;
		else return -1;
	}
}