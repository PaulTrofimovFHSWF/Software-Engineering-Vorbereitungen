public class TestHalooo {
    public static void main(String[] args) {
        int[] testArray = new int[10];
        int sum = 0;
        for (int i = 0; i < testArray.length; i++) {
            sum += 1;
            testArray[i] = sum;
        }

        for (int i : testArray) {
            System.out.println(i);
        }

        System.out.println("SIUUUU");
        
    }
}
