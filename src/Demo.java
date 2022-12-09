public class Demo {
    public static void main(String[] args) {

        int[] test = new int[] {10,11,12,10,10,13,-11};



        System.out.println(NumberHelper.isSortedArray(test));

        test = NumberHelper.removeDuplicates(test);
        for (int number:
             test) {
            System.out.print(number + " ");
        }
    }
}
