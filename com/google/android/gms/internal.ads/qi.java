package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzs;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qi implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f8387e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f8388f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ si f8389g;

    qi(si siVar, String str, String str2) {
        this.f8389g = siVar;
        this.f8387e = str;
        this.f8388f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.f8389g.f8874d.getSystemService("download");
        try {
            String str = this.f8387e;
            String str2 = this.f8388f;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzs.zzc();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f8389g.b("Could not store picture.");
        }
    }
}