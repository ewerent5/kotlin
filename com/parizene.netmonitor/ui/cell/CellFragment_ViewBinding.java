package com.parizene.netmonitor.ui.cell;

import android.view.View;
import android.view.ViewStub;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.EmptyRecyclerView;

/* loaded from: classes3.dex */
public class CellFragment_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private CellFragment f13779b;

    public CellFragment_ViewBinding(CellFragment cellFragment, View view) {
        this.f13779b = cellFragment;
        cellFragment.mRecyclerView = (EmptyRecyclerView) butterknife.b.a.c(view, R.id.recycler_view, "field 'mRecyclerView'", EmptyRecyclerView.class);
        cellFragment.mBannerStub = (ViewStub) butterknife.b.a.c(view, R.id.banner_stub, "field 'mBannerStub'", ViewStub.class);
    }
}