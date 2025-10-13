package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mt2 extends Exception {
    public mt2(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(78);
        sb.append("Unhandled format: ");
        sb.append(i2);
        sb.append(" Hz, ");
        sb.append(i3);
        sb.append(" channels in encoding ");
        sb.append(i4);
        super(sb.toString());
    }
}