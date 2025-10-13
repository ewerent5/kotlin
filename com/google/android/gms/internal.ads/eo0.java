package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eo0 {
    private final zzbe a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f5679b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5680c;

    public eo0(zzbe zzbeVar, com.google.android.gms.common.util.f fVar, Executor executor) {
        this.a = zzbeVar;
        this.f5679b = fVar;
        this.f5680c = executor;
    }

    static /* synthetic */ Bitmap b(eo0 eo0Var, byte[] bArr, double d2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) c.c().b(w3.l4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            eo0Var.c(bArr, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth * options.outHeight;
            if (i2 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i2 - 1) / ((Integer) c.c().b(w3.m4)).intValue())) / 2);
            }
        }
        return eo0Var.c(bArr, options);
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long jC = this.f5679b.c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jC2 = this.f5679b.c();
        if (Build.VERSION.SDK_INT >= 19 && bitmapDecodeByteArray != null) {
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            long j2 = jC2 - jC;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j2);
            sb.append(" on ui thread: ");
            sb.append(z);
            zze.zza(sb.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final g52<Bitmap> a(String str, double d2, boolean z) {
        return y42.i(this.a.zza(str), new do0(this, d2, z), this.f5680c);
    }
}