package lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class telephoneDirectory {
    public static void main(String[] args) {


        LinkedList<String> Petrov = new LinkedList<>();
        Petrov.add("89151551213");
        Petrov.add("89161552334");
        Petrov.add("89263557219");
        LinkedList<String> Ivanov = new LinkedList<>();
        Ivanov.add("89999087889");
        LinkedList<String> Sidorov = new LinkedList<>();
        Sidorov.add("89179581180");


        Map<String, LinkedList> directory = new TreeMap<>();
        directory.put("Петров",Petrov);
        directory.put("Иванов",Ivanov);
        directory.put("Сидоров",Sidorov);

        add(directory,"Пупкин","89101233456");


        System.out.println(directory.get("Петров"));
        System.out.println(directory);

    }
        public static void add(Map directory,String key,String value){
            directory.put(key,value);
        }

}