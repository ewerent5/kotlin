package com.parizene.netmonitor.ui.cell;

import ch.qos.logback.core.net.SyslogConstants;
import com.parizene.netmonitor.ui.p0;

/* compiled from: CellUiSettings.java */
/* loaded from: classes3.dex */
public class k {
    public p0 a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13811b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13812c;

    /* renamed from: d, reason: collision with root package name */
    public int f13813d;

    k(p0 p0Var, boolean z, boolean z2, int i2) {
        this.a = p0Var;
        this.f13811b = z;
        this.f13812c = z2;
        this.f13813d = i2;
    }

    public int a(int i2) {
        return this.f13813d == 0 ? Math.round(i2 * 78.07f) : i2 * SyslogConstants.LOG_LOCAL2;
    }
}