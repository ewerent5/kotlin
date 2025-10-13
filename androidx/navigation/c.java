package androidx.navigation;

import android.os.Bundle;

/* compiled from: NavAction.java */
/* loaded from: classes.dex */
public final class c {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private o f1260b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f1261c;

    public c(int i2) {
        this(i2, null);
    }

    public Bundle a() {
        return this.f1261c;
    }

    public int b() {
        return this.a;
    }

    public o c() {
        return this.f1260b;
    }

    public void d(Bundle bundle) {
        this.f1261c = bundle;
    }

    public void e(o oVar) {
        this.f1260b = oVar;
    }

    public c(int i2, o oVar) {
        this(i2, oVar, null);
    }

    public c(int i2, o oVar, Bundle bundle) {
        this.a = i2;
        this.f1260b = oVar;
        this.f1261c = bundle;
    }
}