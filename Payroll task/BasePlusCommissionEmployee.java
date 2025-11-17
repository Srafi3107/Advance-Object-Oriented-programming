public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void increaseBaseSalaryBy10Percent() {
        baseSalary *= 1.10; // increase by 10%
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base Plus Commission Employee: %s\nBase Salary: %.2f",
                super.toString(), baseSalary);
    }
}
