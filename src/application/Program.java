package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Nome do departamento:");
      String nameDep = sc.next();
      System.out.print("Dia do pagamento:");
      int dayPay = sc.nextInt();
      System.out.print("Email:");
      String email = sc.next();
      System.out.print("Telefone:");
      String phone = sc.next();
      
      System.out.print("Quantos funcionários tem o departamento?");
      int N = sc.nextInt();
      
      Department department = new Department(nameDep,dayPay, new Address(email, phone));
      
      for (int i=0;i<N;i++) {
    	  
    	  System.out.println();
    	  System.out.println("Dados do funcionário "+ (i+1)+": ");
    	  System.out.print("Nome:");
    	  sc.nextLine();
    	  String name =sc.nextLine();
    	  System.out.print("Salário:");
    	  double salary = sc.nextDouble();
    	  
    	  Employee employee = new Employee(name, salary);
    	  department.addEmployee(employee);
      }
      
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println (department);
      sc.close();
	}

}
