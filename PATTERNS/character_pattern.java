import java.util.*;
public class character_pattern {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of rows you want");
    int n=sc.nextInt();
    char ch='A';
    sc.close();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}    
}
