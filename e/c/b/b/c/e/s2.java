package e.c.b.b.c.e;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class s2 {
    private final Map<String, Map<String, String>> a;

    s2(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.a.get(uri.toString());
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String strValueOf = String.valueOf(str3);
            str3 = strValueOf.length() != 0 ? str2.concat(strValueOf) : new String(str2);
        }
        return map.get(str3);
    }
}