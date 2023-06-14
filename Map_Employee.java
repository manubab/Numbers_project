package maccess;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
	private String name, desg;
	private float sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public Employee(String name, String desg, float sal) {
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}

	public String toString() {
		return name + " " + desg + " " + sal;
	}

}

public class Map_Employee {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<String, Employee> map = new LinkedHashMap<>();

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		fis = new FileInputStream("D:\\New folder\\Emp.txt");
		ois = new ObjectInputStream(fis);
		map = (Map<String, Employee>) ois.readObject();

		while (true) {

			try {

				abc: while (true) {
					System.out.println("-------choice-------");
					System.out.println("\t1.Add EmployeeDetails");
					System.out.println("\t2.View EmployeeDetails");
					System.out.println("\t3.delete EmployeeDetails");
					System.out.println("\t4.view Based on Employee id");
					System.out.println("\t5.sort based on eid");
					System.out.println("\t6.update based on eid");
					System.out.println("\t7.exit");
					System.out.println("----Enter choice -----");
					switch (sc.nextInt()) {
					case 1:

						try {
							sc.nextLine();
							System.out.println("Enter the no of Employees :");
							int n = Integer.parseInt(sc.nextLine());
							for (int i = 1; i <= n; i++) {
								System.out.println("Enter " + i + " Employee Details :");
								System.out.println("Enter employee id ");
								String eid = sc.nextLine();
								System.out.println("Enter employee ename");
								String ename = sc.nextLine();
								System.out.println("Enter employee desg");
								String desg = sc.nextLine();
								System.out.println("Enter employee sal");
								float sal = Float.parseFloat(sc.nextLine());
								Employee e = new Employee(ename, desg, sal);
								map.put(eid, e);
							}
							try {
								fos = new FileOutputStream("D:\\New folder\\Emp.txt");
								oos = new ObjectOutputStream(fos);
								oos.writeObject(map);
								System.out.println("Data Successfully inserted to file....!");
							} catch (Exception ex) {
								ex.printStackTrace();
							}

						} catch (Exception e) {
							System.out.println("Only Integer value it does allow other data....!\n");

						}
						break abc;
					case 2:

						try {
							fis = new FileInputStream("D:\\New folder\\Emp.txt");
							ois = new ObjectInputStream(fis);
							map = (Map<String, Employee>) ois.readObject();
							System.out.println(map.toString());
						} catch (Exception e) {
							e.printStackTrace();
						}
						break abc;
					case 3:
						sc.nextLine();
						System.out.println("Enter the Emp id to delete :");
						String eid = sc.nextLine();
						fis = new FileInputStream("D:\\New folder\\Emp.txt");
						ois = new ObjectInputStream(fis);
						map = (Map<String, Employee>) ois.readObject();
						map.remove(eid);
						fos = new FileOutputStream("D:\\New folder\\Emp.txt");
						oos = new ObjectOutputStream(fos);

						oos.writeObject(map);
						System.out.println("Emp Detials Deleted Successfully...!");
						break abc;
					case 4:
						sc.nextLine();
						System.out.println("Entre the Emp id for search :");
						String e = sc.nextLine();
						fis = new FileInputStream("D:\\New folder\\Emp.txt");
						ois = new ObjectInputStream(fis);
						map = (Map<String, Employee>) ois.readObject();

						for (Map.Entry<String, Employee> emp : map.entrySet()) {
							if (emp.getKey().contains(e)) {
								System.out.println(emp.toString());
							}

						}

						break abc;
					case 5:

						fis = new FileInputStream("D:\\New folder\\Emp.txt");
						ois = new ObjectInputStream(fis);
						map = (Map<String, Employee>) ois.readObject();

						TreeMap<String, Employee> tm = new TreeMap(map);

						System.out.println(tm.toString());

						fos = new FileOutputStream("D:\\New folder\\Emp.txt");
						oos = new ObjectOutputStream(fos);

						oos.writeObject(tm);
						System.out.println("Data Sorted Succesfully");

						break abc;
					case 6:
						sc.nextLine();
						System.out.println("Enter eid for update :");
						String id = sc.nextLine();
						fis = new FileInputStream("D:\\New folder\\Emp.txt");
						ois = new ObjectInputStream(fis);
						map = (Map<String, Employee>) ois.readObject();

						for (Map.Entry<String, Employee> ob : map.entrySet()) {
							if (ob.getKey().contains(id)) {
								Employee e1 = ob.getValue();
								System.out.println("Enter the ename :");
								String ename = sc.nextLine();
								System.out.println("Enter the desg");
								String desg = sc.nextLine();
								System.out.println("Enter the sal");
								float sal = Float.parseFloat(sc.nextLine());

								e1.setName(ename);
								e1.setDesg(desg);
								e1.setSal(sal);

								map.put(id, e1);

								fos = new FileOutputStream("D:\\New folder\\Emp.txt");
								oos = new ObjectOutputStream(fos);

								oos.writeObject(map);

								System.out.println("Employee details Update succes");
							}
						}
						break abc;

					case 7:

						System.out.println("Application Stoped");
						System.exit(0);
					default:
						System.out.println("invalid choice....!");
					}
				}
			} catch (InputMismatchException ime) {
				System.out.println("only integer data allowed here...!");
				System.exit(0);
			}

		}

	}

}
