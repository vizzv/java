
class maximum{
    int a,b,c;
    maximum(int x,int y, int z){
        a=x;
        b=y;
        c=z;
    }
    void ans(){
        int answer=Math.max(a,Math.max(b, c));
        System.out.println("\nmaximum number is :"+answer+"\n");
    }
}
class mxOfThree{
    
    public static void main(String args[]){
        int p,q,r;
        p=Integer.parseInt(args[0]);
        q=Integer.parseInt(args[1]);
        r=Integer.parseInt(args[2]);
        maximum mx=new maximum(p, q, r);
        mx.ans();

    }
}