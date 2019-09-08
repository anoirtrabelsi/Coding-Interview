package Easy;

import java.util.*;

// Employee Importance: https://leetcode.com/problems/employee-importance/

public class EmployeeImportance {

	// Employee Importance: https://leetcode.com/problems/employee-importance/

	// Employee info
	static class Employee {

		// unique id of this employee
		public int id;

		// the importance value of this employee
		public int importance;

		// the id of direct subordinates
		public List<Integer> subordinates;
	}

	public int getImportanceHelper(List<Employee> employees, int id, Map<Integer, Employee> empId) {

		Employee emp = empId.get(id);

		int ret = emp.importance;

		for (int e : emp.subordinates)
			ret += getImportanceHelper(employees, e, empId);

		return ret;
	}

	public int getImportance(List<Employee> employees, int id) {

		// Map to store (id,employee) pairs:
		Map<Integer, Employee> empId = new HashMap<Integer, Employee>();
		
		for (int i = 0; i < employees.size(); i++)
			empId.put(employees.get(i).id, employees.get(i));
		
		return getImportanceHelper(employees, id, empId);
	}

}
