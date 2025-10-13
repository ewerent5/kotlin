package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements i {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Handler f2079e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Runnable f2080f;

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            this.f2079e.removeCallbacks(this.f2080f);
            kVar.i().c(this);
        }
    }
}