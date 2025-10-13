package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import j$.util.Spliterator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class z23 {
    ByteArrayOutputStream a = new ByteArrayOutputStream(Spliterator.CONCURRENT);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f10536b = new Base64OutputStream(this.a, 10);

    public final String toString() throws IOException {
        try {
            this.f10536b.close();
        } catch (IOException e2) {
            er.zzg("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.a.close();
            return this.a.toString();
        } catch (IOException e3) {
            er.zzg("HashManager: Unable to convert to Base64.", e3);
            return "";
        } finally {
            this.a = null;
            this.f10536b = null;
        }
    }
}