public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.0000,10));
    }
}
class Solution {
    public double myPow(double x, int n) {
        double answer =1;
        if(n<0){  // Here we check if the value of n is negative and if it is negative we convert it to a positive number.
            x= 1/x;
            n = n-(n*2);
        }
        for(int i=0; i<n; i++){  // In the loop we multiply the number by itself and get the result.
            answer = (answer*x);
        }
        return answer;
    }
}

//Test Cases
//x = 2.000 n = 10, x = 2.100 n = 3, x = 2.000 n = -2