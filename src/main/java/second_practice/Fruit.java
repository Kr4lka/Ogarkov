package second_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fruit {

    public List<String> fruits;

    public Fruit() {
        createTable();
        System.out.println(fruits);
        remove();
        System.out.println(fruits);
    }

    public void createTable(){
        fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Peach");
    }

    public void remove(){
        fruits.remove(1);
    }
}
