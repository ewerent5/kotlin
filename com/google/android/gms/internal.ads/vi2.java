package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ui2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vi2<T extends ui2<T>> {
    private static final vi2 a = new vi2(true);

    /* renamed from: b, reason: collision with root package name */
    final nl2<T, Object> f9711b = new gl2(16);

    /* renamed from: c, reason: collision with root package name */
    private boolean f9712c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9713d;

    private vi2() {
    }

    public static <T extends ui2<T>> vi2<T> a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(T r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.im2 r0 = r4.zzb()
            com.google.android.gms.internal.ads.oj2.a(r5)
            com.google.android.gms.internal.ads.im2 r1 = com.google.android.gms.internal.ads.im2.f6544e
            com.google.android.gms.internal.ads.jm2 r1 = com.google.android.gms.internal.ads.jm2.INT
            com.google.android.gms.internal.ads.jm2 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.lk2
            if (r0 != 0) goto L41
            goto L42
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.gj2
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.ci2
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.ads.im2 r4 = r4.zzb()
            com.google.android.gms.internal.ads.jm2 r4 = r4.a()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vi2.d(com.google.android.gms.internal.ads.ui2, java.lang.Object):void");
    }

    public final void b() {
        if (this.f9712c) {
            return;
        }
        this.f9711b.a();
        this.f9712c = true;
    }

    public final void c(T t, Object obj) {
        if (!t.zzc()) {
            d(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(t, arrayList.get(i2));
            }
            obj = arrayList;
        }
        this.f9711b.put(t, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ Object clone() {
        vi2 vi2Var = new vi2();
        for (int i2 = 0; i2 < this.f9711b.c(); i2++) {
            Map.Entry<K, Object> entryD = this.f9711b.d(i2);
            vi2Var.c((ui2) entryD.getKey(), entryD.getValue());
        }
        Iterator it = this.f9711b.e().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            vi2Var.c((ui2) entry.getKey(), entry.getValue());
        }
        vi2Var.f9713d = this.f9713d;
        return vi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vi2) {
            return this.f9711b.equals(((vi2) obj).f9711b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9711b.hashCode();
    }

    private vi2(boolean z) {
        b();
        b();
    }
}