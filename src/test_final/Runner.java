package test_final;

import java.sql.SQLOutput;

public class Runner {

    public static void main(String[] args) {

        // QUESTION 2
        System.out.println("QUESTION 2");
        Question2 q2 = new Question2();

        String ex1 = "aabcccccaaa";
        System.out.println("Input = " + ex1);
        System.out.println("Output = "+ q2.compressString(ex1));

        String ex2 = "ab";
        System.out.println("Input = " + ex2);
        System.out.println("Output = "+ q2.compressString(ex2));

        // QUESTION 3
        System.out.println("QUESTION 3");
        Question3 q3 = new Question3();
        String ex3 = "bbbbb";
        System.out.println("Input = " + ex3);
        System.out.println("Output = " + q3.lengthOfLongestSubstring(ex3));

        String ex4 = "pwwkew";
        System.out.println("Input = " + ex4);
        System.out.println("Output = " + q3.lengthOfLongestSubstring(ex4));

        // QUESTION 4
        System.out.println("QUESTION 4");
        Question4 q4 = new Question4();
        int ex5 = 5;
        System.out.println("Input = " + ex5);
        int [] res = q4.sumZero(ex5);

        System.out.print("Output = ");
        for(int r : res ){
            System.out.print(r + " ");
        }
        System.out.println();


        int ex6 = 3;
        System.out.println("Input = " + ex6);
        res = q4.sumZero(ex6);

        System.out.print("Output = ");
        for(int r : res ){
            System.out.print(r + " ");
        }
        System.out.println();

        // QUESTION 5
        System.out.println("QUESTION 5");
        Question5 q5 = new Question5();
        int arr1[] = {3,2,1,5,6,4};
        int arr2[] = {3,2,3,1,2,4,5,5,6};

        System.out.println("Input : k=2" );
        for(int a : arr1 ){
            System.out.print(a + " ");
        }
        System.out.println( "Output - " + q5.findKthLargest(arr1, 2));

        System.out.println("Input : k=4" );
        for(int a : arr2 ){
            System.out.print(a + " ");
        }
        System.out.println( "Output - " + q5.findKthLargest(arr2, 4));
    }
}
