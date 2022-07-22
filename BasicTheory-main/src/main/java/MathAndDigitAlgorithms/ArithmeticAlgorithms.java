package MathAndDigitAlgorithms;

import java.util.Scanner;

/*
* Два различных натуральных числа n и m называются дружественными,
*  если сумма делителей числа n (включая 1, но исключая само n) равна числу m и наоборот.
*  Например, 220 и 284 – дружественные числа.
*  По данному числу k выведите все пары дружественных чисел, каждое из которых не превосходит k.*/

/*
* Гипотеза Гольдбаха (не доказанная до сих пор) утверждает,
*  что любое четное число (кроме 2) можно представить в виде суммы двух простых чисел.*/

/*
* К Василию приехали два его друга с отличной новостью:
*  они выиграли в лотерею N рублей.
*  Поскольку лотерейный билет был получен на сдачу во время общей закупки в магазине,
*  то его принадлежность определить не удалось.
*  Было решено разделить выигрыш поровну. Василий хотел бы узнать,
* возможно ли честно разделить выигрыш?*/

public class ArithmeticAlgorithms {
    Scanner scan = new Scanner(System.in);

    public void SumOfFractions(int a, int b, int c, int d) {
        int numerator = a * d + b * c;
        int denominator = b * d;
        System.out.println(numerator);
        System.out.println(denominator);
    }

    public void euclidAlgorithms(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }

    public void lagrangesTheorem(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        while ((a * a + b * b + c * c + d * d) != n) {
            while (a * a < n) {
                a++;
                if (a * a > n) {
                    a--;
                    break;
                }
            }
            if ((a * a + b * b + c * c + d * d) != n) {
                while (a * a + b * b < n) {
                    b++;
                    if (a * a + b * b > n) {
                        b--;
                        break;
                    }
                }
            }
            if ((a * a + b * b + c * c + d * d) != n) {
                while (a * a + b * b + c * c < n) {
                    c++;
                    if (a * a + b * b + c * c > n) {
                        c--;
                        break;
                    }
                }
            }
            if ((a * a + b * b + c * c + d * d) != n) {
                while (a * a + b * b + c * c + d * d == n) {
                    d++;
                }
            }
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }

    public void sumOfCubes(int n) {
        int a = 0;
        int b = 0;
        while (a * a * a < n) {
            a++;
            if (a * a * a > n) {
                a--;
                break;
            }
        }
        while (b * b * b + a * a * a < n) {
            b++;
            if (a * a * a + b * b * b > n) {
                b--;
                break;
            }
        }
        if (b * b * b + a * a * a == n) {
            System.out.println(b + " " + a);
        } else {
            System.out.println("impossible");
        }
    }

    public void friendlyNum(int n) {
        for (int i = 1; i < n; i++) {
            for (int j =i+1; j < n; j++) {
                int aDivisors = 0;
                int bDivisors = 0;
                for (int k = 1; k < i; k++) {
                    if (i % k == 0) {
                        aDivisors += k;
                    }
                }
                if (aDivisors!=j){
                    continue;
                }
                for (int k = 1; k < j; k++) {
                    if (j % k == 0) {
                        bDivisors += k;
                    }
                }
                if ((aDivisors == j) && (bDivisors == i)) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    //TODO 2 is prime too and check all primes
    public void goldbachsConjecture(int n){
       int sum = 0;
       int a = 0;
           for(int i = 1; i<n;i+=2){
               int count = 0;
               for (int j =1; j<=i;j++){
                   if (i%j==0){
                       count++;
                   }
               }
               if (count == 2){
                   sum = i;
               }
           }
           for(int i = 1; i<n;i+=2){
               int count = 0;
               if(i==1){
                   a =i;
                   continue;
               }
               if((sum+a)==n){
                   break;
               }
               for (int j =1; j<=i;j++){
                   if (i%j==0){
                       count++;
                   }
               }
               if (count == 2){
                   a=i;
               }
           }
       System.out.println(sum+" "+a);
    }
    public boolean isPrime(int n){
            int count = 0;
            for (int j =1; j<=n;j++){
                if (n%j==0){
                    count++;
                }
            }
            if (count == 2){
                return true;
            }
            else {
                return false;
            }
    }
    public boolean divisionByThree(int n){
        int sum = 0;
        int num = n;
        while (n>0){
            num=n%10;
            n/=10;
            sum+=num;
        }
        if (sum%3==0){
            return true;
        }
        return false;
    }
    public void primeFactors(int n){
        double sqrt = Math.sqrt(n);
        int currentValue = n;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
    }
    public void squareCut(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int count =0;
        while (max>0){
            max = max - min;
            if(max==0){
                count++;
                break;
            }
            if (max<0){
                break;
            }
            if (max<min){
            int tepm = max;
            max = min;
            min = max;}
            count++;
        }
        System.out.println(count);
    }

}
