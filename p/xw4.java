package p.xw4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.w00;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;

public final class xw4 implements Observer, Disposable	// class@002cff from classes.dex
{
    public final Observer a;
    public final w00 b;
    public Disposable c;
    public Object t;
    public boolean v;

    public void xw4(Observer p0,w00 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.v = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       xw4 tt = this.t;
       xw4 ta = this.a;
       if (tt == null) {
          this.t = p0;
          ta.onNext(p0);
       }else {
          p0 = this.b.apply(tt, p0);
          Objects.requireNonNull(p0, "The value returned by the accumulator is null");
          this.t = p0;
          ta.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}