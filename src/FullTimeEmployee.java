public class FullTimeEmployee extends Employee {
    int bonus;
    int fines;
    int fixSalary;

    public FullTimeEmployee(int employeeCode, String fullName, int age, String phone, String email, int bonus, int fines, int fixSalary) {
        this.bonus = bonus;
        this.fines = fines;
        this.fixSalary = fixSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(int fixSalary) {
        this.fixSalary = fixSalary;
    }
}
