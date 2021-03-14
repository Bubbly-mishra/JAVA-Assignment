class pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {

                System.out.print(" *");

            }
            System.out.println();

        }

        System.out.println();

        int val = 8;

        int alphabet = 65;
        for (int i = 1; i <= 5; i++) {

            for (int j = val; j >= i; j--) {
                System.out.print(" ");

            }
            val = val - 1;
            for (int k = 1; k <= i; k++) {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}