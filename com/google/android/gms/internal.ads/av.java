package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.zzbx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class av implements ba<lt> {
    private boolean a;

    private static int b(Context context, Map<String, String> map, String str, int i2) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i2;
        }
        try {
            ta3.a();
            return xq.s(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            er.zzi(sb.toString());
            return i2;
        }
    }

    private static void c(bt btVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                btVar.x(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                er.zzi(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            btVar.y(Integer.parseInt(str2));
        }
        if (str3 != null) {
            btVar.z(Integer.parseInt(str3));
        }
        if (str4 != null) {
            btVar.A(Integer.parseInt(str4));
        }
        if (str5 != null) {
            btVar.B(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(lt ltVar, Map map) throws NumberFormatException {
        int i2;
        lt ltVar2 = ltVar;
        String str = (String) map.get("action");
        if (str == null) {
            er.zzi("Action missing from video GMSG.");
            return;
        }
        if (er.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            er.zzd(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                er.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                ltVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                er.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                er.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                ltVar2.G(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                er.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                er.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                ltVar2.e0("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, zzbx.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            ltVar2.e0("onVideoEvent", map4);
            return;
        }
        ct ctVarZzf = ltVar2.zzf();
        if (ctVarZzf == null) {
            er.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = ltVar2.getContext();
            int iB = b(context, map, "x", 0);
            int iB2 = b(context, map, "y", 0);
            int iB3 = b(context, map, "w", -1);
            o3<Boolean> o3Var = w3.f2;
            int iF = ((Boolean) c.c().b(o3Var)).booleanValue() ? iB3 == -1 ? ltVar2.f() : Math.min(iB3, ltVar2.f()) : Math.min(iB3, ltVar2.f() - iB);
            int iB4 = b(context, map, "h", -1);
            int iZzy = ((Boolean) c.c().b(o3Var)).booleanValue() ? iB4 == -1 ? ltVar2.zzy() : Math.min(iB4, ltVar2.zzy()) : Math.min(iB4, ltVar2.zzy() - iB2);
            try {
                i2 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i2 = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ctVarZzf.c() != null) {
                ctVarZzf.a(iB, iB2, iF, iZzy);
                return;
            }
            ctVarZzf.b(iB, iB2, iF, iZzy, i2, z, new kt((String) map.get("flags")));
            bt btVarC = ctVarZzf.c();
            if (btVarC != null) {
                c(btVarC, map);
                return;
            }
            return;
        }
        bx bxVarZzh = ltVar2.zzh();
        if (bxVarZzh != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    er.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    bxVarZzh.K4(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    er.zzi(str6.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                bxVarZzh.zzr();
                return;
            }
        }
        bt btVarC2 = ctVarZzf.c();
        if (btVarC2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            ltVar2.e0("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = ltVar2.getContext();
            int iB5 = b(context2, map, "x", 0);
            int iB6 = b(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iB5, iB6, 0);
            btVarC2.d(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                er.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                btVarC2.t((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                er.zzi(str7.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str7) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            btVarC2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            btVarC2.q();
            return;
        }
        if ("loadControl".equals(str)) {
            c(btVarC2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                btVarC2.u();
                return;
            } else {
                btVarC2.v();
                return;
            }
        }
        if ("pause".equals(str)) {
            btVarC2.r();
            return;
        }
        if ("play".equals(str)) {
            btVarC2.s();
            return;
        }
        if ("show".equals(str)) {
            btVarC2.setVisibility(0);
            return;
        }
        if (!"src".equals(str)) {
            if ("touchMove".equals(str)) {
                Context context3 = ltVar2.getContext();
                btVarC2.p(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
                if (this.a) {
                    return;
                }
                ltVar2.zzl();
                this.a = true;
                return;
            }
            if (!"volume".equals(str)) {
                if ("watermark".equals(str)) {
                    btVarC2.e();
                    return;
                } else {
                    er.zzi(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                er.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                btVarC2.w(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                er.zzi(str8.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str8) : new String("Could not parse volume parameter from volume video GMSG: "));
                return;
            }
        }
        String str9 = (String) map.get("src");
        Integer numValueOf = null;
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                String str10 = (String) map.get("periodicReportIntervalMs");
                StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 65);
                sb2.append("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ");
                sb2.append(str10);
                er.zzi(sb2.toString());
            }
        }
        String[] strArr = {str9};
        String str11 = (String) map.get("demuxed");
        if (str11 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str11);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr2[i3] = jSONArray.getString(i3);
                }
                strArr = strArr2;
            } catch (JSONException unused8) {
                er.zzi(str11.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str11) : new String("Malformed demuxed URL list for playback: "));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            ltVar2.r0(numValueOf.intValue());
        }
        btVarC2.o(str9, strArr);
    }
}