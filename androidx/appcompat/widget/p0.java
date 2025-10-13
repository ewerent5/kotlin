package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: e, reason: collision with root package name */
    private static final Interpolator f537e = new DecelerateInterpolator();

    /* renamed from: f, reason: collision with root package name */
    Runnable f538f;

    /* renamed from: g, reason: collision with root package name */
    private c f539g;

    /* renamed from: h, reason: collision with root package name */
    i0 f540h;

    /* renamed from: i, reason: collision with root package name */
    private Spinner f541i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f542j;

    /* renamed from: k, reason: collision with root package name */
    int f543k;

    /* renamed from: l, reason: collision with root package name */
    int f544l;

    /* renamed from: m, reason: collision with root package name */
    private int f545m;
    private int n;

    /* compiled from: ScrollingTabContainerView.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f546e;

        a(View view) {
            this.f546e = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f546e.getLeft() - ((p0.this.getWidth() - this.f546e.getWidth()) / 2), 0);
            p0.this.f538f = null;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f540h.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) p0.this.f540h.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f540h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = p0.this.f540h.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class d extends LinearLayout {

        /* renamed from: e, reason: collision with root package name */
        private final int[] f550e;

        /* renamed from: f, reason: collision with root package name */
        private a.c f551f;

        /* renamed from: g, reason: collision with root package name */
        private TextView f552g;

        /* renamed from: h, reason: collision with root package name */
        private ImageView f553h;

        /* renamed from: i, reason: collision with root package name */
        private View f554i;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z) {
            int i2 = c.a.a.f2443d;
            super(context, null, i2);
            int[] iArr = {R.attr.background};
            this.f550e = iArr;
            this.f551f = cVar;
            w0 w0VarV = w0.v(context, null, iArr, i2, 0);
            if (w0VarV.s(0)) {
                setBackgroundDrawable(w0VarV.g(0));
            }
            w0VarV.w();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f551f = cVar;
            c();
        }

        public a.c b() {
            return this.f551f;
        }

        public void c() {
            a.c cVar = this.f551f;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f554i = viewB;
                TextView textView = this.f552g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f553h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f553h.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f554i;
            if (view != null) {
                removeView(view);
                this.f554i = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f553h == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f553h = oVar;
                }
                this.f553h.setImageDrawable(drawableC);
                this.f553h.setVisibility(0);
            } else {
                ImageView imageView2 = this.f553h;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f553h.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceD);
            if (z) {
                if (this.f552g == null) {
                    z zVar = new z(getContext(), null, c.a.a.f2444e);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f552g = zVar;
                }
                this.f552g.setText(charSequenceD);
                this.f552g.setVisibility(0);
            } else {
                TextView textView2 = this.f552g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f552g.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f553h;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            y0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (p0.this.f543k > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = p0.this.f543k;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, c.a.a.f2447h);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f541i;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f541i == null) {
            this.f541i = b();
        }
        removeView(this.f540h);
        addView(this.f541i, new ViewGroup.LayoutParams(-2, -1));
        if (this.f541i.getAdapter() == null) {
            this.f541i.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f538f;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f538f = null;
        }
        this.f541i.setSelection(this.n);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f541i);
        addView(this.f540h, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f541i.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f540h.getChildAt(i2);
        Runnable runnable = this.f538f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f538f = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f545m));
        } else {
            dVar.setFocusable(true);
            if (this.f539g == null) {
                this.f539g = new c();
            }
            dVar.setOnClickListener(this.f539g);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f538f;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c.a.o.a aVarB = c.a.o.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f544l = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f538f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f540h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f543k = -1;
        } else {
            if (childCount > 2) {
                this.f543k = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f543k = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f543k = Math.min(this.f543k, this.f544l);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f545m, 1073741824);
        if (!z && this.f542j) {
            this.f540h.measure(0, iMakeMeasureSpec);
            if (this.f540h.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.n);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f542j = z;
    }

    public void setContentHeight(int i2) {
        this.f545m = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.n = i2;
        int childCount = this.f540h.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f540h.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f541i;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}