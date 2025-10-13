package e.c.b.b.c.e;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class t2 {
    private static final c.e.a<String, Uri> a = new c.e.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        c.e.a<String, Uri> aVar = a;
        uri = aVar.get(str);
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode(str));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            aVar.put(str, uri);
        }
        return uri;
    }
}