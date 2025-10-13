package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bv implements ba<lt> {
    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(lt ltVar, Map map) throws NumberFormatException {
        lt ltVar2 = ltVar;
        bx bxVarZzh = ltVar2.zzh();
        if (bxVarZzh == null) {
            try {
                bx bxVar = new bx(ltVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                ltVar2.h(bxVar);
                bxVarZzh = bxVar;
            } catch (NullPointerException e2) {
                e = e2;
                er.zzg("Unable to parse videoMeta message.", e);
                zzs.zzg().g(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e3) {
                e = e3;
                er.zzg("Unable to parse videoMeta message.", e);
                zzs.zzg().g(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f2 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f3 = Float.parseFloat((String) map.get("currentTime"));
        int i2 = Integer.parseInt((String) map.get("playbackState"));
        int i3 = 0;
        if (i2 >= 0 && i2 <= 3) {
            i3 = i2;
        }
        String str = (String) map.get("aspectRatio");
        float f4 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (er.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f3);
            sb.append(" , duration : ");
            sb.append(f2);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            er.zzd(sb.toString());
        }
        bxVarZzh.L4(f3, f2, i3, zEquals, f4);
    }
}