package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class v {
    private final Resources a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4737b;

    public v(@RecentlyNonNull Context context) {
        p.j(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.f4737b = resources.getResourcePackageName(com.google.android.gms.common.l.a);
    }

    @RecentlyNullable
    public String a(@RecentlyNonNull String str) {
        int identifier = this.a.getIdentifier(str, "string", this.f4737b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}