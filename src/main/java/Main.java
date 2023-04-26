import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RenovationExpense> expenses = new ArrayList<>();
        boolean done = false;

        while (!done) {
            System.out.println("Enter the type of expense (or 'done' to finish):");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("done")) {
                done = true;
            } else {
                System.out.println("Enter the amount spent:");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter the date of the expense (in mm/dd/yyyy format):");
                String date = scanner.nextLine();

                RenovationExpense expense = new RenovationExpense(type, amount, date);
                expenses.add(expense);
            }
        }

        System.out.println("Here are the renovation expenses:");
        for (RenovationExpense expense : expenses) {
            System.out.println(expense.getType() + " - $" + expense.getAmount() + " - " + expense.getDate());
        }
    }


}
