import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        int[][] employees = new int[10][2]; // [0] -> salary, [1] -> years of service
        Random rand = new Random();

        // Method to assign random salary and years of service
        assignSalaryAndService(employees, rand);

        // Method to calculate new salary and bonus
        double[][] salaryBonus = calculateSalaryBonus(employees);

        // Display results
        displayResults(employees, salaryBonus);
    }

    public static void assignSalaryAndService(int[][] employees, Random rand) {
        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = 10000 + rand.nextInt(90000); // Random 5-digit salary
            employees[i][1] = 1 + rand.nextInt(15); // Random years of service (1 to 15)
        }
    }

    public static double[][] calculateSalaryBonus(int[][] employees) {
        double[][] salaryBonus = new double[employees.length][3]; // salary, bonus, new salary
        for (int i = 0; i < employees.length; i++) {
            double bonus = 0;
            if (employees[i][1] > 5) {
                bonus = 0.05 * employees[i][0]; // 5% bonus
            } else {
                bonus = 0.02 * employees[i][0]; // 2% bonus
            }

            double newSalary = employees[i][0] + bonus;
            salaryBonus[i][0] = employees[i][0];
            salaryBonus[i][1] = bonus;
            salaryBonus[i][2] = newSalary;
        }
        return salaryBonus;
    }

    public static void displayResults(int[][] employees, double[][] salaryBonus) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\tNew Salary");
        for (int i = 0; i < employees.length; i++) {
            totalOldSalary += employees[i][0];
            totalBonus += salaryBonus[i][1];
            totalNewSalary += salaryBonus[i][2];
            System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t%.2f\n", i + 1, employees[i][0], employees[i][1], salaryBonus[i][1], salaryBonus[i][2]);
        }

        System.out.printf("\nTotal Old Salary: %.2f", totalOldSalary);
        System.out.printf("\nTotal New Salary: %.2f", totalNewSalary);
        System.out.printf("\nTotal Bonus: %.2f", totalBonus);
    }
}
