package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class si extends vi {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f8873c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f8874d;

    public si(ew ewVar, Map<String, String> map) {
        super(ewVar, "storePicture");
        this.f8873c = map;
        this.f8874d = ewVar.zzj();
    }

    public final void h() throws JSONException {
        if (this.f8874d == null) {
            b("Activity context is not available");
            return;
        }
        zzs.zzc();
        if (!new h3(this.f8874d).a()) {
            b("Feature is not supported by the device.");
            return;
        }
        String str = this.f8873c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            b("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String strValueOf = String.valueOf(str);
            b(strValueOf.length() != 0 ? "Invalid image url: ".concat(strValueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        zzs.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            String strValueOf2 = String.valueOf(lastPathSegment);
            b(strValueOf2.length() != 0 ? "Image type not recognized: ".concat(strValueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resourcesF = zzs.zzg().f();
        zzs.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f8874d);
        builder.setTitle(resourcesF != null ? resourcesF.getString(R.string.s1) : "Save image");
        builder.setMessage(resourcesF != null ? resourcesF.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builder.setPositiveButton(resourcesF != null ? resourcesF.getString(R.string.s3) : "Accept", new qi(this, str, lastPathSegment));
        builder.setNegativeButton(resourcesF != null ? resourcesF.getString(R.string.s4) : "Decline", new ri(this));
        builder.create().show();
    }
}