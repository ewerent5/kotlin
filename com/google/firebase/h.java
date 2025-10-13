package com.google.firebase;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.p;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class h extends Exception {
    @Deprecated
    protected h() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@RecentlyNonNull String str) {
        super(str);
        p.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
        super(str, th);
        p.g(str, "Detail message must not be empty");
    }
}