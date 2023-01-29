package q1;
import java.util.*;

public class CRUDApp {
	ArrayList<Employee> l;
	Scanner sc;
	public void insert() {
		System.out.println("[INSERT] Enter Employee no:");
		int no = sc.nextInt();
		System.out.println("[INSERT] Enter Employee name:");
		String name = sc.next();
		System.out.println("[INSERT] Enter Employee salary:");
		int salary = sc.nextInt();
		l.add(new Employee(no, name, salary));
	}
	public void display() {
		Iterator<Employee> it = l.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
		}
	}
	public void search() {
		System.out.println("[SEARCH] Enter Employee no:");
		int no = sc.nextInt();
		int foundIdx = -1;
		for(int i = 0; i < l.size();i++) {
			if(l.get(i).getEmpno() == no)
				foundIdx = i;
		}
		System.out.println((foundIdx == -1) ? "Not found" : "Found");
	}
	public void delete() {
		System.out.println("[DELETE] Enter Employee no:");
		int no = sc.nextInt();
		int foundIdx = -1;
		for(int i = 0; i < l.size();i++) {
			if(l.get(i).getEmpno() == no)
				foundIdx = i;
		}
		l.remove(foundIdx);
		System.out.println((foundIdx == -1) ? "Not found" : "Employee Deleted successfully");
	}
	public void update() {
		System.out.println("[UPDATE] Enter Employee no:");
		int no = sc.nextInt();
		int foundIdx = -1;
		for(int i = 0; i < l.size();i++) {
			if(l.get(i).getEmpno() == no)
				foundIdx = i;
		}
		System.out.println("[UPDATE] Enter new Employee no:");
		no = sc.nextInt();
		System.out.println("[INSERT] Enter new Employee name:");
		String name = sc.next();
		System.out.println("[INSERT] Enter new Employee salary:");
		int salary = sc.nextInt();
		l.get(foundIdx).setEmpno(no);
		l.get(foundIdx).setName(name);
		l.get(foundIdx).setSalary(salary);
	}
	public void run() {
		l = new ArrayList<Employee>();
		sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1.Insert\n2.Display\n3.Search\n4.Delete\n5.Update\n6.Exit");
			System.out.println("Enter a choice:");
			int in = sc.nextInt();
			switch(in) {
				case 1:
					insert();
					break;
				case 2:
					display();
					break;
				case 3:
					search();
					break;
				case 4:
					delete();
					break;
				case 5:
					update();
					break;
				case 6:
					return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CRUDApp().run();
	}
}