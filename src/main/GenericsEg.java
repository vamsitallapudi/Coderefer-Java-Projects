package main;

class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public void print() {
        System.out.println("T is of type: " + ob.getClass().getSimpleName());
    }

    T getObj() {
        return ob;
    }
}


public class GenericsEg {
    public static void main(String[] args) {
        Gen<String> str = new Gen<>("Vamsi");
        str.print();
        System.out.println(str.getObj());
        Gen<Integer> integer = new Gen<>(1);
        integer.print();
        System.out.println(integer.getObj());
        Gen<Double> dbl = new Gen<>(1.5);
        dbl.print();
        System.out.println(dbl.getObj());
    }
}
