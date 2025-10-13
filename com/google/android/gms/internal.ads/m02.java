package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m02 {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final ClipData f7392b;

    static {
        a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        f7392b = ClipData.newIntent("", new Intent());
    }

    @Nullable
    public static PendingIntent a(Context context, int i2, Intent intent, int i3, int i4) {
        boolean z = true;
        h12.a((i3 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        h12.a(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            h12.a(!b(i3, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i3, 67108864)) {
                z = false;
            }
            h12.a(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i3, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f7392b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i3);
    }

    private static boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}