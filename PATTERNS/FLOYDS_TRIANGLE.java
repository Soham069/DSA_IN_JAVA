import java.util.*;
public class FLOYDS_TRIANGLE {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of rows :");
    int n=sc.nextInt();
    System.out.println("Enter the no. from which you want to start");
    int constant=sc.nextInt();
    sc.close();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(constant+" ");
            constant++;
        }
        System.out.println();
    }
}    
}
