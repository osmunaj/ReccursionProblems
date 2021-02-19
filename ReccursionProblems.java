public class ReccursionProblems {
    public static void main(String[] args){
        // System.out.println(squareNumbers(9));
        // System.out.println(Log(32));
        // System.out.println(pow(5));
        // System.out.println(pentagon(4));
        //System.out.println(prime(9));

    }

    public static int squareNumbers(int n){
        if(n == 1) return 1;
        return ((squareNumbers(n - 1)) + 2 * n - 1);
    }

    public static int Log(int n){
        if(n == 1) return 0;
        return 1 + Log(n / 2);
    }
    public static int pow(int n){
        if(n == 0) return 1;
        return 2*pow(n - 1);
    }
    public static int pentagon(int n){
        if(n == 1) return 1;
        return (n * (3 * n - 1)) / 2;
    }
    public static int triangleNumber(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return (n - 2) + (n - 1) + n;
    }

    public static boolean prime(int n){
        return prime(n, n-1);
    }
    public static boolean prime(int n, int d){
        if(d == 1) return true;
        if(d % n == 0){
            return false;
        }else{
            return prime(n, d-1);
        }
    }


    

}
