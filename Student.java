package Day4;
class Student1{
    static  String schlname="abc"; //static variable same for all obejct , so dont need object to call, need only class
    String stdntname; //diff for each object
    Student1 (String name){ //constructor
        this.stdntname=name; //this stores the ref of cuurent object. uesd for instance variable.
    }
    static void showschool(){
        System.out.println("school: "+schlname);
    }
    void showstdent(){
        System.out.println("student: "+ stdntname);
    }
}
public class Student {
    public static void main(String[] args){
        Student1.showschool(); //called without object.
        Student1 s1=new Student1("ansh");
        Student1 s2=new Student1("aryan");
        s1.showstdent();
        s2.showstdent();
        //change static variable (affects all object)
        Student1.schlname="xyz";
        //non static method will show updated value
        Student1.showschool();
    }
}            
