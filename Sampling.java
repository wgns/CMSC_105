package Lab1;

import java.util.*;

/**
 * Created by Wina Gen Sotto on February 17, 2017.
 */

public class Sampling {
   public static void main(String[] args) {
      int choice, p_size, type, s_size = 0;
      ArrayList<Character> frame;
      Scanner sc = new Scanner(System.in);

      do {
         System.out.println("\nMENU:\n1. Simple Random Sampling\n2. Systematic Sampling\n3. Stratified Sampling\n4. Quit\n");

         try {
            do {
               System.out.print("Enter your choice here: ");
               choice = sc.nextInt();
            } while (choice < 1 || choice > 4);
         } catch (InputMismatchException imo) {
            do {
               System.out.print("Please enter a valid choice: ");
               choice = sc.nextInt();
            } while (choice < 1 || choice > 4);
         }

         if (choice != 4) {
            try {
               do {
                  System.out.print("Enter your population size: ");
                  p_size = sc.nextInt();
               } while (choice <= 0);
            } catch (InputMismatchException imo) {
               do {
                  System.out.print("Please enter a valid population size: ");
                  p_size = sc.nextInt();
               } while (choice <= 0);
            }

            try {
               do {
                  System.out.print("(1) Numbers\t(2) Letters\nEnter the number of the type of items in your sampling frame: ");
                  type = sc.nextInt();
               } while (type < 1 || type > 2);
            } catch (InputMismatchException imo) {
               do {
                  System.out.print("Please enter a valid type: ");
                  type = sc.nextInt();
               } while (type < 1 || type > 2);
            }

            frame = new ArrayList<>(p_size);

            for (int i = 0; i < p_size; i++) {
            }
         }

         switch (choice) {
            case 1:  // Simple Random
               break;
            case 2:  // Systemetic
               break;
            case 3:  // Stratified
               //
         }
      } while (choice != 4);
   }
}
