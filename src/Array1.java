import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr;
        arr = new int[5];
        for( int i = 0; i< arr.length; i++){
            System.out.println("enter a element for index"+i+":");
            arr[i]=sc.nextInt();
        }

        int even= 0;
        int odd = 0;
        for(int i = 0; i< arr.length; i++){
            if (arr[i]%2==0)
            even +=1;
            else
                odd+=1;

        }
        System.out.println("no of even : " + even);
        System.out.println("no of even : " + odd);
    }
}
