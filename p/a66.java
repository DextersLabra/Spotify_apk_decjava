package p.a66;
import p.ty0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class a66 extends ty0	// class@000f22 from classes.dex
{
    public final String m;
    public final String n;

    public void a66(String p0,String p1){
       super();
       p0.getClass();
       this.m = p0;
       p1.getClass();
       this.n = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof a66) {
          return false;
       }
       if (!p0.m.equals(this.m) || !p0.n.equals(this.n)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.n.hashCode() + tp2.g(this.m, 0, 31));
    }
    public final String toString(){
       return hr7.a("OpenSeeMore{playlistUri="+this.m+", uri=", this.n, '}');
    }
}