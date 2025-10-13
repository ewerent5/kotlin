package k.a.a.a;

import java.io.Serializable;

/* compiled from: ObjectUtils.java */
/* loaded from: classes3.dex */
public class b {
    public static final a a = new a();

    /* compiled from: ObjectUtils.java */
    public static class a implements Serializable {
        a() {
        }
    }

    public static <T> T a(T t, T t2) {
        return t != null ? t : t2;
    }
}