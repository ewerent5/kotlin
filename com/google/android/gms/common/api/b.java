package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    @Deprecated
    protected final Status f4538e;

    public b(@RecentlyNonNull Status status) {
        int I = status.I();
        String strJ = status.J() != null ? status.J() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 13);
        sb.append(I);
        sb.append(": ");
        sb.append(strJ);
        super(sb.toString());
        this.f4538e = status;
    }
}