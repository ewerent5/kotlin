package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class jq1 implements Runnable {

    /* renamed from: e */
    private final InputStream f6812e;

    /* renamed from: f */
    private final ParcelFileDescriptor f6813f;

    jq1(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f6812e = inputStream;
        this.f6813f = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        InputStream inputStream = this.f6812e;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f6813f);
                try {
                    com.google.android.gms.common.util.l.b(inputStream, autoCloseOutputStream);
                    autoCloseOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}