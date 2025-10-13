package com.google.firebase.p;

import android.content.Context;
import com.google.firebase.components.n;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String a(T t);
    }

    public static com.google.firebase.components.d<?> a(String str, String str2) {
        return com.google.firebase.components.d.g(f.a(str, str2), f.class);
    }

    public static com.google.firebase.components.d<?> b(String str, a<Context> aVar) {
        return com.google.firebase.components.d.h(f.class).b(n.g(Context.class)).e(g.b(str, aVar)).c();
    }
}