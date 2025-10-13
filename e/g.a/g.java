package e.g.a;

/* compiled from: IabResult.java */
/* loaded from: classes.dex */
public class g {
    int a;

    /* renamed from: b, reason: collision with root package name */
    String f15681b;

    public g(int i2, String str) {
        this.a = i2;
        if (str == null || str.trim().length() == 0) {
            this.f15681b = f.j(i2);
            return;
        }
        this.f15681b = str + " (response: " + f.j(i2) + ")";
    }

    public String a() {
        return this.f15681b;
    }

    public boolean b() {
        return !c();
    }

    public boolean c() {
        return this.a == 0;
    }

    public String toString() {
        return "IabResult: " + a();
    }
}