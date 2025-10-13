package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ux extends MutableContextWrapper {
    private Activity a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9583b;

    /* renamed from: c, reason: collision with root package name */
    private Context f9584c;

    public ux(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.a;
    }

    public final Context b() {
        return this.f9584c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f9584c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f9583b = applicationContext;
        this.a = context instanceof Activity ? (Activity) context : null;
        this.f9584c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f9583b.startActivity(intent);
        }
    }
}