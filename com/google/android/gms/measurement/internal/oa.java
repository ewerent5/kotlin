package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class oa extends q9 {

    /* renamed from: d, reason: collision with root package name */
    private String f11096d;

    /* renamed from: e, reason: collision with root package name */
    private Set<Integer> f11097e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, qa> f11098f;

    /* renamed from: g, reason: collision with root package name */
    private Long f11099g;

    /* renamed from: h, reason: collision with root package name */
    private Long f11100h;

    oa(t9 t9Var) {
        super(t9Var);
    }

    private final qa s(int i2) {
        if (this.f11098f.containsKey(Integer.valueOf(i2))) {
            return this.f11098f.get(Integer.valueOf(i2));
        }
        qa qaVar = new qa(this, this.f11096d, null);
        this.f11098f.put(Integer.valueOf(i2), qaVar);
        return qaVar;
    }

    private final boolean u(int i2, int i3) {
        if (this.f11098f.get(Integer.valueOf(i2)) == null) {
            return false;
        }
        return this.f11098f.get(Integer.valueOf(i2)).f11164d.get(i3);
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0618, code lost:
    
        r7 = zzq().D();
        r9 = com.google.android.gms.measurement.internal.v3.s(r46.f11096d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x062a, code lost:
    
        if (r8.A() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x062c, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0635, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0636, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<e.c.b.b.c.e.e1> t(java.lang.String r47, java.util.List<e.c.b.b.c.e.g1> r48, java.util.List<e.c.b.b.c.e.o1> r49, java.lang.Long r50, java.lang.Long r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oa.t(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}