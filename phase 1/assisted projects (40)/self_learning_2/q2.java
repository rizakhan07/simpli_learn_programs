package self_learning_2;
class A{
    protected void s(){
        int a = 10;
        System.out.println("Private Class = "+a);
    }

    protected void f(){
        int b = 12;
        System.out.println("Protected Class = "+b);
    }

    public void g(){
        int c = 14;
        System.out.println("Public Class = "+c);
    }
}

class B{
    void h(){
        A obj = new A();
        obj.s();
        obj.f();
        obj.g();
    }
}



public class q2 extends A{
	public static void main(String[] args) {
        B obj = new B();
        obj.h();

}
}
