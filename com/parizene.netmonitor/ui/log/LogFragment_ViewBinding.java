package com.parizene.netmonitor.ui.log;

import android.view.View;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.EmptyRecyclerView;

/* loaded from: classes3.dex */
public class LogFragment_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private LogFragment f13862b;

    public LogFragment_ViewBinding(LogFragment logFragment, View view) {
        this.f13862b = logFragment;
        logFragment.mRecyclerView = (EmptyRecyclerView) butterknife.b.a.c(view, R.id.recycler_view, "field 'mRecyclerView'", EmptyRecyclerView.class);
    }
}