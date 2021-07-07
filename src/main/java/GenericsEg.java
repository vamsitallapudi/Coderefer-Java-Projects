import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Type is declared at Class Level - Parameterized class
class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

//    method which type param is declared. - Parameterized method
    public <X> void testMethod(X ob) {
//        we can use X anywhere within this method
//        based on our requirement.
        System.out.println(ob.toString());
    }

    public void print() {
        System.out.println("T is of type: " + ob.getClass().getSimpleName());
    }

    T getObj() {
        return ob;
    }

    public <A> void m1(ArrayList<A>  a) {
        for(A i : a) {
            System.out.println(i.toString());
        }
    }
}

public class GenericsEg {
    public static void main(String[] args) {
        Gen<String> str = new Gen<>("Vamsi");
        str.print();
        str.m1(new ArrayList<String>());
        System.out.println(str.getObj());
        Gen<Integer> integer = new Gen<>(1);
        integer.print();
        System.out.println(integer.getObj());
        Gen<? extends Number> dbl = new Gen<>(1.5);
        myGen(dbl);
        dbl.print();
        System.out.println(dbl.getObj());
        Gen<? super IllegalArgumentException> x= new Gen<>(new Exception("testing"));
        x.print();
        x.testMethod(new String("HelloWorld"));
        System.out.println(x.getObj());

        List<String> strings = new ArrayList<>(); // some list that contains some strings
        strings.add("Vamsi");

// Totally legal since you used the raw type and lost all type checking!
//        List<Integer> integers = new LinkedList(strings);
    }
    public static void myGen(Gen<?> x){
        System.out.println(x.getObj().toString());
    }
}
