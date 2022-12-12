public class Students implements Comparable<Students>{
    private int age;
    private String name;
    public Students(int age,String name){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Students o) {
        return o.name.compareTo(this.name);
    }

}
