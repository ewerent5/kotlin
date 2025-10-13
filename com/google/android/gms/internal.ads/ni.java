package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ni extends vi {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f7707c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f7708d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7709e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7710f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7711g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7712h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7713i;

    public ni(ew ewVar, Map<String, String> map) {
        super(ewVar, "createCalendarEvent");
        this.f7707c = map;
        this.f7708d = ewVar.zzj();
        this.f7709e = k("description");
        this.f7712h = k("summary");
        this.f7710f = l("start_ticks");
        this.f7711g = l("end_ticks");
        this.f7713i = k("location");
    }

    private final String k(String str) {
        return TextUtils.isEmpty(this.f7707c.get(str)) ? "" : this.f7707c.get(str);
    }

    private final long l(String str) {
        String str2 = this.f7707c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void h() throws JSONException {
        if (this.f7708d == null) {
            b("Activity context is not available.");
            return;
        }
        zzs.zzc();
        if (!new h3(this.f7708d).b()) {
            b("This feature is not available on the device.");
            return;
        }
        zzs.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7708d);
        Resources resourcesF = zzs.zzg().f();
        builder.setTitle(resourcesF != null ? resourcesF.getString(R.string.s5) : "Create calendar event");
        builder.setMessage(resourcesF != null ? resourcesF.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(resourcesF != null ? resourcesF.getString(R.string.s3) : "Accept", new li(this));
        builder.setNegativeButton(resourcesF != null ? resourcesF.getString(R.string.s4) : "Decline", new mi(this));
        builder.create().show();
    }

    @TargetApi(14)
    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f7709e);
        data.putExtra("eventLocation", this.f7713i);
        data.putExtra("description", this.f7712h);
        long j2 = this.f7710f;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.f7711g;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }
}