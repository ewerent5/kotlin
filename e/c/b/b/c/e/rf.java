package e.c.b.b.c.e;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class rf extends xf {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<Bundle> f14822e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f14823f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T U(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L38
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L38
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.rf.U(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String Y(long j2) {
        return (String) U(m4(j2), String.class);
    }

    public final Bundle m4(long j2) {
        Bundle bundle;
        synchronized (this.f14822e) {
            if (!this.f14823f) {
                try {
                    this.f14822e.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f14822e.get();
        }
        return bundle;
    }

    @Override // e.c.b.b.c.e.uf
    public final void w(Bundle bundle) {
        synchronized (this.f14822e) {
            try {
                this.f14822e.set(bundle);
                this.f14823f = true;
            } finally {
                this.f14822e.notify();
            }
        }
    }
}