import java.util.*;
public class PRINT_REVERSE_OF_NO {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no.(large number):");
    int n=sc.nextInt();
    int lastdigit=0;
    sc.close();
    System.out.println();

    while(n>0){
        lastdigit=n%10;
        System.out.print(lastdigit);
        n=n/10;
    }
}    
}
