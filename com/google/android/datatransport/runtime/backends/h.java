package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.auto.value.AutoValue;

/* compiled from: CreationContext.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class h {
    public static h a(Context context, e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract e.c.b.a.i.y.a d();

    public abstract e.c.b.a.i.y.a e();
}