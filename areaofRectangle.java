public class areaofRectangle {
int len;
int breath;
void insert(int l,int b){
    len=l;
    breath=b;
}
void calculateArea(){System.out.println(len*breath);}
public static void main(String args[]){
areaofRectangle r1=new areaofRectangle();
areaofRectangle r2=new areaofRectangle();
r1.insert(11,5);
r2.insert(3,15);
r1.calculateArea();
r2.calculateArea();
}
} 
