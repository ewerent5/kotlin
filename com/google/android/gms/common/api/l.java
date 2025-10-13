package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.common.d f4621e;

    public l(@RecentlyNonNull com.google.android.gms.common.d dVar) {
        this.f4621e = dVar;
    }

    @Override // java.lang.Throwable
    @RecentlyNonNull
    public String getMessage() {
        String strValueOf = String.valueOf(this.f4621e);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}