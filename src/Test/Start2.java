package Test;

public class Start2 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        speak(a);
        speak(b);
        speak(c);
        speak(d);
    }
    static void speak(Object obj){
        if (obj instanceof A){
            A aobj = (A)obj;
            aobj.axx();
        } else if(obj instanceof B)
        {
            B bobj=(B)obj;
            bobj.bxx();
        }
        else if(obj instanceof C)
        {
            C cobj=(C)obj;
            cobj.cxx();
        }

    }
}
