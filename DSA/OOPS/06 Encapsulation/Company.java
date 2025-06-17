class Employee{
    private int employeeId;
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public int getEmployeeId(){
       return employeeId;
    }
}
public class Company {
   public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setEmployeeId(550);
    System.out.println(employee.getEmployeeId());
   }
    
}