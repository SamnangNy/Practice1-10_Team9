public class Practice7 { 
    public static void main(String[] args) { 
        int count = 0; 
 
        for(int i = 100; i <= 200; i++){ 
            if(i % 5 == 0 ^ i % 6 == 0) { // ^ Exclusive OR operator 
                count++; 
                if(count % 10 == 0) //10 numbers per line 
                    System.out.println(i); 
                else 
                    System.out.print(i + " "); 
            } 
        } 
    } 
}
    

