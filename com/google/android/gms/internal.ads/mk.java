package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class mk {
    long a;

    /* renamed from: b, reason: collision with root package name */
    final String f7495b;

    /* renamed from: c, reason: collision with root package name */
    final String f7496c;

    /* renamed from: d, reason: collision with root package name */
    final long f7497d;

    /* renamed from: e, reason: collision with root package name */
    final long f7498e;

    /* renamed from: f, reason: collision with root package name */
    final long f7499f;

    /* renamed from: g, reason: collision with root package name */
    final long f7500g;

    /* renamed from: h, reason: collision with root package name */
    final List<p43> f7501h;

    /* JADX WARN: Illegal instructions before constructor call */
    mk(String str, gv2 gv2Var) {
        String str2 = gv2Var.f6205b;
        long j2 = gv2Var.f6206c;
        long j3 = gv2Var.f6207d;
        long j4 = gv2Var.f6208e;
        long j5 = gv2Var.f6209f;
        List arrayList = gv2Var.f6211h;
        if (arrayList == null) {
            Map<String, String> map = gv2Var.f6210g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new p43(entry.getKey(), entry.getValue()));
            }
        }
        this(str, str2, j2, j3, j4, j5, arrayList);
    }

    static mk a(nl nlVar) throws IOException {
        if (pn.g(nlVar) != 538247942) {
            throw new IOException();
        }
        String strK = pn.k(nlVar);
        String strK2 = pn.k(nlVar);
        long jI = pn.i(nlVar);
        long jI2 = pn.i(nlVar);
        long jI3 = pn.i(nlVar);
        long jI4 = pn.i(nlVar);
        int iG = pn.g(nlVar);
        if (iG < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(iG);
            throw new IOException(sb.toString());
        }
        List listEmptyList = iG == 0 ? Collections.emptyList() : new ArrayList();
        for (int i2 = 0; i2 < iG; i2++) {
            listEmptyList.add(new p43(pn.k(nlVar).intern(), pn.k(nlVar).intern()));
        }
        return new mk(strK, strK2, jI, jI2, jI3, jI4, listEmptyList);
    }

    private mk(String str, String str2, long j2, long j3, long j4, long j5, List<p43> list) {
        this.f7495b = str;
        this.f7496c = true == "".equals(str2) ? null : str2;
        this.f7497d = j2;
        this.f7498e = j3;
        this.f7499f = j4;
        this.f7500g = j5;
        this.f7501h = list;
    }
}