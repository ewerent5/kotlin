package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wz2 extends vz2 {

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f10092f;

    public wz2(int i2, Map<String, List<String>> map, rz2 rz2Var) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i2);
        super(sb.toString(), rz2Var, 1);
        this.f10092f = map;
    }
}