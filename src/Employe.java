 class Employe
{
    float salary=40000;
}
 class Programmer extends Employe
 {
     int bonus=10000;

     public static void main(String args[])
 {
     Programmer p=new Programmer();
     System.out.println( "programmer salary is:" + p.salary);
     System.out.println( "programmer bonus is:" + p.bonus);
 }




 }