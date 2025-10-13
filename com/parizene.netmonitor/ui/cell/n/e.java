package com.parizene.netmonitor.ui.cell.n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.b1;

/* compiled from: LocationDisabledBannerItemViewBinder.java */
/* loaded from: classes3.dex */
public class e implements b1<com.parizene.netmonitor.ui.cell.o.d, b> {
    private a a;

    /* compiled from: LocationDisabledBannerItemViewBinder.java */
    public interface a {
        void m();
    }

    /* compiled from: LocationDisabledBannerItemViewBinder.java */
    public static class b extends RecyclerView.d0 {
        public b(View view, final a aVar) throws NoSuchMethodException, SecurityException {
            super(view);
            ButterKnife.a(this, view);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.cell.n.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aVar.m();
                }
            });
        }
    }

    public e(a aVar) {
        this.a = aVar;
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(com.parizene.netmonitor.ui.cell.o.d dVar, b bVar) {
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.item_location_disabled_banner, viewGroup, false), this.a);
    }
}