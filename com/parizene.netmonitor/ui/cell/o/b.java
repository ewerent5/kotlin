package com.parizene.netmonitor.ui.cell.o;

import android.text.TextUtils;
import com.parizene.netmonitor.m0.b0.k;

/* compiled from: CellInfoItem.java */
/* loaded from: classes3.dex */
public abstract class b<CELL_INFO extends com.parizene.netmonitor.m0.b0.k> {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final CELL_INFO f13819b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13820c;

    public b(boolean z, CELL_INFO cell_info, String str) {
        this.a = z;
        this.f13819b = cell_info;
        this.f13820c = str;
    }

    public String a() {
        return !TextUtils.isEmpty(this.f13820c) ? this.f13820c : "-";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a != bVar.a || !this.f13819b.equals(bVar.f13819b)) {
            return false;
        }
        String str = this.f13820c;
        String str2 = bVar.f13820c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        int iHashCode = (((this.a ? 1 : 0) * 31) + this.f13819b.hashCode()) * 31;
        String str = this.f13820c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}