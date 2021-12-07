import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int range;

        //range 50~80 (30)
        //range = random.nextInt(區間) + 底值
        //我取80-50個數 這個數是我的區間


        range = random.nextInt(80-50) + 50;

        System.out.println(range);


    }
}
