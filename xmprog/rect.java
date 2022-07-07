import java.util.*;
class rectangle{
    double width,height;
    rectangle(){
        width=9.99;
        height=9.99;
    }
    rectangle(double x,double y){
        width=x;
        height=y;
    }
    void Area(){
        double area=width*height;
        System.out.println("Area of rectangle is : "+area);
    }
    void perimeter(){
        double peri=2*(width+height);
        System.out.println("Perimeter of rectagle is : "+peri);
    }
}
class rect{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.print("\nenter Width of rectangle :");
        a=sc.nextDouble();
        System.out.print("\nenter height of rectangle :");
        b=sc.nextDouble();
        System.out.println();
        rectangle rc=new rectangle(a,b);
        rc.perimeter();
        rc.Area();
        sc.close();
    }
}