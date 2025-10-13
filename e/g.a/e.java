package e.g.a;

/* compiled from: IabException.java */
/* loaded from: classes.dex */
public class e extends Exception {

    /* renamed from: e, reason: collision with root package name */
    g f15658e;

    public e(g gVar) {
        this(gVar, (Exception) null);
    }

    public g a() {
        return this.f15658e;
    }

    public e(int i2, String str) {
        this(new g(i2, str));
    }

    public e(g gVar, Exception exc) {
        super(gVar.a(), exc);
        this.f15658e = gVar;
    }

    public e(int i2, String str, Exception exc) {
        this(new g(i2, str), exc);
    }
}