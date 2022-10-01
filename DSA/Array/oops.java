package DSA.Array;
public class oops {
    public static void main(String[] args) {
        new practice();
        Student abdul = new Student();
        Student anas = new Student(13,"anass",86.5f);
        System.out.println(abdul.roll + " " +  anas.roll);
        abdul.greeting();
        abdul.changeName("Dungeon");
        System.out.println(abdul.name);
        
    }
    static class  Student{
        int roll;
        String name ;
        float marks;
        void changeName(String newname){
            this.name = newname;
        }
        void greeting(){
            System.out.println("Hello, my name is " + this.name);
        }
        Student(int roll, String name, float marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
        Student(){
            this.roll = 13;
            this.name = "Abdul";
            this.marks = 86.4f;
        }
        
    }
   
    
    
    
}
