import java.util.Scanner;
class Rectangle{
    double x,y,width,height;

    Rectangle(){
        x=0;
        y=0;

        width=1;
        height=1;
    }
    Rectangle(double xx,double yy,double w1,double h1){
        x=xx;
        y=yy;
        width=w1;
        height=h1;

    }

    double getArea(){
        double area=width*height;

        return area;
    }
    double getPerimeter(){
        double perimeter=2*(width+height);

        return perimeter;
    }
    boolean contains(double px,double py){

        if(py<((y+height)/2) && py>((y-height)/2)){
            if(px<((x+height)/2) && px>((x-height)/2)){
                return true;
            }
            else{return false;}
        }
        else{return false;}
    }
}

class rectClass {
    public static void main(String[] args) {
        double mx=0,my=0,w=0,h=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter mid x-point");
        mx=sc.nextDouble();
        System.out.println("enter mid y-point");
        my=sc.nextDouble();
        System.out.println("enter width");
        w=sc.nextDouble();
        System.out.println("enter height");
        h=sc.nextDouble();
        
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(mx,my,w,h);

        r1.getArea();
        r1.getPerimeter();
        System.out.println("area is : "+r1.getArea());
        System.out.println("perimeter is : "+r1.getPerimeter());
       
        if(r2.contains(6.7,9.5)){
        System.out.println("point is inside the rectrangle");
            }
        else{
        System.out.println("point is outside the rectrangle");
            }

        System.out.println("area is : "+r2.getArea());
        System.out.println("perimeter is : "+r2.getPerimeter());
        if(r2.contains(5,7)){
            System.out.println("point is inside the rectrangle");
        }
        else{
            System.out.println("point is outside the rectrangle");
        }
        sc.close();
    }
}
