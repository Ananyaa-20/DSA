 //An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.  
public boolean isUgly(int n) {
         if (n == 0) return false;
        for (int i = 2; i <= 5; i += i-1)   
            while (n % i == 0)
                n /= i;
        return n == 1;
    }
