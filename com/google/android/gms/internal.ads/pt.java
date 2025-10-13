package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
public final class pt implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager a;

    /* renamed from: b, reason: collision with root package name */
    private final ot f8261b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8262c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8263d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8264e;

    /* renamed from: f, reason: collision with root package name */
    private float f8265f = 1.0f;

    public pt(Context context, ot otVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.f8261b = otVar;
    }

    private final void f() {
        if (!this.f8263d || this.f8264e || this.f8265f <= 0.0f) {
            if (this.f8262c) {
                AudioManager audioManager = this.a;
                if (audioManager != null) {
                    this.f8262c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f8261b.zzq();
                return;
            }
            return;
        }
        if (this.f8262c) {
            return;
        }
        AudioManager audioManager2 = this.a;
        if (audioManager2 != null) {
            this.f8262c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f8261b.zzq();
    }

    public final void a(boolean z) {
        this.f8264e = z;
        f();
    }

    public final void b(float f2) {
        this.f8265f = f2;
        f();
    }

    public final float c() {
        float f2 = this.f8264e ? 0.0f : this.f8265f;
        if (this.f8262c) {
            return f2;
        }
        return 0.0f;
    }

    public final void d() {
        this.f8263d = true;
        f();
    }

    public final void e() {
        this.f8263d = false;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.f8262c = i2 > 0;
        this.f8261b.zzq();
    }
}