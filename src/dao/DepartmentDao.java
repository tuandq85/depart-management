package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Department;

public class DepartmentDao {
	private static Map<Integer, Department >  departmentMap = new HashMap<>();
	
	static {
		departmentMap.put(1, new Department("PB01","phong ke hoach","nguyen van a"));
		departmentMap.put(2, new Department("PB02","phong ke toan","nguyen van b"));
			
	}
	
	
	public static List<Department> getListDepartments(){
		return new ArrayList<>(departmentMap.values());
	}


	public static void insertDepartmen(Department department) {
		departmentMap.put(null, department);
		
	}

	
}
