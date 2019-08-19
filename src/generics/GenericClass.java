package generics;

import java.util.ArrayList;

/** Generics - zadanie domowe
 *
 * @param <T>
 * @param <U>
 */

public class GenericClass<T, U> {
    private T tObject;
    private U uObject;

    public GenericClass(T tObject, U uObject) {
        this.tObject = tObject;
        this.uObject = uObject;
    }

    public static void main(String[] args) {

        GenericClass<String, Integer> g1 = new GenericClass<>("Marik", 1234);
        GenericClass<Integer, Integer> g2 = new GenericClass<>(1989, 2019);
        GenericClass<String, String> g3 = new GenericClass<>("Hello", "Moto");

        ArrayList<GenericClass> list = new ArrayList<>();
        list.add(g1);
        list.add(g2);
        list.add(g3);

        System.out.println(list.get(0).tObject + " " + list.get(0).uObject);
        System.out.println(list.get(1).tObject + " " + list.get(1).uObject);
        System.out.println(list.get(2).tObject + " " + list.get(2).uObject);
    }

}



