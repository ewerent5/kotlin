package com.parizene.netmonitor.ui.wifi;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.h;
import com.parizene.netmonitor.ui.cell.n.e;
import com.parizene.netmonitor.ui.i1;

/* compiled from: WifiAdapter.java */
/* loaded from: classes3.dex */
class c extends i1<Object, WifiItemViewHolder> {

    /* compiled from: WifiAdapter.java */
    class a extends h.d<Object> {
        a() {
        }

        @Override // androidx.recyclerview.widget.h.d
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // androidx.recyclerview.widget.h.d
        public boolean b(Object obj, Object obj2) {
            if (obj.getClass() == obj2.getClass() && obj.getClass() == e.class) {
                return ((e) obj).f14049b.equals(((e) obj2).f14049b);
            }
            return false;
        }
    }

    c(LayoutInflater layoutInflater, e.a aVar) {
        super(layoutInflater, new a());
        E(com.parizene.netmonitor.ui.cell.o.d.class, new com.parizene.netmonitor.ui.cell.n.e(aVar));
        E(e.class, new f());
    }
}