package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public class w extends Spinner implements c.h.l.s {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f590e = {R.attr.spinnerMode};

    /* renamed from: f, reason: collision with root package name */
    private final androidx.appcompat.widget.e f591f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f592g;

    /* renamed from: h, reason: collision with root package name */
    private h0 f593h;

    /* renamed from: i, reason: collision with root package name */
    private SpinnerAdapter f594i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f595j;

    /* renamed from: k, reason: collision with root package name */
    private g f596k;

    /* renamed from: l, reason: collision with root package name */
    int f597l;

    /* renamed from: m, reason: collision with root package name */
    final Rect f598m;

    /* compiled from: AppCompatSpinner.java */
    class a extends h0 {
        final /* synthetic */ e n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.n = eVar;
        }

        @Override // androidx.appcompat.widget.h0
        public androidx.appcompat.view.menu.p c() {
            return this.n;
        }

        @Override // androidx.appcompat.widget.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean d() {
            if (w.this.getInternalPopup().a()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().a()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        androidx.appcompat.app.b f600e;

        /* renamed from: f, reason: collision with root package name */
        private ListAdapter f601f;

        /* renamed from: g, reason: collision with root package name */
        private CharSequence f602g;

        c() {
        }

        @Override // androidx.appcompat.widget.w.g
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f600e;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.g
        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f600e;
            if (bVar != null) {
                bVar.dismiss();
                this.f600e = null;
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public void f(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence g() {
            return this.f602g;
        }

        @Override // androidx.appcompat.widget.w.g
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.g
        public void k(CharSequence charSequence) {
            this.f602g = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void n(int i2, int i3) {
            if (this.f601f == null) {
                return;
            }
            b.a aVar = new b.a(w.this.getPopupContext());
            CharSequence charSequence = this.f602g;
            if (charSequence != null) {
                aVar.u(charSequence);
            }
            androidx.appcompat.app.b bVarA = aVar.r(this.f601f, w.this.getSelectedItemPosition(), this).a();
            this.f600e = bVarA;
            ListView listViewE = bVarA.e();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewE.setTextDirection(i2);
                listViewE.setTextAlignment(i3);
            }
            this.f600e.show();
        }

        @Override // androidx.appcompat.widget.w.g
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            w.this.setSelection(i2);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i2, this.f601f.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.w.g
        public void p(ListAdapter listAdapter) {
            this.f601f = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: e, reason: collision with root package name */
        private SpinnerAdapter f604e;

        /* renamed from: f, reason: collision with root package name */
        private ListAdapter f605f;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f604e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f605f = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof s0) {
                    s0 s0Var = (s0) spinnerAdapter;
                    if (s0Var.getDropDownViewTheme() == null) {
                        s0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f605f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f604e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f604e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f604e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f604e;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f604e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f605f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f604e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f604e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    class e extends j0 implements g {
        private CharSequence N;
        ListAdapter O;
        private final Rect P;
        private int Q;

        /* compiled from: AppCompatSpinner.java */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w f606e;

            a(w wVar) {
                this.f606e = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                w.this.setSelection(i2);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i2, eVar.O.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.U(w.this)) {
                    e.this.dismiss();
                } else {
                    e.this.S();
                    e.super.b();
                }
            }
        }

        /* compiled from: AppCompatSpinner.java */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f609e;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f609e = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f609e);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.P = new Rect();
            D(w.this);
            J(true);
            O(0);
            L(new a(w.this));
        }

        void S() {
            Drawable drawableI = i();
            int i2 = 0;
            if (drawableI != null) {
                drawableI.getPadding(w.this.f598m);
                i2 = c1.b(w.this) ? w.this.f598m.right : -w.this.f598m.left;
            } else {
                Rect rect = w.this.f598m;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i3 = wVar.f597l;
            if (i3 == -2) {
                int iA = wVar.a((SpinnerAdapter) this.O, i());
                int i4 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.f598m;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (iA > i5) {
                    iA = i5;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i3);
            }
            f(c1.b(w.this) ? i2 + (((width - paddingRight) - z()) - T()) : i2 + paddingLeft + T());
        }

        public int T() {
            return this.Q;
        }

        boolean U(View view) {
            return c.h.l.t.P(view) && view.getGlobalVisibleRect(this.P);
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence g() {
            return this.N;
        }

        @Override // androidx.appcompat.widget.w.g
        public void k(CharSequence charSequence) {
            this.N = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i2) {
            this.Q = i2;
        }

        @Override // androidx.appcompat.widget.w.g
        public void n(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            S();
            I(2);
            super.b();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewJ.setTextDirection(i2);
                listViewJ.setTextAlignment(i3);
            }
            P(w.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.j0, androidx.appcompat.widget.w.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.O = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        boolean f611e;

        /* compiled from: AppCompatSpinner.java */
        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f611e ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f611e = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    interface g {
        boolean a();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i2);

        CharSequence g();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i2);

        void m(int i2);

        void n(int i2, int i3);

        int o();

        void p(ListAdapter listAdapter);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.J);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f598m);
        Rect rect = this.f598m;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f596k.n(getTextDirection(), getTextAlignment());
        } else {
            this.f596k.n(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f596k;
        if (gVar != null) {
            return gVar.d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f596k;
        if (gVar != null) {
            return gVar.o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f596k != null) {
            return this.f597l;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final g getInternalPopup() {
        return this.f596k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f596k;
        if (gVar != null) {
            return gVar.i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f592g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f596k;
        return gVar != null ? gVar.g() : super.getPrompt();
    }

    @Override // c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f596k;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f596k.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f596k == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f611e || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f596k;
        fVar.f611e = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f593h;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f596k;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f596k;
        if (gVar != null) {
            gVar.m(i2);
            this.f596k.f(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f596k;
        if (gVar != null) {
            gVar.l(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f596k != null) {
            this.f597l = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f596k;
        if (gVar != null) {
            gVar.c(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(c.a.k.a.a.d(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f596k;
        if (gVar != null) {
            gVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f591f;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f595j) {
            this.f594i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f596k != null) {
            Context context = this.f592g;
            if (context == null) {
                context = getContext();
            }
            this.f596k.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.Spinner, androidx.appcompat.widget.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}