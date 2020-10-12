import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
//INSERTION SORT
Scanner s= new Scanner(System.in);
int n= s.nextInt();
int[] a=new int[n];
for(int j=0;j<n;j++){
    a[j]= s.nextInt();
}
 for(int i=1;i<n;i++){
     int j=i;
    
    int temp=a[i];
    while(j>0  && temp<a[j-1])
    {
        
        a[j]=a[j-1];
        j=j-1;
       
    } 
      a[j]=temp;   
     
     
 } 
  for(int k=0;k<n;k++){
 System.out.print(a[k]+" ");    
 }
 
    }
}
