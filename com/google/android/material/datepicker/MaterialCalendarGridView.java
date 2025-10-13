package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import ch.qos.logback.classic.Level;
import java.util.Calendar;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: e, reason: collision with root package name */
    private final Calendar f11545e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11546f;

    class a extends c.h.l.a {
        a() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.a0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter().i());
        } else if (i2 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l2, Long l3, Long l4, Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iC;
        int iA2;
        int iC2;
        int width;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter = getAdapter();
        d<?> dVar = adapter.f11604g;
        c cVar = adapter.f11606i;
        Long item = adapter.getItem(adapter.b());
        Long item2 = adapter.getItem(adapter.i());
        for (c.h.k.d<Long, Long> dVar2 : dVar.f()) {
            Long l2 = dVar2.a;
            if (l2 != null) {
                if (dVar2.f3105b != null) {
                    long jLongValue = l2.longValue();
                    long jLongValue2 = dVar2.f3105b.longValue();
                    if (!d(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                        boolean zD = com.google.android.material.internal.k.d(this);
                        if (jLongValue < item.longValue()) {
                            iA = adapter.b();
                            iC = adapter.f(iA) ? 0 : !zD ? materialCalendarGridView.getChildAt(iA - 1).getRight() : materialCalendarGridView.getChildAt(iA - 1).getLeft();
                        } else {
                            materialCalendarGridView.f11545e.setTimeInMillis(jLongValue);
                            iA = adapter.a(materialCalendarGridView.f11545e.get(5));
                            iC = c(materialCalendarGridView.getChildAt(iA));
                        }
                        if (jLongValue2 > item2.longValue()) {
                            iA2 = Math.min(adapter.i(), getChildCount() - 1);
                            iC2 = adapter.g(iA2) ? getWidth() : !zD ? materialCalendarGridView.getChildAt(iA2).getRight() : materialCalendarGridView.getChildAt(iA2).getLeft();
                        } else {
                            materialCalendarGridView.f11545e.setTimeInMillis(jLongValue2);
                            iA2 = adapter.a(materialCalendarGridView.f11545e.get(5));
                            iC2 = c(materialCalendarGridView.getChildAt(iA2));
                        }
                        int itemId = (int) adapter.getItemId(iA);
                        int itemId2 = (int) adapter.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + cVar.a.c();
                            int bottom = childAt.getBottom() - cVar.a.b();
                            if (zD) {
                                int i3 = iA2 > numColumns2 ? 0 : iC2;
                                width = numColumns > iA ? getWidth() : iC;
                                i2 = i3;
                            } else {
                                i2 = numColumns > iA ? 0 : iC;
                                width = iA2 > numColumns2 ? getWidth() : iC2;
                            }
                            canvas.drawRect(i2, top, width, bottom, cVar.f11570h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            a(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.f11546f) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Level.ALL_INT));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i2);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f11545e = s.k();
        if (i.i3(getContext())) {
            setNextFocusLeftId(e.c.b.c.f.a);
            setNextFocusRightId(e.c.b.c.f.f15204c);
        }
        this.f11546f = i.j3(getContext());
        c.h.l.t.k0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}