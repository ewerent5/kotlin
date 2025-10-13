package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rv1 extends ContentObserver {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f8753b;

    /* renamed from: c, reason: collision with root package name */
    private final ov1 f8754c;

    /* renamed from: d, reason: collision with root package name */
    private float f8755d;

    /* renamed from: e, reason: collision with root package name */
    private final aw1 f8756e;

    public rv1(Handler handler, Context context, ov1 ov1Var, aw1 aw1Var, byte[] bArr) {
        super(handler);
        this.a = context;
        this.f8753b = (AudioManager) context.getSystemService("audio");
        this.f8754c = ov1Var;
        this.f8756e = aw1Var;
    }

    private final float c() {
        int streamVolume = this.f8753b.getStreamVolume(3);
        int streamMaxVolume = this.f8753b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f2 = streamVolume / streamMaxVolume;
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    private final void d() {
        this.f8756e.e(this.f8755d);
    }

    public final void a() {
        this.f8755d = c();
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fC = c();
        if (fC != this.f8755d) {
            this.f8755d = fC;
            d();
        }
    }
}