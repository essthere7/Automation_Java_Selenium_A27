package homework;
    import java.util.Arrays;

//    Sort Array
      public class AppSlack {

        public static int sum(int[] a){
            int r=0;
            for (int v:a){
                r=r+v;
            }
            return r;
        }
        public static int[] sortedArray(int[] a){
            Arrays.sort(a);
            return a;
        }

        public static void main(String[] args) {
            int a[]={3,2,6,5,9,4};
            System.out.println("sum of values in array is "+sum(a)+"\n");
            System.out.println("sorted array values are:");
            for (int v: sortedArray(a)){
                System.out.println(v);
            }

            System.out.println("\nminimum value in array is: "+sortedArray(a)[0]);
        }
    }

