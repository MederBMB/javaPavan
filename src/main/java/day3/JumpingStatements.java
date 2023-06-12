package day3;

public class JumpingStatements {
    public static void main(String[] args) {
        /*for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i); // 1, 2, 3, 4 vytashit do 5
        }*/
        /*for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i); // vytashit vse krome 5
        }*/

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 5 || i == 7) {
                continue;
            }
            System.out.println(i); // vytashit vse krome 3, 5, 7
        }
    }
}