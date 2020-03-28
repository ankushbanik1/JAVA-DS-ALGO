import java.util.Scanner;
public class pat8{
    public static void main(String[] args){
   Scanner sc =new Scanner(System.in);

   int n=sc.nextInt();
   
System.out.println("* ");

for(int i=2;i<=n-1;i++){
       System.out.print("* ");
       for(int j=1;j<=i-2;j++){
       System.out.print("  ");
       
}System.out.println("* ");
}
if(n>1){
for(int k=1;k<=n;k++){
   System.out.print("* "); 
}
}


}}