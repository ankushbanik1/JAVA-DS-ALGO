import java.util.Scanner;
public class pat7{
    public static void main(String[] args){
   Scanner sc =new Scanner(System.in);

   int n=sc.nextInt();
   
int row=2*n-1;
for(int j=1;j<=row;j++){

if(j<=n)


for(int i=1;i<=j;i++){
    System.out.print("* ");}
   else{
        for(int i=1;i<=row-j+1;i++){
    System.out.print("* ");
    }
}System.out.println();
}
}

    
}

    

