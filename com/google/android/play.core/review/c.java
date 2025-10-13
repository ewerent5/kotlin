package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* loaded from: classes.dex */
final class c extends ReviewInfo {

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f12221e;

    c(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f12221e = pendingIntent;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final PendingIntent a() {
        return this.f12221e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f12221e.equals(((ReviewInfo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12221e.hashCode() ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12221e);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}