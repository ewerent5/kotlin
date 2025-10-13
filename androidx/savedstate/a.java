package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;

/* compiled from: SavedStateRegistryController.java */
/* loaded from: classes.dex */
public final class a {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f2042b = new SavedStateRegistry();

    private a(b bVar) {
        this.a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f2042b;
    }

    public void c(Bundle bundle) {
        g gVarI = this.a.i();
        if (gVarI.b() != g.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        gVarI.a(new Recreator(this.a));
        this.f2042b.b(gVarI, bundle);
    }

    public void d(Bundle bundle) {
        this.f2042b.c(bundle);
    }
}