package e.c.b.b.c.e;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class m2 implements l2 {
    private static m2 a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Context f14710b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final ContentObserver f14711c;

    private m2(Context context) {
        this.f14710b = context;
        p2 p2Var = new p2(this, null);
        this.f14711c = p2Var;
        context.getContentResolver().registerContentObserver(d2.a, true, p2Var);
    }

    static m2 a(Context context) {
        m2 m2Var;
        synchronized (m2.class) {
            if (a == null) {
                a = androidx.core.content.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new m2(context) : new m2();
            }
            m2Var = a;
        }
        return m2Var;
    }

    static synchronized void b() {
        Context context;
        m2 m2Var = a;
        if (m2Var != null && (context = m2Var.f14710b) != null && m2Var.f14711c != null) {
            context.getContentResolver().unregisterContentObserver(a.f14711c);
        }
        a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // e.c.b.b.c.e.l2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        if (this.f14710b == null) {
            return null;
        }
        try {
            return (String) k2.a(new n2(this, str) { // from class: e.c.b.b.c.e.q2
                private final m2 a;

                /* renamed from: b, reason: collision with root package name */
                private final String f14780b;

                {
                    this.a = this;
                    this.f14780b = str;
                }

                @Override // e.c.b.b.c.e.n2
                public final Object zza() {
                    return this.a.c(this.f14780b);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    final /* synthetic */ String c(String str) {
        return d2.a(this.f14710b.getContentResolver(), str, null);
    }

    private m2() {
        this.f14710b = null;
        this.f14711c = null;
    }
}