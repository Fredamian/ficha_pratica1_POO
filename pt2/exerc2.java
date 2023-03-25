package pt2;

public class exerc2 {
    public static void main(String[] args){
        String[][] ff = new String[8][8];
        int i = 0;
        int j = 0;
        for(i = 0;i < 5;i++){
            for(j = 0;j < 5;j++){
                ff[i][j] = "*";
                System.out.print(ff[i][j]);
        }
        System.out.println(" ");
    }
} 
}
