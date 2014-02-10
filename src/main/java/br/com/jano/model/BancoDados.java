package br.com.jano.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoDados {

	static Map<Integer, Empregado> db = new HashMap<Integer, Empregado>();
		static {
			Empregado emp1 = new Empregado();
			emp1.setId(1);
			emp1.setFirstName("Peter");
			emp1.setLastName("Bratsh");
			Departamento dept1 = new Departamento();
			dept1.setDeptId(1111);
			dept1.setDeptName("dept1");
			emp1.setDept(dept1);
	 
			Empregado emp2 = new Empregado();
			emp2.setId(2);
			emp2.setFirstName("John");
			emp2.setLastName("Williams");
			Departamento dept2 = new Departamento();
			dept2.setDeptId(2222);
			dept2.setDeptName("dept2");
			emp2.setDept(dept2);
	 
			db.put(1, emp1);
			db.put(2, emp2);
		}
		
	public static Empregado getEmpregado(int id) {
		return db.get(id);
	}
			 
	public static List<Empregado> getAllEmpregados() {
		return new ArrayList<Empregado>(db.values()); 
	}		
}
