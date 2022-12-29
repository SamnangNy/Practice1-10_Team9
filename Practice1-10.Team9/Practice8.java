public class Practice8 { 
    public static void main(String[] args) { 
        // series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99 
        double sum = 0.0; 
 
        for(double i = 1.0; i <= 97.0; i += 2) { 
            sum += i / (i+2); 
        } 
 
        System.out.printf("\nThe sum of series is %.2f", sum); //only show 2 digits after decimal 
    } 
}