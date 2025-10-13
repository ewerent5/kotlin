package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class e9 implements ba<ew> {
    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) throws NumberFormatException {
        ew ewVar2 = ewVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                er.zzi("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                er.zzi("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jC = zzs.zzj().c() + (Long.parseLong(str4) - zzs.zzj().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                ewVar2.zzq().b(str2, str3, jC);
                return;
            } catch (NumberFormatException e2) {
                er.zzj("Malformed timestamp for CSI tick.", e2);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                er.zzi("No value given for CSI experiment.");
                return;
            } else {
                ewVar2.zzq().c().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(Action.NAME_ATTRIBUTE);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                er.zzi("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                er.zzi("No name given for CSI extra.");
            } else {
                ewVar2.zzq().c().d(str6, str7);
            }
        }
    }
}