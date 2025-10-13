package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzs;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ml implements Runnable {

    /* renamed from: e */
    private final OutputStream f7502e;

    /* renamed from: f */
    private final byte[] f7503f;

    ml(OutputStream outputStream, byte[] bArr) {
        this.f7502e = outputStream;
        this.f7503f = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OutputStream outputStream = this.f7502e;
        byte[] bArr = this.f7503f;
        Parcelable.Creator<ol> creator = ol.CREATOR;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                try {
                    dataOutputStream2.writeInt(bArr.length);
                    dataOutputStream2.write(bArr);
                    com.google.android.gms.common.util.l.a(dataOutputStream2);
                } catch (IOException e2) {
                    e = e2;
                    dataOutputStream = dataOutputStream2;
                    er.zzg("Error transporting the ad response", e);
                    zzs.zzg().g(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream == null) {
                        com.google.android.gms.common.util.l.a(outputStream);
                    } else {
                        com.google.android.gms.common.util.l.a(dataOutputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream == null) {
                        com.google.android.gms.common.util.l.a(outputStream);
                    } else {
                        com.google.android.gms.common.util.l.a(dataOutputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }
}