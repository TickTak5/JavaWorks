package homeworks;

public class HomeWork1 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++){
                System.out.print(" ");
                if(j == 8 || j == 9 ||  (i == 0 && j < 10) ){
                    System.out.print("*");
                }else if( j == 29 || j == 28 || (i == 0 && j > 19 && j < 32 ) ||  (i == 5 && j >= 29 ) ||(i == 9 && j >= 29 )){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
