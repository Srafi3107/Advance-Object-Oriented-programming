public class PayrollSystemTest {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 42);
        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        // Increase base salary of BasePlusCommissionEmployee by 10%
        for (Employee emp : employees) {
            if (emp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bpc = (BasePlusCommissionEmployee) emp;
                bpc.increaseBaseSalaryBy10Percent();
            }
        }

        // Display employee info and earnings
        for (Employee emp : employees) {
            System.out.println(emp.toString());
            System.out.printf("Earned: $%.2f\n\n", emp.earnings());
        }
    }
}
