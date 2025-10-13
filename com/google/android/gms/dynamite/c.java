package com.google.android.gms.dynamite;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class c implements m {
    c() {
    }

    @Override // com.google.android.gms.dynamite.m
    public final int a(Context context, String str, boolean z) {
        return DynamiteModule.f(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.m
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}