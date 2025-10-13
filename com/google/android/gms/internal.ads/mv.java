package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mv implements ba<lt> {
    private static final Integer b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            er.zzi(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(lt ltVar, Map map) {
        lv ovVar;
        lt ltVar2 = ltVar;
        if (er.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String strValueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(strValueOf);
            er.zzd(sb.toString());
        }
        zzs.zzy();
        if (map.containsKey("abort")) {
            if (ev.f(ltVar2)) {
                return;
            }
            er.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numB = b(map, "periodicReportIntervalMs");
        Integer numB2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer numB3 = b(map, "exoPlayerIdleIntervalMs");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    er.zzi(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (ev.e(ltVar2) != null) {
                er.zzi("Precache task is already running.");
                return;
            }
            if (ltVar2.zzk() == null) {
                er.zzi("Precache requires a dependency provider.");
                return;
            }
            kt ktVar = new kt((String) map.get("flags"));
            Integer numB4 = b(map, "player");
            if (numB4 == null) {
                numB4 = 0;
            }
            if (numB != null) {
                ltVar2.r0(numB.intValue());
            }
            if (numB2 != null) {
                ltVar2.m(numB2.intValue());
            }
            if (numB3 != null) {
                ltVar2.zzC(numB3.intValue());
            }
            int iIntValue = numB4.intValue();
            yu yuVar = ltVar2.zzk().zzc;
            if (iIntValue > 0) {
                int iB = tu.B();
                ovVar = iB < ktVar.f7069h ? new tv(ltVar2, ktVar) : iB < ktVar.f7063b ? new rv(ltVar2, ktVar) : new pv(ltVar2);
            } else {
                ovVar = new ov(ltVar2);
            }
            new dv(ltVar2, ovVar, str, strArr).zzb();
        } else {
            dv dvVarE = ev.e(ltVar2);
            if (dvVarE == null) {
                er.zzi("Precache must specify a source.");
                return;
            }
            ovVar = dvVarE.f5521b;
        }
        Integer numB5 = b(map, "minBufferMs");
        if (numB5 != null) {
            ovVar.l(numB5.intValue());
        }
        Integer numB6 = b(map, "maxBufferMs");
        if (numB6 != null) {
            ovVar.j(numB6.intValue());
        }
        Integer numB7 = b(map, "bufferForPlaybackMs");
        if (numB7 != null) {
            ovVar.m(numB7.intValue());
        }
        Integer numB8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (numB8 != null) {
            ovVar.n(numB8.intValue());
        }
    }
}