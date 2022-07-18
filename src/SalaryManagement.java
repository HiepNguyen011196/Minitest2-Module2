import java.util.ArrayList;

public class SalaryManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        FullTimeEmployee b1 = new FullTimeEmployee(100, 0, 10000);
        FullTimeEmployee b2 = new FullTimeEmployee(10, 50, 20000);
        PartTimeEmployee b3 = new PartTimeEmployee(3.4f);
        PartTimeEmployee b4 = new PartTimeEmployee(10.0f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);

        System.out.println(getFullTimeUnderSalary());
        System.out.println(getPartTimeSalary());
    }

    //    1. Lay ra luong trung binh cua cong ty
    public static float getAverageSalary(){
        float sum= 0;
        for (Employee e: employees
        ) {
            sum += e.getSalary();
        }
        float average = sum/employees.size();
        return average;
    }
    //    2. Lay danh sach nhan vien luong thap hon luong tb
    public static ArrayList<Employee> getFullTimeUnderSalary(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        float average = getAverageSalary();
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee &&
                    employee.getSalary() < average)
                employeeArrayList.add(employee);
        }
        return employeeArrayList;
    }
    // 3. Phuong thuc tinh luong phai tra cho Part-time employees
    public static float getPartTimeSalary(){
        float sum = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee)
                sum += employee.getSalary();
        }
        return sum;
    }
}
