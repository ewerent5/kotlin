package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ti2 {
    private static final ri2<?> a = new si2();

    /* renamed from: b, reason: collision with root package name */
    private static final ri2<?> f9147b;

    static {
        ri2<?> ri2Var;
        try {
            ri2Var = (ri2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            ri2Var = null;
        }
        f9147b = ri2Var;
    }

    static ri2<?> a() {
        return a;
    }

    static ri2<?> b() {
        ri2<?> ri2Var = f9147b;
        if (ri2Var != null) {
            return ri2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}