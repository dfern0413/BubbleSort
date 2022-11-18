public class Main {
    public static void main(String[] args) {
        //Make a variable to hold value when swapping
        int temp;
        // Array to sort
        int[] array = {115, 17, 5, 3, 20, 0, 19, 2 , 8, 888};
        // 2 for loops, one iterates through the array doing the swapping and the other makes sure the second array runs
        // enough time to sort array
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // Print the bubble sorted array
        for (int i : array) {
            System.out.println(i);
        }
    }
}