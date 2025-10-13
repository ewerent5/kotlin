package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ia implements ba<ew> {
    static final Map<String, Integer> a = com.google.android.gms.common.util.g.e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: b, reason: collision with root package name */
    private final zzb f6503b;

    /* renamed from: c, reason: collision with root package name */
    private final pi f6504c;

    /* renamed from: d, reason: collision with root package name */
    private final wi f6505d;

    public ia(zzb zzbVar, pi piVar, wi wiVar) {
        this.f6503b = zzbVar;
        this.f6504c = piVar;
        this.f6505d = wiVar;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) throws JSONException {
        ew ewVar2 = ewVar;
        int iIntValue = a.get((String) map.get("a")).intValue();
        int iZzh = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                if (!this.f6503b.zzb()) {
                    this.f6503b.zzc(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f6504c.h(map);
                    return;
                }
                if (iIntValue == 3) {
                    new si(ewVar2, map).h();
                    return;
                }
                if (iIntValue == 4) {
                    new ni(ewVar2, map).h();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f6504c.i(true);
                        return;
                    } else if (iIntValue != 7) {
                        er.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f6505d.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (ewVar2 == null) {
            er.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            iZzh = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            iZzh = z ? -1 : zzs.zze().zzh();
        }
        ewVar2.v(iZzh);
    }
}