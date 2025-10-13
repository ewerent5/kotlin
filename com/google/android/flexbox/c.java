package com.google.android.flexbox;

import android.view.View;
import ch.qos.logback.classic.Level;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexLine.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    int f4482e;

    /* renamed from: f, reason: collision with root package name */
    int f4483f;

    /* renamed from: g, reason: collision with root package name */
    int f4484g;

    /* renamed from: h, reason: collision with root package name */
    int f4485h;

    /* renamed from: i, reason: collision with root package name */
    int f4486i;

    /* renamed from: j, reason: collision with root package name */
    float f4487j;

    /* renamed from: k, reason: collision with root package name */
    float f4488k;

    /* renamed from: l, reason: collision with root package name */
    int f4489l;

    /* renamed from: m, reason: collision with root package name */
    int f4490m;
    int o;
    int p;
    boolean q;
    boolean r;
    int a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    int f4479b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    int f4480c = Level.ALL_INT;

    /* renamed from: d, reason: collision with root package name */
    int f4481d = Level.ALL_INT;
    List<Integer> n = new ArrayList();

    c() {
    }

    public int a() {
        return this.f4484g;
    }

    public int b() {
        return this.f4485h;
    }

    public int c() {
        return this.f4485h - this.f4486i;
    }

    void d(View view, int i2, int i3, int i4, int i5) {
        b bVar = (b) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - bVar.getMarginLeft()) - i2);
        this.f4479b = Math.min(this.f4479b, (view.getTop() - bVar.getMarginTop()) - i3);
        this.f4480c = Math.max(this.f4480c, view.getRight() + bVar.getMarginRight() + i4);
        this.f4481d = Math.max(this.f4481d, view.getBottom() + bVar.getMarginBottom() + i5);
    }
}