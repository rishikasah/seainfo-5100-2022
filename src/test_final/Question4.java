/*
Question 4: Given an integer n, return any array containing n unique integers such that they add up to 0.

        Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].


        Input: n = 3
        Output: [-1,0,1]
*/
package test_final;
public class Question4 {

    public int[] sumZero(int n) {

        int[] res = new int[n];
        int mid = n/2;
        for (int i=0; i<mid; i++) {

            int num = i+1;
            res[i] = num;
            res[n - 1 - i] = -num;
        }

        return res;
    }
}
