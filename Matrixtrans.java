public class MatrixTrans{  
public static void main(String args[]){  
int original1[][]={{1,3,4},{2,4,3},{3,4,5}};    
    
 
int trans[][]=new int[3][3];   
 
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
trans[i][j]=original1[j][i];  
}    
}    
  
System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(original1[i][j]+" ");    
}    
System.out.println();  
}    
System.out.println("Printing Matrix After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(trans[i][j]+" ");    
}    
System.out.println();  
}    
}}  
