package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class h2 implements MediaContent {
    private final q6 a;

    /* renamed from: b, reason: collision with root package name */
    private final VideoController f6271b = new VideoController();

    public h2(q6 q6Var) {
        this.a = q6Var;
    }

    public final q6 a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.a.zze();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.a.zzi();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.a.zzh();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            e.c.b.b.b.b bVarZzg = this.a.zzg();
            if (bVarZzg != null) {
                return (Drawable) e.c.b.b.b.d.Y(bVarZzg);
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.a.zzj() != null) {
                this.f6271b.zza(this.a.zzj());
            }
        } catch (RemoteException e2) {
            er.zzg("Exception occurred while getting video controller", e2);
        }
        return this.f6271b;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.a.zzk();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.a.zzf(e.c.b.b.b.d.m4(drawable));
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }
}