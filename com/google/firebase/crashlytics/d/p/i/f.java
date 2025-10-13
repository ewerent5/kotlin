package com.google.firebase.crashlytics.d.p.i;

/* compiled from: SettingsData.java */
/* loaded from: classes.dex */
public class f implements e {
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public final d f12751b;

    /* renamed from: c, reason: collision with root package name */
    public final c f12752c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12753d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12754e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12755f;

    public f(long j2, b bVar, d dVar, c cVar, int i2, int i3) {
        this.f12753d = j2;
        this.a = bVar;
        this.f12751b = dVar;
        this.f12752c = cVar;
        this.f12754e = i2;
        this.f12755f = i3;
    }

    @Override // com.google.firebase.crashlytics.d.p.i.e
    public c a() {
        return this.f12752c;
    }

    @Override // com.google.firebase.crashlytics.d.p.i.e
    public d b() {
        return this.f12751b;
    }

    public b c() {
        return this.a;
    }

    public long d() {
        return this.f12753d;
    }

    public boolean e(long j2) {
        return this.f12753d < j2;
    }
}