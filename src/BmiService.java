public class BmiService {
    public static float calculate(float height, int weight) {
        float bmiIndex = weight / (height * height);
        return bmiIndex;
    }
}
