package c.h.h;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class b {
    public static c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? c.d(configuration.getLocales()) : c.a(configuration.locale);
    }
}