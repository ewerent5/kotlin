package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager.java */
/* loaded from: classes.dex */
public abstract class o {
    protected o() {
    }

    public static o d(Context context) {
        return androidx.work.impl.h.j(context);
    }

    public static void e(Context context, b bVar) {
        androidx.work.impl.h.e(context, bVar);
    }

    public abstract k a(String str);

    public final k b(p pVar) {
        return c(Collections.singletonList(pVar));
    }

    public abstract k c(List<? extends p> list);
}