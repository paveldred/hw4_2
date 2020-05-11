import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свой рост, м (например, 1.8):");

        float userHeight = Float.parseFloat(reader.readLine());
        System.out.println("Введите свой вес, кг (например, 65:");
        int userWeight = Integer.parseInt(reader.readLine());
        System.out.println("Ваш индекс массы тела: " + Math.round(BmiService.calculate(userHeight, userWeight)));

    }
}
