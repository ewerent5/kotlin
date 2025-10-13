package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.u;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class i<S> extends androidx.fragment.app.c {
    static final Object p0 = "CONFIRM_BUTTON_TAG";
    static final Object q0 = "CANCEL_BUTTON_TAG";
    static final Object r0 = "TOGGLE_BUTTON_TAG";
    private h<S> A0;
    private int B0;
    private CharSequence C0;
    private boolean D0;
    private int E0;
    private TextView F0;
    private CheckableImageButton G0;
    private e.c.b.c.c0.g H0;
    private Button I0;
    private final LinkedHashSet<j<? super S>> s0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> t0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> u0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> v0 = new LinkedHashSet<>();
    private int w0;
    private com.google.android.material.datepicker.d<S> x0;
    private p<S> y0;
    private com.google.android.material.datepicker.a z0;

    /* compiled from: MaterialDatePicker.java */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.s0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.f3());
            }
            i.this.K2();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.t0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.K2();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class c extends o<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s) {
            i.this.m3();
            i.this.I0.setEnabled(i.this.x0.w());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.I0.setEnabled(i.this.x0.w());
            i.this.G0.toggle();
            i iVar = i.this;
            iVar.n3(iVar.G0);
            i.this.l3();
        }
    }

    private static Drawable b3(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, c.a.k.a.a.d(context, e.c.b.c.e.f15197b));
        stateListDrawable.addState(new int[0], c.a.k.a.a.d(context, e.c.b.c.e.f15198c));
        return stateListDrawable;
    }

    private static int c3(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(e.c.b.c.d.M) + resources.getDimensionPixelOffset(e.c.b.c.d.N) + resources.getDimensionPixelOffset(e.c.b.c.d.L);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(e.c.b.c.d.H);
        int i2 = m.f11602e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(e.c.b.c.d.F) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(e.c.b.c.d.K)) + resources.getDimensionPixelOffset(e.c.b.c.d.D);
    }

    private static int e3(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(e.c.b.c.d.E);
        int i2 = l.d().f11598h;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(e.c.b.c.d.G) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(e.c.b.c.d.J));
    }

    private int g3(Context context) {
        int i2 = this.w0;
        return i2 != 0 ? i2 : this.x0.r(context);
    }

    private void h3(Context context) {
        this.G0.setTag(r0);
        this.G0.setImageDrawable(b3(context));
        this.G0.setChecked(this.E0 != 0);
        c.h.l.t.k0(this.G0, null);
        n3(this.G0);
        this.G0.setOnClickListener(new d());
    }

    static boolean i3(Context context) {
        return k3(context, R.attr.windowFullscreen);
    }

    static boolean j3(Context context) {
        return k3(context, e.c.b.c.b.v);
    }

    static boolean k3(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e.c.b.c.z.b.c(context, e.c.b.c.b.s, h.class.getCanonicalName()), new int[]{i2});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public void l3() {
        int iG3 = g3(m2());
        this.A0 = h.Z2(this.x0, iG3, this.z0);
        this.y0 = this.G0.isChecked() ? k.K2(this.x0, iG3, this.z0) : this.A0;
        m3();
        u uVarI = p0().i();
        uVarI.r(e.c.b.c.f.w, this.y0);
        uVarI.l();
        this.y0.I2(new c());
    }

    public void m3() {
        String strD3 = d3();
        this.F0.setContentDescription(String.format(L0(e.c.b.c.j.f15239m), strD3));
        this.F0.setText(strD3);
    }

    public void n3(CheckableImageButton checkableImageButton) {
        this.G0.setContentDescription(this.G0.isChecked() ? checkableImageButton.getContext().getString(e.c.b.c.j.p) : checkableImageButton.getContext().getString(e.c.b.c.j.r));
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.w0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.x0);
        a.b bVar = new a.b(this.z0);
        if (this.A0.V2() != null) {
            bVar.b(this.A0.V2().f11600j);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.B0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.C0);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void I1() throws Resources.NotFoundException {
        super.I1();
        Window window = P2().getWindow();
        if (this.D0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.H0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = F0().getDimensionPixelOffset(e.c.b.c.d.I);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.H0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new e.c.b.c.t.a(P2(), rect));
        }
        l3();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void J1() {
        this.y0.J2();
        super.J1();
    }

    @Override // androidx.fragment.app.c
    public final Dialog O2(Bundle bundle) {
        Dialog dialog = new Dialog(m2(), g3(m2()));
        Context context = dialog.getContext();
        this.D0 = i3(context);
        int iC = e.c.b.c.z.b.c(context, e.c.b.c.b.f15081l, i.class.getCanonicalName());
        e.c.b.c.c0.g gVar = new e.c.b.c.c0.g(context, null, e.c.b.c.b.s, e.c.b.c.k.v);
        this.H0 = gVar;
        gVar.M(context);
        this.H0.X(ColorStateList.valueOf(iC));
        this.H0.W(c.h.l.t.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String d3() {
        return this.x0.e(q0());
    }

    public final S f3() {
        return this.x0.y();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void l1(Bundle bundle) {
        super.l1(bundle);
        if (bundle == null) {
            bundle = o0();
        }
        this.w0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.x0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.z0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.B0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.E0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.u0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.v0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) Q0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.D0 ? e.c.b.c.h.w : e.c.b.c.h.v, viewGroup);
        Context context = viewInflate.getContext();
        if (this.D0) {
            viewInflate.findViewById(e.c.b.c.f.w).setLayoutParams(new LinearLayout.LayoutParams(e3(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(e.c.b.c.f.x);
            View viewFindViewById2 = viewInflate.findViewById(e.c.b.c.f.w);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(e3(context), -1));
            viewFindViewById2.setMinimumHeight(c3(m2()));
        }
        TextView textView = (TextView) viewInflate.findViewById(e.c.b.c.f.C);
        this.F0 = textView;
        c.h.l.t.m0(textView, 1);
        this.G0 = (CheckableImageButton) viewInflate.findViewById(e.c.b.c.f.D);
        TextView textView2 = (TextView) viewInflate.findViewById(e.c.b.c.f.E);
        CharSequence charSequence = this.C0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.B0);
        }
        h3(context);
        this.I0 = (Button) viewInflate.findViewById(e.c.b.c.f.f15204c);
        if (this.x0.w()) {
            this.I0.setEnabled(true);
        } else {
            this.I0.setEnabled(false);
        }
        this.I0.setTag(p0);
        this.I0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(e.c.b.c.f.a);
        button.setTag(q0);
        button.setOnClickListener(new b());
        return viewInflate;
    }
}