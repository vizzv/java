class Fan{
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;

    int speed;
    boolean f_on;
    double radius;
    String color;
    Fan(){
        speed=SLOW;
        f_on=false;
        radius=4;
        color="blue";
    }
    Fan(int sp,boolean fOn,double r,String kolor){
        speed=sp;
        f_on=fOn;
        radius=r;
        color=kolor;
    }
    void display(){
        if(f_on){
            System.out.println("speed of fan is ---> "+speed);
            System.out.println("color of fan is ---> "+color);
            System.out.println("radius of fan is ---> "+radius);
        }
        else{
            System.out.println("color of fan is ---> "+color);
            System.out.println("radius of fan is ---> "+radius);
            System.out.println("fan is off");

        }
    }
}

class fanClass {
    public static void main(String args[]){
        Fan f1=new Fan();
        Fan f2=new Fan(2,true,6,"brown");
        f1.display();
        f2.display();
    }
}
