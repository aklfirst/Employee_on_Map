import Service.EmployeeService;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeServiceImpl();

        employeeService.remove("Александр","Клепов");
        employeeService.printAllEmployees();
        employeeService.add("Александр","Клепов");
        employeeService.printAllEmployees();
        employeeService.find("Александр","Клепов");
    }

}