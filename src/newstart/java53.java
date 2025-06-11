package newstart;

public class java53 {
    public static void main(String[] args) {


        // 1
      /* float [] marks = {34.5f , 56.6f , 45.5f, 67.8f, 89.6f};
        float sum = 0;
        for(float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
*/
        //  2
        /*
        float [] marks = {34.5f , 56.6f , 45.5f, 67.8f, 89.6f};
        float num = 89.6f;
        boolean isInArray =false;
        for(float element:marks) {
            if(num==element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }

         */
        // 3
        /*
        float [] marks = {34.5f , 56.6f , 45.5f, 67.8f, 89.6f};
        float sum = 0;
        for(float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value  of avg  marks is " + sum/marks.length);


         */
        // 4
        /*
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
            for (int i = 0; i < mat1.length; i++) { // row number of times
                for (int j = 0; j < mat1[i].length; j++) { // column number of time
                    System.out.print( result[i][j] + "  ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println("");
        }

         */
        // 5
        /*

        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1]= temp;
        }
for(int element: arr) {
    System.out.println(element + " ");
}


         */
        // 6
        /*
        int[] arr = {2, 2143, 3, 455, 5, 6};
        int max =  0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the maximum value of the maximum element in this array is:  " + max);


         */
     // 7
/*

        int[] arr = {2, 34, 567, 44, 334, 87};
        int min = arr[0];
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("the minimum value of the minimum element in this array is:  " + min);


 */

        // 8
        boolean isSorted = true;
        int[] arr = {1, 2, 3, 4, 5, 65  };
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;

            }
        }
        if(isSorted) {
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }



}