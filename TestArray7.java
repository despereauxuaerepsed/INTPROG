import java.util.Arrays;
import java.util.Scanner;
public class TestArray7 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       double[] price = new double[4];
       int ctr;

       ctr = 0;
       while(ctr <= 3){
          System.out.print("Price " + ctr + " : ");
          price[ctr] = s.nextDouble();
          ctr = ctr + 1;
       }
       s.close();
    }
}