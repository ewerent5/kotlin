package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class rk {

    @Nonnull
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f8665b;

    /* renamed from: c, reason: collision with root package name */
    private final zp f8666c;

    public rk(qk qkVar) {
        View view = qkVar.a;
        this.a = view;
        Map<String, WeakReference<View>> map = qkVar.f8400b;
        this.f8665b = map;
        zp zpVarA = nk.a(qkVar.a.getContext());
        this.f8666c = zpVarA;
        if (zpVarA == null || map.isEmpty()) {
            return;
        }
        try {
            zpVarA.zzi(new sk(e.c.b.b.b.d.m4(view).asBinder(), e.c.b.b.b.d.m4(map).asBinder()));
        } catch (RemoteException unused) {
            er.zzf("Failed to call remote method.");
        }
    }

    public final void a(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.f8666c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f8666c.zzg(list, e.c.b.b.b.d.m4(this.a), new ok(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("Internal error: ");
            sb.append(strValueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }

    public final void b(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.f8666c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f8666c.zzh(new ArrayList(Arrays.asList(uri)), e.c.b.b.b.d.m4(this.a), new pk(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("Internal error: ");
            sb.append(strValueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void c(MotionEvent motionEvent) {
        zp zpVar = this.f8666c;
        if (zpVar == null) {
            er.zzd("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zpVar.zzf(e.c.b.b.b.d.m4(motionEvent));
        } catch (RemoteException unused) {
            er.zzf("Failed to call remote method.");
        }
    }
}