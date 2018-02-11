package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.empId == emp.empId;
	}

	public int hashCode() {
		return 1;
	}

	public int getEmpId() {
		return empId;

	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int compareTo(Employee emp) {

		if (empId > emp.getEmpId())
			return -1;
		else if (empId<emp.getEmpId())
			return 1;
		else
			return 0;

	}

}

public class PriorityQueueArrayDequeueExample {

	public static void main(String[] arg) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("Mukul");
		queue.offer("Ramesh");
		queue.offer("Abhishek");
		queue.offer("Mukul");
		LinkedHashSet<String> treeSet = new LinkedHashSet<String>();
		treeSet.add("Mukul");
		treeSet.add(null);
		// only LinkedHashSet allows null values

		/*
		 * Note-Set contains only unique elements for userdefined object class have to implement equals and hashCode
		 */
		for (String a : treeSet) {
			System.out.println(a);
		}

		System.out
				.println("Using priority queue for userdefined object user-defined class must implement Comparable interface");
		// queue.offer(null);
		PriorityQueue<Employee> empQueue = new PriorityQueue<Employee>();
		empQueue.add(new Employee(11, "Mukul"));
		empQueue.add(new Employee(0, "Mayank"));
		empQueue.add(new Employee(1, "pankaj"));
		empQueue.add(new Employee(12,"Mukule"));
		//queue will contain 
		Iterator<Employee> itr = empQueue.iterator();
System.out.println(empQueue.peek().getEmpId()+"First Employee");
		while (itr.hasNext()) {
			System.out.println(itr.next().getEmpName());
		}
		
		Deque<Employee> deque=new ArrayDeque<Employee>();//it behaves like a double ended queue insertion
		deque.offer(new Employee(21,"Ramesh"));
		deque.offer(new Employee(2, "Lalita"));
		deque.offerFirst(new Employee(3, "punit"));
		System.out.println("---deque---");
		for(Employee emp:deque){
			System.out.println(emp.getEmpId()+" "+emp.getEmpName());
		}
		
		deque.pollLast();
		
		System.out.println("After deletion");
		for(Employee emp:deque){
			System.out.println(emp.getEmpId()+" "+emp.getEmpName());
		}
	}
}
