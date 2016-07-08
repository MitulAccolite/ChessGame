/**
 * Created by Mitul Kapoor on 7/8/2016.
 */
public class Main {
    public static void main(String []args){
        Parent parent = new Parent();
        Child child = new Child();
        parent = child;
        System.out.println(parent.x);
    }
}
