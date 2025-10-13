package com.google.firebase.crashlytics.d.r;

import android.content.Context;
import com.google.firebase.crashlytics.d.h.h;

/* compiled from: ResourceUnityVersionProvider.java */
/* loaded from: classes.dex */
public class a implements b {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12771b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f12772c;

    public a(Context context) {
        this.a = context;
    }

    @Override // com.google.firebase.crashlytics.d.r.b
    public String a() {
        if (!this.f12771b) {
            this.f12772c = h.E(this.a);
            this.f12771b = true;
        }
        String str = this.f12772c;
        if (str != null) {
            return str;
        }
        return null;
    }
}