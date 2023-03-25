package pt2;

import java.util.Random;

public class exerc9_c {
    public static void main(String[] args){
        Random random = new Random();
        int array[] = new int[10];
        for(int i = 1; i < array.length;i++){
            array[i] = random.nextInt(100) - 100; //basicamente int position = random.nextInt(size-min)+min;
            System.out.print(array[i] + " ");
        }
    }
}


