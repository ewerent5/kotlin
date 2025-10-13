package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class u3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private Context f9368k;

    /* renamed from: e, reason: collision with root package name */
    private final Object f9362e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final ConditionVariable f9363f = new ConditionVariable();

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f9364g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f9365h = false;

    /* renamed from: i, reason: collision with root package name */
    private SharedPreferences f9366i = null;

    /* renamed from: j, reason: collision with root package name */
    private Bundle f9367j = new Bundle();

    /* renamed from: l, reason: collision with root package name */
    private JSONObject f9369l = new JSONObject();

    private final void f() {
        if (this.f9366i == null) {
            return;
        }
        try {
            this.f9369l = new JSONObject((String) y3.a(new p12(this) { // from class: com.google.android.gms.internal.ads.s3
                private final u3 a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.p12
                public final Object zza() {
                    return this.a.c();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final void a(Context context) {
        if (this.f9364g) {
            return;
        }
        synchronized (this.f9362e) {
            if (this.f9364g) {
                return;
            }
            if (!this.f9365h) {
                this.f9365h = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f9368k = applicationContext;
            try {
                this.f9367j = com.google.android.gms.common.p.c.a(applicationContext).c(this.f9368k.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context contextC = com.google.android.gms.common.j.c(context);
                if (contextC != null || (contextC = context.getApplicationContext()) != null) {
                    context = contextC;
                }
                if (context != null) {
                    c.a();
                    SharedPreferences sharedPreferencesA = q3.a(context);
                    this.f9366i = sharedPreferencesA;
                    if (sharedPreferencesA != null) {
                        sharedPreferencesA.registerOnSharedPreferenceChangeListener(this);
                    }
                    y5.b(new t3(this));
                    f();
                    this.f9364g = true;
                }
            } finally {
                this.f9365h = false;
                this.f9363f.open();
            }
        }
    }

    public final <T> T b(final o3<T> o3Var) {
        if (!this.f9363f.block(5000L)) {
            synchronized (this.f9362e) {
                if (!this.f9365h) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f9364g || this.f9366i == null) {
            synchronized (this.f9362e) {
                if (this.f9364g && this.f9366i != null) {
                }
                return o3Var.f();
            }
        }
        if (o3Var.m() != 2) {
            return (o3Var.m() == 1 && this.f9369l.has(o3Var.e())) ? o3Var.c(this.f9369l) : (T) y3.a(new p12(this, o3Var) { // from class: com.google.android.gms.internal.ads.r3
                private final u3 a;

                /* renamed from: b, reason: collision with root package name */
                private final o3 f8573b;

                {
                    this.a = this;
                    this.f8573b = o3Var;
                }

                @Override // com.google.android.gms.internal.ads.p12
                public final Object zza() {
                    return this.a.d(this.f8573b);
                }
            });
        }
        Bundle bundle = this.f9367j;
        return bundle == null ? o3Var.f() : o3Var.a(bundle);
    }

    final /* synthetic */ String c() {
        return this.f9366i.getString("flag_configuration", "{}");
    }

    final /* synthetic */ Object d(o3 o3Var) {
        return o3Var.d(this.f9366i);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}