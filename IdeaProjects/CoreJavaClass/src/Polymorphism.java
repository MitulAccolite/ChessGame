/**
 * Created by Mitul Kapoor on 7/8/2016.
 */
public class Polymorphism {
    int x;
    int y;
    int z;

    public float add(){ return x+y+z; }

    public float add(int a,int b){ return a+b;}

    public static void main(String []args){
        Polymorphism polymorphism = new Polymorphism();
        System.out.println(polymorphism.add());
    }
}
