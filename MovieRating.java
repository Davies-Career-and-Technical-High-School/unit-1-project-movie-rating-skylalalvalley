import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
        
        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the movie name ");
        String name = scan.nextLine();
        System.out.println("Please enter the running time in minuets.");
        int min = scan.nextInt();
        System.out.println("Please enter ratings from the movie review website.");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println("Please enter ratings from the focus group.");
        double r = scan.nextDouble();
        double q = scan.nextDouble();
        System.out.println("Please enter the average movie critic rating.");
        double ave = scan.nextDouble();
        System.out.println("Title: " + name);
        int hour = (int) min / 60;
        int minuets = (min % 60);
        System.out.println("Running time: " + hour + "h" + minuets);
        double num1 = (x * 1.0 + y * 1.0 + z * 1.0) / 3 * 1.0;
        System.out.println("Average website rating: " + num1);
        double num2 = (r * 1.0 + q * 1.0) / 2 * 1.0;
        System.out.println("Average focus group rating: " + num2);
        System.out.println("Average movie critic rating: " + ave);
        double tot1 = (num1 * 0.2 + num2 * .3 + ave * .5); 
        double fin = tot1 + 0.5;
        System.out.println("Overall movie rating: " + (int)fin);

       

    }
}