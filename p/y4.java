package p.y4;
import p.c5;
import p.tv7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class y4 extends c5	// class@002d4c from classes.dex
{
    public final String b;
    public static final Parcelable$Creator CREATOR;

    static {
       y4.CREATOR = new tv7(18);
    }
    public void y4(String p0){
       co5.o(p0, "link");
       super(p0);
       this.b = p0;
    }
    public final String a(){
       return this.b;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof y4) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.b.hashCode();
    }
    public final String toString(){
       return hr7.a("Uri\(link=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.b);
    }
}