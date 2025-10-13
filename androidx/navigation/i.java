package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* compiled from: NavDeepLinkRequest.java */
/* loaded from: classes.dex */
public class i {
    private final Uri a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1317b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1318c;

    i(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public String a() {
        return this.f1317b;
    }

    public String b() {
        return this.f1318c;
    }

    public Uri c() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.a != null) {
            sb.append(" uri=");
            sb.append(this.a.toString());
        }
        if (this.f1317b != null) {
            sb.append(" action=");
            sb.append(this.f1317b);
        }
        if (this.f1318c != null) {
            sb.append(" mimetype=");
            sb.append(this.f1318c);
        }
        sb.append(" }");
        return sb.toString();
    }

    i(Uri uri, String str, String str2) {
        this.a = uri;
        this.f1317b = str;
        this.f1318c = str2;
    }
}