

abstract class person{
    
    String name;
    String Address;
    String phoneNumber;
    String emailAddress;
    
}
class student extends person{
    String enrollCourse;
    student(String nm,String add,String em,String en,String pnum){
        name=nm;
        Address=add;
        emailAddress=em;
        phoneNumber=pnum;
        enrollCourse=en;
    }
    
}
class employee extends person{
    String salary;
    String designation;
    employee(String nm,String add,String em,String des,String pnum,String sala){
        name=nm;
        Address=add;
        emailAddress=em;
        phoneNumber=pnum;
        designation=des;
        salary=sala;
    }
}
class persn {
    public static void main(String args[]){
        student prayag =new student("prayag","c/204 Apeksha Avenue" ,"machoprayag@gmail.com","Science-Maths","9924518771");
        employee vishw=new employee("vishw","c/204 apeksha avenue","vishwa10032003@gmail.com","C.E.O","8160599934","30000000");
        System.out.println(prayag.phoneNumber);
        System.out.println(vishw.salary);
    }
}
