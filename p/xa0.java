package p.xa0;
import p.za0;
import java.lang.String;
import p.cb0;
import p.xc5;
import java.lang.Object;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class xa0 extends za0	// class@002c37 from classes.dex
{
    public final String a;

    public void xa0(String p0){
       super();
       this.a = p0;
    }
    public final Object a(cb0 p0,cb0 p1,cb0 p2,cb0 p3,xc5 p4,xc5 p5){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof xa0) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       xa0 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("PhoneNumberChanged{phoneNumber=", this.a, '}');
    }
}