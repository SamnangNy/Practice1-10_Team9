public class Practice10 {
    public static void main(String[] args) {
        int i;
        float total = 0;
        // 625 is the number of n character 
        for (i = 1; i < 625; i++) {
           total += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
 
        // total of summation 
        System.out.println("The total of summation is = " + total);
     }
}
 