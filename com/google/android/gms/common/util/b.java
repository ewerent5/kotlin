package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class b {
    @RecentlyNonNull
    public static <T> T[] a(@RecentlyNonNull T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr4 = tArr[i2];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    public static <T> boolean b(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (!com.google.android.gms.common.internal.o.a(tArr[i2], t)) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }
}