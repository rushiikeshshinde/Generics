import java.util.Collection;

public class FindMaximum {

    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;

        }

        return max;

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Generics");

        Integer a1 = 10,b1 =30, c1 = 20;

        System.out.println("Maximum of 3 Integers: "+findMax(a1,b1,c1));

        Float x1=10.5f,y1=20.8f,z1=30.2f;

        System.out.println("Maximum of 3 Floats: "+findMax(x1,y1,z1));

        String s1 ="Apple", s2 = "Peach", s3 = "Banana";

        System.out.println("Maximum of 3 Strings: "+findMax(s1,s2,s3));

    }

}
