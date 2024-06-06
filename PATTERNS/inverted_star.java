import java.util.*;
public class inverted_star{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows you want in your pattern");
        int n=sc.nextInt(); //n is the no.of rows
        sc.close();
        for(int i=1;i<=n;i++){  //this loop will run till total no of rows
            for(int j=1;j<=n-i+1;j++){ //this loop will run till no of stars in each row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}