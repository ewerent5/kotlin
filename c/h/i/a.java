package c.h.i;

import android.util.Base64;
import c.h.k.h;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class a {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3030b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3031c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f3032d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3033e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3034f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) h.c(str);
        this.a = str4;
        String str5 = (String) h.c(str2);
        this.f3030b = str5;
        String str6 = (String) h.c(str3);
        this.f3031c = str6;
        this.f3032d = (List) h.c(list);
        this.f3033e = 0;
        this.f3034f = str4 + "-" + str5 + "-" + str6;
    }

    public List<List<byte[]>> a() {
        return this.f3032d;
    }

    public int b() {
        return this.f3033e;
    }

    public String c() {
        return this.f3034f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f3030b;
    }

    public String f() {
        return this.f3031c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.f3030b + ", mQuery: " + this.f3031c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f3032d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f3032d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3033e);
        return sb.toString();
    }
}