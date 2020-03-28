import java.util.Scanner;
public class prime{
    public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
boolean isprime=true;
// CHECEKING THE PRIME NUMBER
   for(int i=2;i*i<=n;i++){
       if(n%i==0){
isprime=false;
break;
       }
   }
   if(n<2)isprime=false;

    System.out.print("isprime  "+isprime);
   }

    }
