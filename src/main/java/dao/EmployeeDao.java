package dao;

import entites.Employee;

import javax.persistence.EntityManager;

public class EmployeeDao extends AbstractEntityDao<Employee,Integer> {
    public EmployeeDao(EntityManager entityManager) {
        super(entityManager);
    }

    public Class<Employee> getClassType() {
        return Employee.class;
    }
}
