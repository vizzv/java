class cartesian{
    double x,y,z;
    cartesian(){
        x=0;
        y=0;
        z=0;
    }
    cartesian(double tx,double ty,double tz){
        x=tx;
        y=ty;
        z=tz;

    }
    void display(){
        System.out.println("x cordinate is : "+x);
        System.out.println("y cordinate is : "+y);
        System.out.println("z cordinate is : "+z);
    }

    cartesian add_cartesion(cartesian a,cartesian b,cartesian c){
        cartesian k=new cartesian();
        k.x=a.x+b.x+c.x;
        k.y=a.y+b.y+c.y;
        k.z=a.z+b.z+c.z;

        return k;
    }
}
class cartesianClass {
    public static void main(String args[]){
    cartesian c2 =new cartesian(1,2,4);
    cartesian c3 =new cartesian(3,5,6);
    cartesian c4 =new cartesian(5.0,7,3);
    cartesian c1 =new cartesian();
    c1=c1.add_cartesion(c2,c3,c4);
    c1.display();}
    
    
}
