package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.h.l.t;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import e.c.b.c.h;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip B;
    private final Chip C;
    private final ClockHandView D;
    private final ClockFaceView E;
    private final MaterialButtonToggleGroup F;
    private final View.OnClickListener G;
    private f H;
    private g I;
    private e J;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.I != null) {
                TimePickerView.this.I.a(((Integer) view.getTag(e.c.b.c.f.G)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
            int i3 = i2 == e.c.b.c.f.f15210i ? 1 : 0;
            if (TimePickerView.this.H == null || !z) {
                return;
            }
            TimePickerView.this.H.a(i3);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.J != null) {
                TimePickerView.this.J.a();
            }
            return zOnDoubleTap;
        }
    }

    class d implements View.OnTouchListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GestureDetector f11892e;

        d(GestureDetector gestureDetector) {
            this.f11892e = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f11892e.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
        void a();
    }

    interface f {
        void a(int i2);
    }

    interface g {
        void a(int i2);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void x() {
        Chip chip = this.B;
        int i2 = e.c.b.c.f.G;
        chip.setTag(i2, 12);
        this.C.setTag(i2, 10);
        this.B.setOnClickListener(this.G);
        this.C.setOnClickListener(this.G);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void y() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.B.setOnTouchListener(dVar);
        this.C.setOnTouchListener(dVar);
    }

    private void z() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.F.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            dVar.e(e.c.b.c.f.f15207f, t.B(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onAttachedToWindow();
        z();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            z();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.G = new a();
        LayoutInflater.from(context).inflate(h.f15227m, this);
        this.E = (ClockFaceView) findViewById(e.c.b.c.f.f15208g);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(e.c.b.c.f.f15211j);
        this.F = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.B = (Chip) findViewById(e.c.b.c.f.f15214m);
        this.C = (Chip) findViewById(e.c.b.c.f.f15212k);
        this.D = (ClockHandView) findViewById(e.c.b.c.f.f15209h);
        y();
        x();
    }
}