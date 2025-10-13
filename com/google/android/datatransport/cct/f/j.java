package com.google.android.datatransport.cct.f;

import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: BatchedLogRequest.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public static com.google.firebase.k.a b() {
        return new com.google.firebase.k.h.d().g(b.a).h(true).f();
    }

    public abstract List<m> c();
}