public class PartTimeEmployee extends Employee{
    int hours;

    public PartTimeEmployee(){
    }

    public PartTimeEmployee(int employeeCode, String fullName, int age, String phone, String email, int hours) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
