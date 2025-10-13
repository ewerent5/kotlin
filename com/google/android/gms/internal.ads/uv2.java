package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class uv2 extends wv2 {
    public final long P0;
    public final List<vv2> Q0;
    public final List<uv2> R0;

    public uv2(int i2, long j2) {
        super(i2);
        this.P0 = j2;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
    }

    public final void d(vv2 vv2Var) {
        this.Q0.add(vv2Var);
    }

    public final void e(uv2 uv2Var) {
        this.R0.add(uv2Var);
    }

    public final vv2 f(int i2) {
        int size = this.Q0.size();
        for (int i3 = 0; i3 < size; i3++) {
            vv2 vv2Var = this.Q0.get(i3);
            if (vv2Var.O0 == i2) {
                return vv2Var;
            }
        }
        return null;
    }

    public final uv2 g(int i2) {
        int size = this.R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            uv2 uv2Var = this.R0.get(i3);
            if (uv2Var.O0 == i2) {
                return uv2Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wv2
    public final String toString() {
        String strC = wv2.c(this.O0);
        String string = Arrays.toString(this.Q0.toArray());
        String string2 = Arrays.toString(this.R0.toArray());
        int length = String.valueOf(strC).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(strC);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }
}