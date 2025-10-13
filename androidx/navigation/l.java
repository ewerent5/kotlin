package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.r;

/* compiled from: NavGraphNavigator.java */
@r.b("navigation")
/* loaded from: classes.dex */
public class l extends r<k> {
    private final s a;

    public l(s sVar) {
        this.a = sVar;
    }

    @Override // androidx.navigation.r
    public boolean e() {
        return true;
    }

    @Override // androidx.navigation.r
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k a() {
        return new k(this);
    }

    @Override // androidx.navigation.r
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public j b(k kVar, Bundle bundle, o oVar, r.a aVar) {
        int I = kVar.I();
        if (I == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + kVar.l());
        }
        j jVarG = kVar.G(I, false);
        if (jVarG != null) {
            return this.a.e(jVarG.o()).b(jVarG, jVarG.e(bundle), oVar, aVar);
        }
        throw new IllegalArgumentException("navigation destination " + kVar.H() + " is not a direct child of this NavGraph");
    }
}