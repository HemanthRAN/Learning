package m1;
import java.util.Scanner;

public class TheJourneyCal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of speed and time:");
        double speed = scan.nextDouble();
        double time = scan.nextDouble();
        scan.close();
        TheJourneyCal c1 = new TheJourneyCal();

        System.out.println(c1.calculateDistance(speed, time));
    }
    
    public double calculateDistance(double speed, double time) {
        return speed * time;
    }
}

