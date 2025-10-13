package com.parizene.netmonitor.ui.cell.n;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.b1;
import com.parizene.netmonitor.ui.cell.holders.SignalPlotItemViewHolder;
import com.parizene.netmonitor.ui.cell.o.h;
import java.util.ArrayList;

/* compiled from: SignalPlotItemViewBinder.java */
/* loaded from: classes3.dex */
public class i implements b1<com.parizene.netmonitor.ui.cell.o.i, SignalPlotItemViewHolder> {
    private Context a;

    public i(Context context) {
        this.a = context;
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(com.parizene.netmonitor.ui.cell.o.i iVar, SignalPlotItemViewHolder signalPlotItemViewHolder) {
        com.parizene.netmonitor.ui.cell.o.h hVarA = iVar.a();
        ArrayList arrayList = new ArrayList();
        int size = hVarA.a.size();
        int i2 = -90;
        int i3 = -90;
        for (int i4 = 0; i4 < size; i4++) {
            h.a aVar = hVarA.a.get(i4);
            arrayList.add(Integer.valueOf((61 - size) + i4));
            if (aVar != null) {
                arrayList.add(Integer.valueOf(aVar.a));
                int i5 = aVar.a;
                if (i5 < i2) {
                    i2 = i5;
                }
                if (i5 > i3) {
                    i3 = i5;
                }
            } else {
                arrayList.add(null);
            }
        }
        signalPlotItemViewHolder.N(arrayList, i2, i3);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SignalPlotItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new SignalPlotItemViewHolder(this.a, layoutInflater.inflate(R.layout.item_signal_plot, viewGroup, false));
    }
}