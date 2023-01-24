public class Converter {
    public static float rubleToEuro(float value) {
        return value / 50;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("Total " + rubleToDollar(600));
        System.out.println("Total " + rubleToEuro(500));
    }
}