public class Employee {
    int employeeCode;
    String fullName;
    int age;
    String phone;
    String email;

    public Employee(int employeeCode, String fullName, int age, String phone, String email) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Employee() {
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
