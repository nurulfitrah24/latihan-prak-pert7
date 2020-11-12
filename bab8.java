class parent {
int x = 5;
public void Info() {
System.out.println("Ini class Parent");
}
}
class Child extends parent {
int x = 10;
public void Info() {
System.out.println("Ini class Child");
}
}
public class bab8 {
public static void main(String args[]) {
parent tes=new Child();
System.out.println("Nilai x = " + tes.x);
tes.Info();
}
}