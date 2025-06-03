package dasgal3 ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double increase, newSalary;
        int percent;

        if (salary <= 400.00) {
            percent = 15;
        } else if (salary <= 800.00) {
            percent = 12;
        } else if (salary <= 1200.00) {
            percent = 10;
        } else if (salary <= 2000.00) {
            percent = 7;
        } else {
            percent = 4;
        }

        increase = salary * percent / 100.0;
        newSalary = salary + increase;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", increase);
        System.out.printf("Em percentual: %d %%\n", percent);
    }
}