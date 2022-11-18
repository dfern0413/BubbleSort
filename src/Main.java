public class Main {
    public static void main(String[] args) {
        //Make a variable to hold value when swaping
        int temp;
        // Array to sort
        int[] Array = {115, 17, 5, 3, 20, 0, 19, 2 , 8};
        // 2 for loops, one iterates through the array doing the swapping and the other makes sure the second array runs
        // enough time to sort array
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length-1; j++) {
                if (Array[j] > Array[j+1]) {
                    temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
        // Print the bubble sorted array
        for (int i : Array) {
            System.out.println(i);
        }
    }
}