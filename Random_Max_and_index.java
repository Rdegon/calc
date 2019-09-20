
import java.util.*;

public class ananasiki {

    /**
     * Задание 2
     * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
     * Определите какой элемент является в этом массиве максимальным и
     * сообщите индекс его последнего вхождения в массив.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int Max= -15;
        int MaxId= 0;
        int[] s= new int [12];
        for(int i=0; i<12; i++){
            int b = rand.nextInt(15) -15;
            s[i]=b;
            System.out.print(b + " ");
        }
        System.out.println();

        for (int i = 0; i <s.length; i++){
            if(s[i] >= Max) {
                Max = s[i];
                MaxId = i;
            }

        }
        System.out.println("Максимальный элемент " + Max +" и его индекс "+ MaxId);
    }
}
