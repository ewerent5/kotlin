package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zk2 {
    private final ArrayDeque<ci2> a = new ArrayDeque<>();

    /* synthetic */ zk2(yk2 yk2Var) {
    }

    static /* synthetic */ ci2 a(zk2 zk2Var, ci2 ci2Var, ci2 ci2Var2) {
        zk2Var.b(ci2Var);
        zk2Var.b(ci2Var2);
        ci2 ci2VarPop = zk2Var.a.pop();
        while (!zk2Var.a.isEmpty()) {
            ci2VarPop = new cl2(zk2Var.a.pop(), ci2VarPop, null);
        }
        return ci2VarPop;
    }

    private final void b(ci2 ci2Var) {
        yk2 yk2Var;
        if (!ci2Var.p()) {
            if (ci2Var instanceof cl2) {
                cl2 cl2Var = (cl2) ci2Var;
                b(cl2Var.f5329k);
                b(cl2Var.f5330l);
                return;
            } else {
                String strValueOf = String.valueOf(ci2Var.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int iC = c(ci2Var.l());
        int iV = cl2.V(iC + 1);
        if (this.a.isEmpty() || this.a.peek().l() >= iV) {
            this.a.push(ci2Var);
            return;
        }
        int iV2 = cl2.V(iC);
        ci2 ci2VarPop = this.a.pop();
        while (true) {
            yk2Var = null;
            if (this.a.isEmpty() || this.a.peek().l() >= iV2) {
                break;
            } else {
                ci2VarPop = new cl2(this.a.pop(), ci2VarPop, yk2Var);
            }
        }
        cl2 cl2Var2 = new cl2(ci2VarPop, ci2Var, yk2Var);
        while (!this.a.isEmpty()) {
            if (this.a.peek().l() >= cl2.V(c(cl2Var2.l()) + 1)) {
                break;
            } else {
                cl2Var2 = new cl2(this.a.pop(), cl2Var2, yk2Var);
            }
        }
        this.a.push(cl2Var2);
    }

    private static final int c(int i2) {
        int iBinarySearch = Arrays.binarySearch(cl2.f5327i, i2);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}