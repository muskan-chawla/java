 interface Printable
 {
  void print();
}
interface Showable  extends Printable
{
 void show();

}
class TestInterface2 implements Printable
{
 public void print()
 {
  System.out.println("Hello");
 }
public void show()
 {
  System.out.println("welcome");
 }
 public static void main(String args[])
 {
  TestInterface2 obj=new TestInterface2();
  obj.print();
  obj.show();
 }
}
