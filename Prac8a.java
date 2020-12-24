class Prac8a
{  
public static void main(String args[])
{  
//creating two matrices    
int a[][]={{1,2},{3,4}};    
int b[][]={{5,6},{7,8}};    

//creating another matrix to store the multiplication of two matrices    
int c[][]=new int[2][2];
    
int i,j,k;
System.out.println("Matrix A");

for(i=0;i<2;i++)
{    
for(j=0;j<2;j++)
{
System.out.println(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Matrix B");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println(b[i][j]+" ");
}
System.out.println();
}
System.out.println("Matrix A*B");
for(i=0;i<2;i++)
{    
for(j=0;j<2;j++)
{
for(k=0;k<2;k++)      
{      
c[i][j] = c[i][j] + a[i][k]*b[k][j];      
}
System.out.println(c[i][j]+" ");  //printing matrix element  
}
System.out.println();//new line    
}    
}
}  
