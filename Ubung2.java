
package JavaHexletWebinar;

public class Ubung2 {
    public static void main(String[] args) {
        System.out.println("Hello java developers!");
        int lowerBound = 0;
        int upperBound = 20;
        
        System.out.println("Lower Bound: " + lowerBound);
        System.out.println("Upper Bound: " + upperBound);
        
        for(int i = lowerBound; i <= upperBound; i++){
            if(i%15 == 0 ){
                    System.out.println("FizzBuzz");
            }else{
                if(i% 3 == 0){
                    System.out.println("Fizz");
                }else if(i% 5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
        }       
    }
}



/*
Реализуйте метод fizzBuzz(), который выводит на экран числа в диапазоне
от begin до end. При этом:
    Если делится без остатка на 3, то вместо него выводится на экран слово "Fizz"
    Если делится без остатка на 5, то вместо него выводится на экран слово "Buzz"
    Если делится без остатка и на 3 и на 5, то вместо него выводится на экран слово "FizzBuzz"
    В остальных случаях выводится само число
*/
/*
Implement a fizzBuzz() method that displays numbers in a range
from begin to end. Wherein:
    If it is divisible by 3 without a remainder, then the word "Fizz" is displayed instead.
    If it is divisible by 5 without a remainder, then the word "Buzz" is displayed instead.
    If divisible without remainder by both 3 and 5, then instead of it the word "FizzBuzz" is displayed on the screen
    In other cases, the number itself is displayed
*/

