import Exceptions.EmployeeAlreadyAddedException;
import Exceptions.EmployeeNotFoundException;
import Service.EmployeeService;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {

    Map <String, Employee> employees = new HashMap<>(Map.of(
            "Александр Клепов",new Employee("Александр", "Клепов"),
            "Дмитрий Фролов",new Employee("Дмитрий", "Фролов"),
            "Дмитрий Волосевич",new Employee("Дмитрий", "Волосевич"),
            "Анатолий Карпов",new Employee("Анатолий", "Карпов"),
            "Иван1 Иванов",new Employee("Иван1", "Иванов"),
            "Иван2 ВторойИванов",new Employee("Иван2", "ВторойИванов"),
            "Иван3 ТретийИванов",new Employee("Иван3", "ТретийИванов")
    ));

    @Override
    public void printAllEmployees() {
        System.out.println(Collections.unmodifiableCollection(employees.values()));
    }

        @Override
        public void remove(String firstName, String lastName) throws EmployeeNotFoundException {
            Employee forRemove = new Employee(firstName, lastName);
            if (!employees.containsKey(forRemove.getFullName())) {
                throw new EmployeeNotFoundException("Такой сотрудник не найден!");
            }
            employees.remove(forRemove.getFullName());
            }


        @Override
        public void add(String firstName, String lastName) throws EmployeeAlreadyAddedException {
            Employee toAdd = new Employee(firstName, lastName);
            if (employees.containsKey(toAdd.getFullName())) {
                throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в базе!");
            }
            employees.put(toAdd.getFullName(),toAdd);
            }


        @Override
        public void find(String firstName, String lastName) throws EmployeeNotFoundException {
            Employee toFind = new Employee(firstName, lastName);
                if (employees.containsKey(toFind.getFullName())) {
                    System.out.println(toFind);
                }
            else {throw new EmployeeNotFoundException("Такой сотрудник не найдем!");}
        }
    }



