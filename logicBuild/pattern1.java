
public class pattern1 {

    public static void main(String[] args) {
        int n = 5;
        //pattern1(n);
        //pattern2(n);
        //pattern3(n);
        //pattern4(n);
        //pattern5(n);
        //pattern6(n);
        //pattern7(n);
        //pattern8(n);
        //pattern10(n);
        //pattern11(n);
        //pattern12(n);
        //pattern13(n);
        //pattern14(n);
        //pattern15(n);
        //pattern16(n);
        //pattern17(n);
    }

    public static void pattern1(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * number - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int number) {
        for (int i = 1; i <= 2 * number - 1; i++) {
            int stars = i;
            if (i > number) {
                stars = 2 * number - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int number) {
        int start = 1;
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();

        }
    }

    public static void pattern12(int number) {
        int space = 2 * (number - 1);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
    }

    public static void pattern13(int number) {
        int num = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int number) {
        for (int i = 0; i < number; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern15(int number) {
        for (int i = 0; i < number; i++) {
            for (char ch = 'A'; ch < 'A' + number - i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern16(int number) {
        for (int i = 0; i < number; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}
