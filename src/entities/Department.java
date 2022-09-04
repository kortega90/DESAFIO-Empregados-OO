package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private Address address;
	private List<Employee> emp = new ArrayList<>();

	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void addEmployee(Employee employee) {

		emp.add(employee);
	}

	public void removeEmployee(Employee employee) {

		emp.remove(employee);
	}

	public double payroll() {
		double sum = 0.0;

		for (Employee emp : this.emp) {
			sum += emp.getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Departamento ");
		sb.append(name);
		sb.append(" = R$ ");
		sb.append(String.format("%.2f", payroll()) +"\n");
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay+"\n");
		sb.append("Funcionários:" +"\n");

		for (Employee emp : this.emp) {
			sb.append(emp + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: ");
		sb.append(address.getEmail());

		return sb.toString();
	}
}
