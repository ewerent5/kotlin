package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* loaded from: classes.dex */
public class k extends androidx.recyclerview.widget.r {

    /* renamed from: f, reason: collision with root package name */
    final RecyclerView f1448f;

    /* renamed from: g, reason: collision with root package name */
    final c.h.l.a f1449g;

    /* renamed from: h, reason: collision with root package name */
    final c.h.l.a f1450h;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    class a extends c.h.l.a {
        a() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            Preference preferenceE;
            k.this.f1449g.g(view, cVar);
            int iD0 = k.this.f1448f.d0(view);
            RecyclerView.g adapter = k.this.f1448f.getAdapter();
            if ((adapter instanceof h) && (preferenceE = ((h) adapter).E(iD0)) != null) {
                preferenceE.W(cVar);
            }
        }

        @Override // c.h.l.a
        public boolean j(View view, int i2, Bundle bundle) {
            return k.this.f1449g.j(view, i2, bundle);
        }
    }

    public k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f1449g = super.n();
        this.f1450h = new a();
        this.f1448f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.r
    public c.h.l.a n() {
        return this.f1450h;
    }
}