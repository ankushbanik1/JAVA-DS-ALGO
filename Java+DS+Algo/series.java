import java.util.Scanner;
public class series{
    public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
   // RESULTING THE SUM OF 1+1/2-1/3+1/4.......N
float result=0;
for(float i=1;i<=n;i++){
    if(i%2==0){
result -=1/i;

    }
else{
    result +=1/i;

}

    }

System.out.print(result);
    }
}