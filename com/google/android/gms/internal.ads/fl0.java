package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fl0 extends p6 {

    /* renamed from: e, reason: collision with root package name */
    private final tl0 f5889e;

    /* renamed from: f, reason: collision with root package name */
    private e.c.b.b.b.b f5890f;

    public fl0(tl0 tl0Var) {
        this.f5889e = tl0Var;
    }

    private static float I4(e.c.b.b.b.b bVar) {
        Drawable drawable;
        if (bVar == null || (drawable = (Drawable) e.c.b.b.b.d.Y(bVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void E1(y7 y7Var) {
        if (((Boolean) c.c().b(w3.s4)).booleanValue() && (this.f5889e.Y() instanceof bx)) {
            ((bx) this.f5889e.Y()).O4(y7Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final float zze() {
        if (!((Boolean) c.c().b(w3.r4)).booleanValue()) {
            return 0.0f;
        }
        if (this.f5889e.s() != 0.0f) {
            return this.f5889e.s();
        }
        if (this.f5889e.Y() != null) {
            try {
                return this.f5889e.Y().zzm();
            } catch (RemoteException e2) {
                er.zzg("Remote exception getting video controller aspect ratio.", e2);
                return 0.0f;
            }
        }
        e.c.b.b.b.b bVar = this.f5890f;
        if (bVar != null) {
            return I4(bVar);
        }
        t6 t6VarD0 = this.f5889e.d0();
        if (t6VarD0 == null) {
            return 0.0f;
        }
        float fZze = (t6VarD0.zze() == -1 || t6VarD0.zzf() == -1) ? 0.0f : t6VarD0.zze() / t6VarD0.zzf();
        return fZze == 0.0f ? I4(t6VarD0.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void zzf(e.c.b.b.b.b bVar) {
        this.f5890f = bVar;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final e.c.b.b.b.b zzg() {
        e.c.b.b.b.b bVar = this.f5890f;
        if (bVar != null) {
            return bVar;
        }
        t6 t6VarD0 = this.f5889e.d0();
        if (t6VarD0 == null) {
            return null;
        }
        return t6VarD0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final float zzh() {
        if (((Boolean) c.c().b(w3.s4)).booleanValue() && this.f5889e.Y() != null) {
            return this.f5889e.Y().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final float zzi() {
        if (((Boolean) c.c().b(w3.s4)).booleanValue() && this.f5889e.Y() != null) {
            return this.f5889e.Y().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final n1 zzj() {
        if (((Boolean) c.c().b(w3.s4)).booleanValue()) {
            return this.f5889e.Y();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final boolean zzk() {
        return ((Boolean) c.c().b(w3.s4)).booleanValue() && this.f5889e.Y() != null;
    }
}