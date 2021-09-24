 class Adder {
     static int add(int a, int b) {
         return a + b;
     }

     static int add(int a, int b, int c) {
         return a + b + c;
     }
 }
 class Overload1
 {
     public static void main(String args[])
     {
         System.out.println(Adder.add(10,10));
         System.out.println(Adder.add(10,10,10));
     }
 }