package com.parizene.netmonitor.m0.z;

import i.y.c.p;
import i.y.d.l;
import i.y.d.m;

/* compiled from: BandHelper.kt */
/* loaded from: classes.dex */
public final class b {
    private final c.e.e<String, String> a = new c.e.e<>(20);

    /* renamed from: b, reason: collision with root package name */
    private final p<Integer, String, String> f13541b = a.f13545e;

    /* renamed from: c, reason: collision with root package name */
    private final p<Integer, String, String> f13542c = C0162b.f13546e;

    /* renamed from: d, reason: collision with root package name */
    private final p<Integer, String, String> f13543d = c.f13547e;

    /* renamed from: e, reason: collision with root package name */
    private final p<Integer, String, String> f13544e = d.f13548e;

    /* compiled from: BandHelper.kt */
    static final class a extends m implements p<Integer, String, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f13545e = new a();

        a() {
            super(2);
        }

        public final String a(int i2, String str) {
            return com.parizene.netmonitor.m0.z.c.a.a(i2, str);
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ String i(Integer num, String str) {
            return a(num.intValue(), str);
        }
    }

    /* compiled from: BandHelper.kt */
    /* renamed from: com.parizene.netmonitor.m0.z.b$b, reason: collision with other inner class name */
    static final class C0162b extends m implements p<Integer, String, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final C0162b f13546e = new C0162b();

        C0162b() {
            super(2);
        }

        public final String a(int i2, String str) {
            return com.parizene.netmonitor.m0.z.d.a.a(i2);
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ String i(Integer num, String str) {
            return a(num.intValue(), str);
        }
    }

    /* compiled from: BandHelper.kt */
    static final class c extends m implements p<Integer, String, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final c f13547e = new c();

        c() {
            super(2);
        }

        public final String a(int i2, String str) {
            return e.a.a(i2);
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ String i(Integer num, String str) {
            return a(num.intValue(), str);
        }
    }

    /* compiled from: BandHelper.kt */
    static final class d extends m implements p<Integer, String, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final d f13548e = new d();

        d() {
            super(2);
        }

        public final String a(int i2, String str) {
            return f.a.a(i2);
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ String i(Integer num, String str) {
            return a(num.intValue(), str);
        }
    }

    private final String c(int i2, String str, String str2, p<? super Integer, ? super String, String> pVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str != null ? l.i("_", str) : "");
        sb.append(i2);
        String string = sb.toString();
        String strC = this.a.c(string);
        if (strC != null) {
            return strC;
        }
        String strI = pVar.i(Integer.valueOf(i2), str);
        this.a.d(string, strI);
        return strI;
    }

    public final String a(int i2, String str) {
        return c(i2, str, "GSM_", this.f13541b);
    }

    public final String b(int i2) {
        return c(i2, null, "LTE_", this.f13542c);
    }

    public final String d(int i2) {
        return c(i2, null, "NR_", this.f13543d);
    }

    public final String e(int i2) {
        return c(i2, null, "UMTS_", this.f13544e);
    }
}