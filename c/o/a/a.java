package c.o.a;

import androidx.lifecycle.b0;
import androidx.lifecycle.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {
    public static <T extends k & b0> a b(T t) {
        return new b(t, t.D());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}