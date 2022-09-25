package Service;

public interface EmployeeService {

    void printAllEmployees();

    public void find(String firstName, String lastName);
    public void add(String firstName, String lastName);

    public void remove(String firstName, String lastName);

}
