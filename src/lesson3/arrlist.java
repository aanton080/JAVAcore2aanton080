package lesson3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class arrlist {
    public static void main(String[] args) {
    String[] names = {"Вася","Петя","Юля","Вася","Маша","Ваня","Соня","Слава","Вася","Петя","Вова","Кристина","Соня","Вася","Петя"};
    Set<Object> list1 = new HashSet<>();
        for(int i=0;i<names.length;i++){
            list1.add(names[i]);
        }
        System.out.println(list1);

        for(int i=0;i<names.length;i++){
                System.out.println(names[i] + "=" + checkRepitition(names, names[i]));

    }

    }
    public static int checkRepitition( String[] array,String name){
        int numberOfRepitition =0;
        for(int i=0;i<array.length;i++){
            if(name.equals(array[i])){
                numberOfRepitition = numberOfRepitition+1;
            }

        }
        return numberOfRepitition;
    }

}
