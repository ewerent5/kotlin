package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class o3<T> {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7896b;

    /* renamed from: c, reason: collision with root package name */
    private final T f7897c;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ o3(int i2, String str, Object obj, j3 j3Var) {
        this.a = i2;
        this.f7896b = str;
        this.f7897c = obj;
        c.b().a(this);
    }

    public static o3<Boolean> g(int i2, String str, Boolean bool) {
        return new j3(i2, str, bool);
    }

    public static o3<Integer> h(int i2, String str, int i3) {
        return new k3(1, str, Integer.valueOf(i3));
    }

    public static o3<Long> i(int i2, String str, long j2) {
        return new l3(1, str, Long.valueOf(j2));
    }

    public static o3<Float> j(int i2, String str, float f2) {
        return new m3(1, str, Float.valueOf(f2));
    }

    public static o3<String> k(int i2, String str, String str2) {
        return new n3(1, str, str2);
    }

    public static o3<String> l(int i2, String str) {
        o3<String> o3VarK = k(1, "gads:sdk_core_constants:experiment_id", null);
        c.b().b(o3VarK);
        return o3VarK;
    }

    public abstract T a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, T t);

    protected abstract T c(JSONObject jSONObject);

    protected abstract T d(SharedPreferences sharedPreferences);

    public final String e() {
        return this.f7896b;
    }

    public final T f() {
        return this.f7897c;
    }

    public final int m() {
        return this.a;
    }
}