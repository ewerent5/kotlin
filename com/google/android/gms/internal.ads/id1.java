package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class id1 implements ah1<jd1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6526b;

    public id1(h52 h52Var, Context context) {
        this.a = h52Var;
        this.f6526b = context;
    }

    final /* synthetic */ jd1 a() {
        AudioManager audioManager = (AudioManager) this.f6526b.getSystemService("audio");
        return new jd1(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzs.zzh().zzb(), zzs.zzh().zzd());
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<jd1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.hd1
            private final id1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}