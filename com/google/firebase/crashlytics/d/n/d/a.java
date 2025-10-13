package com.google.firebase.crashlytics.d.n.d;

import com.google.firebase.crashlytics.d.n.c.c;

/* compiled from: CompositeCreateReportSpiCall.java */
/* loaded from: classes.dex */
public class a implements b {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final d f12712b;

    /* compiled from: CompositeCreateReportSpiCall.java */
    /* renamed from: com.google.firebase.crashlytics.d.n.d.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0150a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            a = iArr;
            try {
                iArr[c.a.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.a.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(c cVar, d dVar) {
        this.a = cVar;
        this.f12712b = dVar;
    }

    @Override // com.google.firebase.crashlytics.d.n.d.b
    public boolean b(com.google.firebase.crashlytics.d.n.c.a aVar, boolean z) {
        int i2 = C0150a.a[aVar.f12706c.getType().ordinal()];
        if (i2 == 1) {
            this.a.b(aVar, z);
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        this.f12712b.b(aVar, z);
        return true;
    }
}