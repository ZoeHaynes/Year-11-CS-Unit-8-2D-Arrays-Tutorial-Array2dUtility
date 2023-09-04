
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] arr2){
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                System.out.println(arr2[i][j]);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] arr2){
        int sum = 0;
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                sum += arr2[i][j];
            }
        }
        return sum;

    }


    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] arr2){
        double sum = sum(arr2);
        double average = sum/(arr2.length*arr2.length);
        return average;

    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] arr2){
        int minimumValue = arr2[0][0];
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(minimumValue>=arr2[i][j]){
                    minimumValue = arr2[i][j];
                }
            }
        }

        return minimumValue;

    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr2){
        int maximumValue = arr2[0][0];
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(maximumValue<=arr2[i][j]){
                    maximumValue = arr2[i][j];
                }
            }
        }

        return maximumValue;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr2){
        int evenNumbers =0;
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr2[i][j]%2==0){
                    evenNumbers++;
                }
            }
        }
        return evenNumbers;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] arr2){
        int evenNumbers =0;
        for (int[] ints : arr2) {
            for (int j = 0; j < arr2.length; j++) {
                if (ints[j] % 2 == 0) {
                    evenNumbers++;
                }
            }
        }
        return evenNumbers;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] arr2){
        for (int[] ints : arr2) {
            for (int j = 0; j < arr2.length; j++) {
                if (ints[j]<0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] arr2){
        int rowCount = arr2.length;
        int[] rowSum = new int[rowCount];
        for(int i = 0; i<arr2.length; i++){
            int sum = 0;
            for(int j = 0; j<arr2.length; j++){
                sum+=arr2[i][j];

            }
            rowSum[i] = sum;

        }
        return rowSum;

    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] arr2){
        int rowCount = arr2.length;
        int[] colSum = new int[rowCount];
        for(int i = 0; i<arr2.length; i++){
            int sum = 0;
            for(int j = 0; j<arr2.length; j++){
                sum+=arr2[j][i];

            }
            colSum[i] = sum;

        }
        return colSum;
    }



}
