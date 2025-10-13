package com.parizene.netmonitor.ui.cell.o;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SignalHistory.java */
/* loaded from: classes3.dex */
public class h {
    public List<a> a = new ArrayList();

    /* compiled from: SignalHistory.java */
    public static class a {
        public int a;

        public a(int i2) {
            this.a = i2;
        }
    }

    public h a(a aVar) {
        if (this.a.size() == 61) {
            this.a.remove(0);
        }
        this.a.add(aVar);
        return this;
    }
}