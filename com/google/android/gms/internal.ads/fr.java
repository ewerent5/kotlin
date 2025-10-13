package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.lang.reflect.Array;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class fr {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    if (!com.google.android.gms.common.internal.o.a(Array.get(obj, i2), Array.get(obj2, i2))) {
                        return false;
                    }
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}