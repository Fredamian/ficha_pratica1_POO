package pt2;
import java.util.Random;

public class exerc9_b {
    
    public static void main(String[] args){
        int total = 1;
        Random random = new Random();
        int array[] = new int[10];
        for(int i = 1; i < array.length;i++){
            array[i] = random.nextInt(30); //gerar numeros de 1 ate 30
            total = total * array[i];
             System.out.print(array[i] + " ");
        }
         System.out.print("E a total = " + total);
    }
}

