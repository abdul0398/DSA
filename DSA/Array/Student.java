class Student {
    private String name;
    int age;
    float marks;
    public Student(){
         
    }
    public Student(String name){
        this.name = name;

    }
    public Student(String name,int age,float marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
}
