package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int max12 = (first >= second) ? first : second;

        int max = (max12 >= third) ? max12 : third;

        System.out.println(max);
    }
}
