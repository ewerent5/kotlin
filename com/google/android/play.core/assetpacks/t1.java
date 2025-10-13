package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
final class t1 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("PackageStateCache");

    /* renamed from: b, reason: collision with root package name */
    private final Context f12147b;

    /* renamed from: c, reason: collision with root package name */
    private int f12148c = -1;

    t1(Context context) {
        this.f12147b = context;
    }

    public final synchronized int a() {
        if (this.f12148c == -1) {
            try {
                this.f12148c = this.f12147b.getPackageManager().getPackageInfo(this.f12147b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                a.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f12148c;
    }
}