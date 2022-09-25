import Exceptions.EmployeeAlreadyAddedException;
import Exceptions.EmployeeNotFoundException;
import Service.EmployeeService;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Александр", "Клепов"),
            new Employee("Дмитрий", "Фролов"),
            new Employee("Дмитрий", "Волосевич"),
            new Employee("Анатолий", "Карпов"),
            new Employee("Иван1", "Иванов"),
            new Employee("Иван2", "ВторойИванов"),
            new Employee("Иван3", "ТретийИванов")
    ));


    @Override
    public void printAllEmployees() {
        System.out.println(Collections.unmodifiableList(employees));
    }

        @Override
        public void remove(String firstName, String lastName) throws EmployeeNotFoundException {
            Employee forRemove = new Employee(firstName, lastName);
            if (!employees.contains(forRemove)) {
                throw new EmployeeNotFoundException("Такой сотрудник не найден!");
            }
            employees.remove(forRemove);
            }


        @Override
        public void add(String firstName, String lastName) throws EmployeeAlreadyAddedException {
            Employee toAdd = new Employee(firstName, lastName);
            if (employees.contains(toAdd)) {
                throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в базе!");
            }
            employees.add(toAdd);
            }


        @Override
        public void find(String firstName, String lastName) throws EmployeeNotFoundException {
            Employee toFind = new Employee(firstName, lastName);
                if (employees.contains(toFind)) {
                    System.out.println(toFind);
                }
            else {throw new EmployeeNotFoundException("Такой сотрудник не найдем!");}
        }
    }



