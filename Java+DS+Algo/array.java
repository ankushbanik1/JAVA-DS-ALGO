import java.util.Scanner;
public class array{
    public static void main(String[] args){
Scanner sc =new Scanner(System.in);
   System.out.print("  enter row ");

   System.out.print("  enter col");

   int row=sc.nextInt();
   int col=sc.nextInt();
   int a[][]=new int [row][col];
   int b[][]=new int [row][col];
   System.out.print("  enter array a");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        a[i][j]=sc.nextInt();
    }
}


   System.out.print("  enter array b");

for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        b[i][j]=sc.nextInt();
    }
}

int c[][] =new int[row][col];
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        c[i][j]=a[i][j]+b[i][j];
    }
}
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(c[i][j]+" c");
    }
}
    }}