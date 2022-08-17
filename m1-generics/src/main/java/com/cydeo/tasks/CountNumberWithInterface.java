package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountNumberWithInterface {

        public static void main(String[] args) {
            List<Integer> ci = Arrays.asList(1, 2, 3, 4);
            int count = countIf(ci, new OddPredicate());
            System.out.println("Number of odd integers = " + count);

        }

        // I create generic method because, for example we put the implementation of UnaryPredicate for
        //OddPredicate, but that could be more than one implementation. I can create another class which will
        //implement UnaryPredicate but responsibility(implementation) will be to find PrimeNumbers. So generic
        //method will be able to accept both classes
        private static <T> int countIf(List<T> c, UnaryPredicate<T> p) {
//List<T> because we might use Double or Integer.
//If we use OddPredicate oddPredicate and if you try to pass another object belonging to another Class,
//other than OddPredicate then our method will  not accept that object, that's why we use UnaryPredicate<T>
            int count = 0;
            for (T elem : c) {
                if (p.test(elem)) {
  //test method will give me result of either odd number or even number.  public boolean test(T obj);
  //test method is inside p object
                    ++count;
                }
            }
            return count;
        }
    }


/*
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:

public interface UnaryPredicate<T> {
    public boolean test(T obj);
}


Sample output:
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate()); System.out.println("Number of odd integers = " + count);

-----Will this code compile?-----
public final class Algorithm {
     public static <T> T max(T x, T y) {
         return x > y ? x : y;
     }
}
-- NO it will not. Because generic does NOT accept primitive type.
we can't compare object with <>= logical operators


Will the following method compile? If not, why?

 public static void print(List<? extends Number> list) {
     for (Number n : list)
System.out.print(n + " "); System.out.println();
}
-- Will compile because. We are working with Numbers and List extends Numbers(Integer, Double)


------ Will the following code compile?----
class Shape { }
class Circle extends Shape {}
class Rectangle extends Shape {}
class Node<T> {}


Node<Circle> nc = new Node<>();
Node<Shape> ns = nc;

No this code will NOT compile because
nc is not Circle. class Node<T> {} - T accepting only one value, we are passing Circle for T so T is
accepting Circle only! class Circle extends Shape {} is distraction. Generic does not care about this part
If you want T accept some other thing you need modify T like <T extends Shape>


*/
