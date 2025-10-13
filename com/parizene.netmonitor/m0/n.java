package com.parizene.netmonitor.m0;

import android.text.TextUtils;
import com.parizene.netmonitor.m0.d0.f.a0;
import com.parizene.netmonitor.m0.d0.f.z;

/* compiled from: NetworkInfoCreator.java */
/* loaded from: classes.dex */
public class n {
    private com.parizene.netmonitor.m0.d0.d a;

    /* renamed from: b, reason: collision with root package name */
    private com.parizene.netmonitor.m0.d0.e f13504b;

    /* renamed from: c, reason: collision with root package name */
    private l f13505c;

    public n(com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, l lVar) {
        this.a = dVar;
        this.f13504b = eVar;
        this.f13505c = lVar;
    }

    public com.parizene.netmonitor.m0.b0.y a(int i2, z zVar, a0 a0Var) {
        String strSubstring;
        String strSubstring2;
        String str;
        int iX = this.a.x(i2);
        if (-1 == iX) {
            iX = Integer.MAX_VALUE;
        }
        String strE = this.f13504b.e(i2);
        if (strE == null || !TextUtils.isDigitsOnly(strE) || strE.length() < 3) {
            strSubstring = null;
            strSubstring2 = null;
        } else {
            strSubstring2 = strE.substring(0, 3);
            if (strE.length() > 3) {
                strSubstring = strE.substring(3);
                if (com.parizene.netmonitor.p.a() && TextUtils.isDigitsOnly(strSubstring2) && TextUtils.isDigitsOnly(strSubstring) && (str = this.f13505c.a(Integer.parseInt(strSubstring2), Integer.parseInt(strSubstring)).f3105b) != null) {
                    strSubstring = str;
                }
            } else {
                strSubstring = null;
            }
        }
        return new com.parizene.netmonitor.m0.b0.y(i2, iX, strSubstring2, strSubstring, this.f13504b.f(i2), this.f13504b.g(i2), this.f13504b.c(i2), this.f13504b.i(i2), this.f13504b.j(i2), zVar != null ? zVar.f13479e : -1, zVar != null ? zVar.f13483i : null, a0Var != null ? a0Var.q : Integer.MAX_VALUE);
    }
}