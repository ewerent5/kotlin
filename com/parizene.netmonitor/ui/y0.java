package com.parizene.netmonitor.ui;

import androidx.fragment.app.Fragment;
import com.parizene.netmonitor.ui.cell.CellFragment;
import com.parizene.netmonitor.ui.log.LogFragment;
import com.parizene.netmonitor.ui.map.MapFragment;
import com.parizene.netmonitor.ui.wifi.WifiFragment;

/* compiled from: HomeViewPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class y0 extends androidx.fragment.app.q {

    /* renamed from: h */
    private boolean f14067h;

    /* compiled from: HomeViewPagerAdapter.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x0.valuesCustom().length];
            iArr[x0.CELL.ordinal()] = 1;
            iArr[x0.LOG.ordinal()] = 2;
            iArr[x0.MAP.ordinal()] = 3;
            iArr[x0.WIFI.ordinal()] = 4;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.fragment.app.m mVar) {
        super(mVar, 1);
        i.y.d.l.d(mVar, "fm");
    }

    @Override // androidx.viewpager.widget.a
    public int c() {
        int length = x0.valuesCustom().length;
        return !this.f14067h ? length - 1 : length;
    }

    @Override // androidx.fragment.app.q
    public Fragment q(int i2) {
        int i3 = a.a[x0.valuesCustom()[i2].ordinal()];
        if (i3 == 1) {
            return new CellFragment();
        }
        if (i3 == 2) {
            return new LogFragment();
        }
        if (i3 == 3) {
            return new MapFragment();
        }
        if (i3 == 4) {
            return new WifiFragment();
        }
        throw new i.k();
    }

    public final void t(boolean z) {
        this.f14067h = z;
    }
}