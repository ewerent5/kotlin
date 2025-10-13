package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes.dex */
class g extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final int f11572e;

    /* renamed from: f, reason: collision with root package name */
    private final Calendar f11573f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11574g;

    /* renamed from: h, reason: collision with root package name */
    private final int f11575h;

    static {
        f11572e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarK = s.k();
        this.f11573f = calendarK;
        this.f11574g = calendarK.getMaximum(7);
        this.f11575h = calendarK.getFirstDayOfWeek();
    }

    private int b(int i2) {
        int i3 = i2 + this.f11575h;
        int i4 = this.f11574g;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i2) {
        if (i2 >= this.f11574g) {
            return null;
        }
        return Integer.valueOf(b(i2));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11574g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(e.c.b.c.h.o, viewGroup, false);
        }
        this.f11573f.set(7, b(i2));
        textView.setText(this.f11573f.getDisplayName(7, f11572e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(e.c.b.c.j.n), this.f11573f.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}