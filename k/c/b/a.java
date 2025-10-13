package k.c.b;

/* compiled from: Configuration.java */
/* loaded from: classes3.dex */
public class a {
    private static c a;

    public static synchronized c a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }
}