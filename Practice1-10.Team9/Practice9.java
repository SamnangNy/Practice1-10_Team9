public class Practice9{
    public static void man(String[] args) {
        for (int i = 1 ; i < 10000; i++){
            int sum = 0;
            // findind element for perfect number //
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                sum = sum+j;

        }
        if (i == sum) // identify as a perfect number //
        System.out.println(i);
        }
    }
}

    

