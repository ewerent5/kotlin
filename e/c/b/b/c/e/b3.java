package e.c.b.b.c.e;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class b3 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f14388b;

    /* renamed from: c, reason: collision with root package name */
    final String f14389c;

    /* renamed from: d, reason: collision with root package name */
    final String f14390d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14391e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14392f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14393g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14394h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final l3<Context, Boolean> f14395i;

    public b3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final w2<Double> a(String str, double d2) {
        return w2.i(this, str, -3.0d, true);
    }

    public final w2<Long> b(String str, long j2) {
        return w2.j(this, str, j2, true);
    }

    public final w2<String> c(String str, String str2) {
        return w2.k(this, str, str2, true);
    }

    public final w2<Boolean> d(String str, boolean z) {
        return w2.l(this, str, z, true);
    }

    private b3(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable l3<Context, Boolean> l3Var) {
        this.a = null;
        this.f14388b = uri;
        this.f14389c = str2;
        this.f14390d = str3;
        this.f14391e = false;
        this.f14392f = false;
        this.f14393g = false;
        this.f14394h = false;
        this.f14395i = null;
    }
}