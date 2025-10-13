package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qq2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private static final qr2<String> f8445i = new qr2<>();

    /* renamed from: j, reason: collision with root package name */
    private final Context f8446j;

    public qq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3, Context context) {
        super(gq2Var, "V7RbzNcQH9mmO13CLejXnEeLBww1fCswCmEYgCbR7fg0aaDM8vr+ky2aLbvCnh+x", "DtfbH9Wfu3mjs65hNYuog0nW6dBYb/642xmI9hs2Qf0=", eu0Var, i2, 29);
        this.f8446j = context;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        this.f8256e.i0("E");
        AtomicReference<String> atomicReferenceA = f8445i.a(this.f8446j.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                if (atomicReferenceA.get() == null) {
                    atomicReferenceA.set((String) this.f8257f.invoke(null, this.f8446j));
                }
            }
        }
        String str = atomicReferenceA.get();
        synchronized (this.f8256e) {
            this.f8256e.i0(pv1.a(str.getBytes(), true));
        }
    }
}