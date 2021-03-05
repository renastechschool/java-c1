import java.util.Arrays;

@SuppressWarnings("all")



public class HomeworkArrays {
    public static void main(String[] args) {

        // Given an array of ints, return true if
        // 6 appears as either the first or last
        // element in the array.
        // The array will be length 1 or more.

        // solution 1
        // return nums[0] == 6 || nums[nums.length - 1] == 6;

        //solution 2
        // boolean result;
        // int l = nums.length;
        // if (nums[0] == 6) {
        //   result = true;
        // } else if (nums[l - 1] == 6) {
        //   result = true;
        // } else {
        //   result = false;
        // }
        // return result;



        // Given an array of ints, return true if
        // the array is length 1 or more, and the
        // first element and the last element are equal.

        // int[] nums = {1, 2, 3, 1};

        // solution 1
//        if (nums.length == 0) {
//            return false;
//        } else if (nums[0] == nums[nums.length - 1]) {
//            return true;
//        } else {
//            return false;
//        }

        // solution 2
//        if (
//            nums.length > 0 &&
//            nums[0] == nums[nums.length - 1]
//        ) {
//            return true;
//        } else {
//            return false;
//        }
        // solution 3
        // return (nums.length >= 1 && nums[0] ==  nums[nums.length-1]);


        // Given an array of ints length 3, figure
        // out which is larger, the first or last
        // element in the array, and set all the
        // other elements to be that value.
        // Return the changed array.
        //
        //
        //maxEnd3([1, 2, 3]) → [3, 3, 3]
        //maxEnd3([11, 5, 9]) → [11, 11, 11]
        //maxEnd3([2, 11, 3]) → [3, 3, 3]

//        int[] nums = {11, 5, 9};

        // solution 1
//        int largest = nums[0];
//        if (nums[2] > nums[0]){
//            largest = nums[2];
//        }
//        int[] newnums = {largest,largest,largest};
//        return newnums;

        // solution 2
//        int larger= nums[0];
//        if(nums[2]>nums[0]){
//            larger=nums[2];
//        }
//        nums[0]=larger;
//        nums[1]=larger;
//        nums[2]=larger;
//        return nums;

        // solution 3
//        int max= Math.max(nums[0],nums[2]);
//        nums[0]=max;
//        nums[1]=max;
//        nums[2]=max;
//        return nums;
       //  System.out.println( Math.max(1,3) );

        // condition ? true result : false result;

        // solution 4
//        int max = nums[0] > nums[2] ? nums[0] : nums[2];
//        for (int i = 0; i < 3; i++) {
//            nums[i] = max;
//        }

//        int[] nums = {11, 5, 9};
//        // solution 5                11
//        Arrays.fill(nums, Math.max(nums[0],nums[2]));
//        System.out.println(
//                Arrays.toString(nums)
//        );

//        String[] strings = {null, null, null};
//
//        Arrays.fill(strings, "hello");
//
//        System.out.println(
//                Arrays.toString(strings)
//        );

        // Given an array of ints,
        // return a new array length 2
        // containing the first and last
        // elements from the original array.
        // The original array will be length 1 or more.
        //
        //
        //makeEnds([1, 2, 3]) → [1, 3]
        //makeEnds([1, 2, 3, 4]) → [1, 4]
        //makeEnds([7, 4, 6, 2]) → [7, 2]

        // solution 1
//        int[] nums = {1, 2, 3, 4};
//
//        int length =nums.length;
//        int[] arr = {nums[0], nums[nums.length-1]};
//        return arr;

        // solution 2
//        int[] num ={1, 7, 8};
//
//        if(num.length<1){
//            System.out.println("noinput");
//        }else {
//            int[]array={num[0],num[num.length-1]};
//            System.out.println(Arrays.toString(array));
//        }

        // solution 3
//        int[] nums = {1, 2, 3, 4};
//        int[] myArray = new int[2];
//      //  if (nums.length == 1) {
//            myArray[0] = nums[0];
//            myArray[1] = nums[0];
//      //  } else {
//      //      myArray[0] = nums[0];
//      //      myArray[1] = nums[nums.length-1];
//      //  }
//        return myArray;

        // [1] length = 1 : length-1 = 0
        // [1,2,3] length = 3 : length-1 = 3




//        Given 2 int arrays, each length 2, return a
//        new array length 4 containing all their elements.
//
//
//        plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//        plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//        plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

        int[] a = {1, 2}, b = {3, 4}; // expect [1, 2, 3, 4]

//        int[] nu=new int[4];
//        nu[0]=a[0];
//        nu[1]=a[1];
//        nu[2]=b[0];
//        nu[3]=b[1];
        // return nu;

//        return new int[] {a[0], a[1] , b[0], b[1]};

//        int[] myArray = new int[4];
//        myArray[0] = a[0];
//        myArray[1] = a[1];
//        myArray[2] = b[0];
//        myArray[3] = b[1];
//
//        System.out.println(
//                Arrays.toString(myArray)
//        );


        // Given an array of ints of odd length,
        // return a new array length 3 containing
        // the elements from the middle of the array.
        // The array length will be at least 3.
        //
        //midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        //midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        //midThree([1, 2, 3]) → [1, 2, 3]

        // solution 1
//        int[] nums = {8, 6, 7, 5, 3, 0, 9};
//        int[] x= {
//            nums[nums.length/2-1],
//            nums[nums.length/2],
//            nums[nums.length/2+1]
//        };
        // return x;
//        int test = 7 / 2;
//        int remainder = 7 % 2;
//        System.out.println("7 / 2 = " + test + " remainder " + remainder);

//        System.out.println(
//                Arrays.toString(x)
//        );



//        Given an int array of any length,
//        return a new array of its first 2
//        elements. If the array is smaller
//        than length 2, use whatever elements
//        are present.
//
//        frontPiece([1, 2, 3]) → [1, 2]
//        frontPiece([1, 2]) → [1, 2]
//        frontPiece([1]) → [1]

//        int[] nums = {1, 2, 3};
//
//        int length =nums.length;
//
//        if(nums.length <=2){
//        return nums ;
//        }
//        int[] x= new int[2];
//        x[0]=nums[0];
//        x[1]=nums[1];
//        return x;
        // solution 2
//        if (nums.length < 2) return nums;
//        return new int[] {nums[0], nums[1]};


//        Start with 2 int arrays,
//        a and b, each length 2.
//        Consider the sum of the
//        values in each array.
//        Return the array which
//        has the largest sum.
//        In event of a tie, return a.
//
//
//        biggerTwo([1, 2], [3, 4]) → [3, 4]
//        biggerTwo([3, 4], [1, 2]) → [3, 4]
//        biggerTwo([1, 1], [1, 2]) → [1, 2]
//
//        int suma = a[0]+a[1];
//        int sumb = b[0]+b[1];
//        if(suma==sumb){
//            return a;
//        }
//        else if (suma >sumb){
//            return a;
//        }
//
//        return b;

    }

    public int[] swapEnds(int[] nums) {
        int length=nums.length;
        int temp = nums[0];
        nums[0] = nums[length-1];
        nums[length-1] = temp;
        return nums;
    }

}
