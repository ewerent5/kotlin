package com.google.android.gms.internal.ads;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.ads.internal.util.zzbk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a9 implements ba<Object> {
    private final b9 a;

    public a9(b9 b9Var) {
        this.a = b9Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        if (this.a == null) {
            return;
        }
        String str = map.get(Action.NAME_ATTRIBUTE);
        if (str == null) {
            er.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZzj = null;
        if (map.containsKey("info")) {
            try {
                bundleZzj = zzbk.zzj(new JSONObject(map.get("info")));
            } catch (JSONException e2) {
                er.zzg("Failed to convert ad metadata to JSON.", e2);
            }
        }
        if (bundleZzj == null) {
            er.zzf("Failed to convert ad metadata to Bundle.");
        } else {
            this.a.a(str, bundleZzj);
        }
    }
}