import java.util.*;

/**
 * Created by Wina Gen Sotto on February 17, 2017.
 */

public class Sampling {
    public static void main(String[] args) {
        int choice, p_size = 0, type, s_size = 0;
        ArrayList<Integer> frame_int;
        ArrayList<Character> frame_char;
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
                    } while (p_size <= 0);
                } catch (InputMismatchException imo) {
                    do {
                        System.out.print("Please enter a valid population size: ");
                        p_size = sc.nextInt();
                    } while (p_size <= 0);
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

                if (type == 1) {
                    frame_int = new ArrayList<>(p_size);

                    for (int i = 0; i < p_size; i++) {
                        try {
                            System.out.print("Enter a value for the sampling frame: ");
                            frame_int.add(i, sc.nextInt());
                        } catch (InputMismatchException imo) {
                            System.out.print("Please enter a valid value: ");
                            frame_int.add(i, sc.nextInt());
                        }
                    }
                } else {
                    frame_char = new ArrayList<>(p_size);

                    for (int i = 0; i < p_size; i++) {
                        try {
                            do {
                                System.out.print("Enter a value for the sampling frame: ");
                                frame_char.add(i, sc.nextLine().charAt(0));
                            } while ((frame_char.get(i) >= 'a' && frame_char.get(i) <='z') || (frame_char.get(i) >= 'A' && frame_char.get(i) <='Z'));
                        } catch (InputMismatchException imo) {
                            do {
                                System.out.print("Please enter a valid value: ");
                                frame_char.add(i, sc.nextLine().charAt(0));
                            } while ((frame_char.get(i) >= 'a' && frame_char.get(i) <='z') || (frame_char.get(i) >= 'A' && frame_char.get(i) <='Z'));                        }
                    }
                }

            }

            switch (choice) {
                case 1:  // Simple Random
                    try {
                        do {
                            System.out.print("Enter your sample size: ");
                            s_size = sc.nextInt();
                        } while (s_size <= 0 || s_size >= p_size);
                    } catch (InputMismatchException imo) {
                        do {
                            System.out.print("Please enter a valid sample size: ");
                            s_size = sc.nextInt();
                        } while (s_size <= 0 || s_size >= p_size);
                    }
                    break;
                case 2:  // Systematic
                    try {
                        do {
                            System.out.print("Enter your sample size: ");
                            s_size = sc.nextInt();
                        } while (s_size <= 1 || s_size >= p_size);
                    } catch (InputMismatchException imo) {
                        do {
                            System.out.print("Please enter a valid sample size: ");
                            s_size = sc.nextInt();
                        } while (s_size <= 1 || s_size >= p_size);
                    }
                    break;
                case 3:  // Stratified
                    //group to strata   // array of linked lists? UGHHH
                    // display strata

                    try {
                        do {
                            System.out.print("Enter a percentage: ");
                            s_size = sc.nextInt();
                        } while (s_size <= 0 || s_size >= 100);
                    } catch (InputMismatchException imo) {
                        do {
                            System.out.print("Please enter a valid percentage: ");
                            s_size = sc.nextInt();
                        } while (s_size <= 0 || s_size >= 100);
                    }

                    // random sampleS per strata
            }
        } while (choice != 4);
    }
}