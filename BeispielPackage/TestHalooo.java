package BeispielPackage;

import java.util.ArrayList;

public class TestHalooo {
    private ArrayList<Integer> intArrayList = new ArrayList<>();

    public static void main(String[] args) {
        int[] testArrayTest = new int[10];
        int sum = 0;
        for (int i = 0; i < testArrayTest.length; i++) {
            sum += 1;
            testArrayTest[i] = sum;
        }

        for (int i : testArrayTest) {
            System.out.println(i);
        }


        System.out.println("SIUUUU");

        berndprüfen();


    }

    /**
     * DAs istr eine Beispielklasse
     *
     */
    private static void berndprüfen() {

    }
}
