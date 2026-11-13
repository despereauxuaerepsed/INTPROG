public class TestArray6 {
    public static void main(String[] args) {
        int[] num = new int[7];
        int ctr, sum;
       
        num[0] = 5;
        num[1] = 3;
        num[2] = 20;
        num[3] = 16;
        num[4] = 12;
        num[5] = 2;
        num[6] = 8;

        sum = 0;
        for(ctr=0;ctr<=6;ctr++){
            sum = sum + num[ctr];
        }
        System.out.println("The sum is: " + sum);
    }
    
}
