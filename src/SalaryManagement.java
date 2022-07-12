public class SalaryManagement {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new FullTimeEmployee(100, "NguyenHoangHiep", 26, "0849582782", "gagga5376@gmail.com", 10000000, 500000, 50000000);
        employees[1] = new FullTimeEmployee(101, "NguyenManhHien", 25, "0328601702", "nguyenhien81f@gmail.com", 15000000, 100000, 40000000);
        employees[2] = new FullTimeEmployee(102, "NgoTrongHieu", 24, "0979276402", "imbakito1604@gmail.com", 1000000, 5000000, 45000000);
        employees[3] = new PartTimeEmployee(103, "BuiQuangAnh", 22, "0988163947", "quanganhbui2703@gmail.com", 38);
        employees[4] = new PartTimeEmployee(104, "DaoVanTrong", 24, "0398299898", "daovantrong98@gmail.com", 20);

        System.out.println("Total salary of fulltime employees is: " + FullTimeEmployeeSalary(employees));
        System.out.println("Total salary of partime employees is: " + PartTimeEmployeeSalary(employees));

        int averageSalary = (FullTimeEmployeeSalary(employees) + PartTimeEmployeeSalary(employees)) / 5;
    }

    public static int FullTimeEmployeeSalary(Employee []employees) {
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                return ((FullTimeEmployee) employee).getFixSalary() + ((FullTimeEmployee) employee).getBonus() - ((FullTimeEmployee) employee).getFines();
            }
        }
        return 0;
    }

    public static int PartTimeEmployeeSalary(Employee []employees) {
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                return ((PartTimeEmployee) employee).getHours() * 100000;
            }
        }
        return 0;
    }
}
