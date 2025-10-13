package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class tk2 {
    private static final tk2 a = new tk2();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, dl2<?>> f9174c = new ConcurrentHashMap();

    /* renamed from: b */
    private final el2 f9173b = new dk2();

    private tk2() {
    }

    public static tk2 a() {
        return a;
    }

    public final <T> dl2<T> b(Class<T> cls) {
        oj2.b(cls, "messageType");
        dl2<T> dl2VarA = (dl2) this.f9174c.get(cls);
        if (dl2VarA == null) {
            dl2VarA = this.f9173b.a(cls);
            oj2.b(cls, "messageType");
            oj2.b(dl2VarA, "schema");
            dl2<T> dl2Var = (dl2) this.f9174c.putIfAbsent(cls, dl2VarA);
            if (dl2Var != null) {
                return dl2Var;
            }
        }
        return dl2VarA;
    }
}