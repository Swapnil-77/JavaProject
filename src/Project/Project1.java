package Project;

import java.util.Scanner;

public class ExpenceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] categories = new String[100];
        int[] amounts = new int[100];
        int count =0;

        while (true) {
            System.out.println("\n  Expense Tracker Menu ");
            System.out.println("1. Add Expense");
            System.out.println("2. View Summary");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
//            System.out.println("Choose an option: ");
//            if (!sc.hasNextInt()) {
//                System.out.println("❌ Please enter a number.");
//                sc.nextLine(); // clear the invalid input
//                continue;
//            }
//            int choice = sc.nextInt();
//            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.println("Enter category (e.g., food,travel");
                String category = sc.nextLine();
                System.out.println("Enter amount (₹):");
                int amount = sc.nextInt();
                sc.nextLine();
//                System.out.println("Enter amount (₹):");
//                if (!sc.hasNextInt()) {
//                    System.out.println("❌ Invalid amount. Please enter a number.");
//                    sc.nextLine(); // clear invalid input
//                    continue;
//                }
//                int amount = sc.nextInt();
//                sc.nextLine(); // clear buffer

                categories[count] = category;
                amounts[count] = amount;
                count++;

                System.out.println("✅ Expense added!");
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No expence to show yet. ");
                    continue;
                }
                System.out.println("\n Expense Summary: ");
                int total = 0;

                // Show summary per category
                for (int i = 0; i < count; i++) {
                    boolean alreadyShown = false;

                    for (int j = 0; j < i; j++) {
                        if (categories[i].equalsIgnoreCase(categories[j])){
                            alreadyShown = true;
                            break;
                        }
                    }
                    if (!alreadyShown) {
                        int categoryTotal = 0;
                        for (int k = 0; k < count; k++) {
                            if (categories[i].equalsIgnoreCase(categories[k])) {
                                categoryTotal += amounts[k];
                            }
                        }
                        System.out.println("🗂 " + categories[i] + ": ₹" + categoryTotal);
                        total += categoryTotal;
                    }
                }

                System.out.println("💰 Total: ₹" + total);
            }
            else if (choice == 3) {
                System.out.println("👋 Thank you for using Expense Tracker!");
                break;
            }
            else {
                System.out.println("❌ Invalid choice. Please try again.");
            }
        }

        sc.close();
    }

}
