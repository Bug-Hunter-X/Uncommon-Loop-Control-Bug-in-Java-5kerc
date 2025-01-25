public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 10) {
                System.out.println("Sum exceeds 10");
                break; 
            }
        }
        System.out.println("Final sum: " + sum);

        //Demonstrates a different case of the bug:
        int[] arr2 = {10, 20, 30};
        int sum2 = 0;
        for(int i = 0; i < arr2.length; i++){
            sum2 += arr2[i];
            if(sum2 > 50){
                System.out.println("Sum exceeds 50");
                break; 
            }
        }
        System.out.println("Final sum2: " + sum2);
    }
}