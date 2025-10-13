package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: e, reason: collision with root package name */
    private final int f4522e;

    public GooglePlayServicesManifestException(int i2, @RecentlyNonNull String str) {
        super(str);
        this.f4522e = i2;
    }
}