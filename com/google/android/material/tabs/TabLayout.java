package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.y0;
import androidx.viewpager.widget.ViewPager;
import c.h.l.c0.c;
import c.h.l.r;
import c.h.l.t;
import ch.qos.logback.classic.Level;
import e.c.b.c.j;
import e.c.b.c.k;
import e.c.b.c.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: e, reason: collision with root package name */
    private static final int f11762e = k.f15246h;

    /* renamed from: f, reason: collision with root package name */
    private static final c.h.k.e<Tab> f11763f = new c.h.k.g(16);
    private final int A;
    private int B;
    int C;
    int D;
    int E;
    int F;
    boolean G;
    boolean H;
    int I;
    boolean J;
    private com.google.android.material.tabs.b K;
    private c L;
    private final ArrayList<c> M;
    private c N;
    private ValueAnimator O;
    ViewPager P;
    private androidx.viewpager.widget.a Q;
    private DataSetObserver R;
    private g S;
    private b T;
    private boolean U;
    private final c.h.k.e<h> V;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<Tab> f11764g;

    /* renamed from: h, reason: collision with root package name */
    private Tab f11765h;

    /* renamed from: i, reason: collision with root package name */
    final f f11766i;

    /* renamed from: j, reason: collision with root package name */
    int f11767j;

    /* renamed from: k, reason: collision with root package name */
    int f11768k;

    /* renamed from: l, reason: collision with root package name */
    int f11769l;

    /* renamed from: m, reason: collision with root package name */
    int f11770m;
    int n;
    ColorStateList o;
    ColorStateList p;
    ColorStateList q;
    Drawable r;
    private int s;
    PorterDuff.Mode t;
    float u;
    float v;
    final int w;
    int x;
    private final int y;
    private final int z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {
        private boolean a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.G(aVar2, this.a);
            }
        }

        void b(boolean z) {
            this.a = z;
        }
    }

    @Deprecated
    public interface c<T extends Tab> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<Tab> {
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.z();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.z();
        }
    }

    class f extends LinearLayout {

        /* renamed from: e, reason: collision with root package name */
        ValueAnimator f11772e;

        /* renamed from: f, reason: collision with root package name */
        int f11773f;

        /* renamed from: g, reason: collision with root package name */
        float f11774g;

        /* renamed from: h, reason: collision with root package name */
        private int f11775h;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ View a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f11777b;

            a(View view, View view2) {
                this.a = view;
                this.f11777b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.g(this.a, this.f11777b, valueAnimator.getAnimatedFraction());
            }
        }

        class b extends AnimatorListenerAdapter {
            final /* synthetic */ int a;

            b(int i2) {
                this.a = i2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f11773f = this.a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f11773f = this.a;
            }
        }

        f(Context context) {
            super(context);
            this.f11773f = -1;
            this.f11775h = -1;
            setWillNotDraw(false);
        }

        private void d() {
            View childAt = getChildAt(this.f11773f);
            com.google.android.material.tabs.b bVar = TabLayout.this.K;
            TabLayout tabLayout = TabLayout.this;
            bVar.d(tabLayout, childAt, tabLayout.r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(View view, View view2, float f2) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.b bVar = TabLayout.this.K;
                TabLayout tabLayout = TabLayout.this;
                bVar.c(tabLayout, view, view2, f2, tabLayout.r);
            } else {
                Drawable drawable = TabLayout.this.r;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.r.getBounds().bottom);
            }
            t.b0(this);
        }

        private void h(boolean z, int i2, int i3) {
            View childAt = getChildAt(this.f11773f);
            View childAt2 = getChildAt(i2);
            if (childAt2 == null) {
                d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.f11772e.removeAllUpdateListeners();
                this.f11772e.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11772e = valueAnimator;
            valueAnimator.setInterpolator(e.c.b.c.m.a.f15264b);
            valueAnimator.setDuration(i3);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i2));
            valueAnimator.start();
        }

        void b(int i2, int i3) {
            ValueAnimator valueAnimator = this.f11772e;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11772e.cancel();
            }
            h(true, i2, i3);
        }

        boolean c() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int iHeight = TabLayout.this.r.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.r.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.E;
            int height = 0;
            if (i2 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i2 == 1) {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            } else if (i2 != 2) {
                iHeight = i2 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.r.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.r.getBounds();
                TabLayout.this.r.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableR = tabLayout.r;
                if (tabLayout.s != 0) {
                    drawableR = androidx.core.graphics.drawable.a.r(drawableR);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawableR.setColorFilter(TabLayout.this.s, PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.n(drawableR, TabLayout.this.s);
                    }
                }
                drawableR.draw(canvas);
            }
            super.draw(canvas);
        }

        void e(int i2, float f2) {
            ValueAnimator valueAnimator = this.f11772e;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11772e.cancel();
            }
            this.f11773f = i2;
            this.f11774g = f2;
            g(getChildAt(i2), getChildAt(this.f11773f + 1), this.f11774g);
        }

        void f(int i2) {
            Rect bounds = TabLayout.this.r.getBounds();
            TabLayout.this.r.setBounds(bounds.left, 0, bounds.right, i2);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f11772e;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                d();
            } else {
                h(false, this.f11773f, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.k.b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.C = 0;
                    tabLayout2.N(false);
                }
                if (z) {
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT >= 23 || this.f11775h == i2) {
                return;
            }
            requestLayout();
            this.f11775h = i2;
        }
    }

    public static class g implements ViewPager.j {
        private final WeakReference<TabLayout> a;

        /* renamed from: b, reason: collision with root package name */
        private int f11780b;

        /* renamed from: c, reason: collision with root package name */
        private int f11781c;

        public g(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i2, float f2, int i3) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i4 = this.f11781c;
                tabLayout.I(i2, f2, i4 != 2 || this.f11780b == 1, (i4 == 2 && this.f11780b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i2) {
            this.f11780b = this.f11781c;
            this.f11781c = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f11781c;
            tabLayout.F(tabLayout.w(i2), i3 == 0 || (i3 == 2 && this.f11780b == 0));
        }

        void d() {
            this.f11781c = 0;
            this.f11780b = 0;
        }
    }

    public final class h extends LinearLayout {

        /* renamed from: e, reason: collision with root package name */
        private Tab f11782e;

        /* renamed from: f, reason: collision with root package name */
        private TextView f11783f;

        /* renamed from: g, reason: collision with root package name */
        private ImageView f11784g;

        /* renamed from: h, reason: collision with root package name */
        private View f11785h;

        /* renamed from: i, reason: collision with root package name */
        private e.c.b.c.n.a f11786i;

        /* renamed from: j, reason: collision with root package name */
        private View f11787j;

        /* renamed from: k, reason: collision with root package name */
        private TextView f11788k;

        /* renamed from: l, reason: collision with root package name */
        private ImageView f11789l;

        /* renamed from: m, reason: collision with root package name */
        private Drawable f11790m;
        private int n;

        class a implements View.OnLayoutChangeListener {
            final /* synthetic */ View a;

            a(View view) {
                this.a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (this.a.getVisibility() == 0) {
                    h.this.w(this.a);
                }
            }
        }

        public h(Context context) {
            super(context);
            this.n = 2;
            y(context);
            t.x0(this, TabLayout.this.f11767j, TabLayout.this.f11768k, TabLayout.this.f11769l, TabLayout.this.f11770m);
            setGravity(17);
            setOrientation(!TabLayout.this.G ? 1 : 0);
            setClickable(true);
            t.y0(this, r.b(getContext(), 1002));
        }

        private void A(TextView textView, ImageView imageView) {
            Tab tab = this.f11782e;
            Drawable drawableMutate = (tab == null || tab.getIcon() == null) ? null : androidx.core.graphics.drawable.a.r(this.f11782e.getIcon()).mutate();
            Tab tab2 = this.f11782e;
            CharSequence text = tab2 != null ? tab2.getText() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(text);
            if (textView != null) {
                if (z) {
                    textView.setText(text);
                    if (this.f11782e.labelVisibilityMode == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB = (z && imageView.getVisibility() == 0) ? (int) com.google.android.material.internal.k.b(getContext(), 8) : 0;
                if (TabLayout.this.G) {
                    if (iB != c.h.l.g.a(marginLayoutParams)) {
                        c.h.l.g.c(marginLayoutParams, iB);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB;
                    c.h.l.g.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f11782e;
            CharSequence charSequence = tab3 != null ? tab3.contentDesc : null;
            if (!z) {
                text = charSequence;
            }
            y0.a(this, text);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e.c.b.c.n.a getBadge() {
            return this.f11786i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e.c.b.c.n.a getOrCreateBadge() {
            if (this.f11786i == null) {
                this.f11786i = e.c.b.c.n.a.c(getContext());
            }
            v();
            e.c.b.c.n.a aVar = this.f11786i;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void i(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        private void k(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(Canvas canvas) {
            Drawable drawable = this.f11790m;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f11790m.draw(canvas);
            }
        }

        private FrameLayout n(View view) {
            if ((view == this.f11784g || view == this.f11783f) && e.c.b.c.n.b.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o() {
            return this.f11786i != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void p() {
            FrameLayout frameLayoutL;
            if (e.c.b.c.n.b.a) {
                frameLayoutL = l();
                addView(frameLayoutL, 0);
            } else {
                frameLayoutL = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(e.c.b.c.h.f15217c, (ViewGroup) frameLayoutL, false);
            this.f11784g = imageView;
            frameLayoutL.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void q() {
            FrameLayout frameLayoutL;
            if (e.c.b.c.n.b.a) {
                frameLayoutL = l();
                addView(frameLayoutL);
            } else {
                frameLayoutL = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(e.c.b.c.h.f15218d, (ViewGroup) frameLayoutL, false);
            this.f11783f = textView;
            frameLayoutL.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (this.f11785h != null) {
                u();
            }
            this.f11786i = null;
        }

        private void t(View view) {
            if (o() && view != null) {
                k(false);
                e.c.b.c.n.b.a(this.f11786i, view, n(view));
                this.f11785h = view;
            }
        }

        private void u() {
            if (o()) {
                k(true);
                View view = this.f11785h;
                if (view != null) {
                    e.c.b.c.n.b.b(this.f11786i, view);
                    this.f11785h = null;
                }
            }
        }

        private void v() {
            Tab tab;
            Tab tab2;
            if (o()) {
                if (this.f11787j != null) {
                    u();
                    return;
                }
                if (this.f11784g != null && (tab2 = this.f11782e) != null && tab2.getIcon() != null) {
                    View view = this.f11785h;
                    ImageView imageView = this.f11784g;
                    if (view == imageView) {
                        w(imageView);
                        return;
                    } else {
                        u();
                        t(this.f11784g);
                        return;
                    }
                }
                if (this.f11783f == null || (tab = this.f11782e) == null || tab.getTabLabelVisibility() != 1) {
                    u();
                    return;
                }
                View view2 = this.f11785h;
                TextView textView = this.f11783f;
                if (view2 == textView) {
                    w(textView);
                } else {
                    u();
                    t(this.f11783f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(View view) {
            if (o() && view == this.f11785h) {
                e.c.b.c.n.b.c(this.f11786i, view, n(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        public void y(Context context) {
            int i2 = TabLayout.this.w;
            if (i2 != 0) {
                Drawable drawableD = c.a.k.a.a.d(context, i2);
                this.f11790m = drawableD;
                if (drawableD != null && drawableD.isStateful()) {
                    this.f11790m.setState(getDrawableState());
                }
            } else {
                this.f11790m = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.q != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = e.c.b.c.a0.b.a(TabLayout.this.q);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.J;
                    if (z) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable2);
                } else {
                    Drawable drawableR = androidx.core.graphics.drawable.a.r(gradientDrawable2);
                    androidx.core.graphics.drawable.a.o(drawableR, colorStateListA);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableR});
                }
            }
            t.n0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f11790m;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f11790m.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f11783f, this.f11784g, this.f11787j};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f11783f, this.f11784g, this.f11787j};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public Tab getTab() {
            return this.f11782e;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            e.c.b.c.n.a aVar = this.f11786i;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f11786i.g()));
            }
            c.h.l.c0.c cVarY0 = c.h.l.c0.c.y0(accessibilityNodeInfo);
            cVarY0.b0(c.C0058c.f(0, 1, this.f11782e.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                cVarY0.Z(false);
                cVarY0.Q(c.a.f3134e);
            }
            cVarY0.p0(getResources().getString(j.f15234h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.x, Level.ALL_INT);
            }
            super.onMeasure(i2, i3);
            if (this.f11783f != null) {
                float f2 = TabLayout.this.u;
                int i4 = this.n;
                ImageView imageView = this.f11784g;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f11783f;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.v;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f11783f.getTextSize();
                int lineCount = this.f11783f.getLineCount();
                int iD = androidx.core.widget.i.d(this.f11783f);
                if (f2 != textSize || (iD >= 0 && i4 != iD)) {
                    if (TabLayout.this.F == 1 && f2 > textSize && lineCount == 1 && ((layout = this.f11783f.getLayout()) == null || j(layout, 0, f2) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f11783f.setTextSize(0, f2);
                        this.f11783f.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f11782e == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f11782e.select();
            return true;
        }

        void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f11783f;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f11784g;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f11787j;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(Tab tab) {
            if (tab != this.f11782e) {
                this.f11782e = tab;
                x();
            }
        }

        final void x() {
            Tab tab = this.f11782e;
            Drawable drawableMutate = null;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.f11787j = customView;
                TextView textView = this.f11783f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f11784g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f11784g.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(R.id.text1);
                this.f11788k = textView2;
                if (textView2 != null) {
                    this.n = androidx.core.widget.i.d(textView2);
                }
                this.f11789l = (ImageView) customView.findViewById(R.id.icon);
            } else {
                View view = this.f11787j;
                if (view != null) {
                    removeView(view);
                    this.f11787j = null;
                }
                this.f11788k = null;
                this.f11789l = null;
            }
            if (this.f11787j == null) {
                if (this.f11784g == null) {
                    p();
                }
                if (tab != null && tab.getIcon() != null) {
                    drawableMutate = androidx.core.graphics.drawable.a.r(tab.getIcon()).mutate();
                }
                if (drawableMutate != null) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, TabLayout.this.p);
                    PorterDuff.Mode mode = TabLayout.this.t;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.p(drawableMutate, mode);
                    }
                }
                if (this.f11783f == null) {
                    q();
                    this.n = androidx.core.widget.i.d(this.f11783f);
                }
                androidx.core.widget.i.q(this.f11783f, TabLayout.this.n);
                ColorStateList colorStateList = TabLayout.this.o;
                if (colorStateList != null) {
                    this.f11783f.setTextColor(colorStateList);
                }
                A(this.f11783f, this.f11784g);
                v();
                i(this.f11784g);
                i(this.f11783f);
            } else {
                TextView textView3 = this.f11788k;
                if (textView3 != null || this.f11789l != null) {
                    A(textView3, this.f11789l);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.contentDesc)) {
                setContentDescription(tab.contentDesc);
            }
            setSelected(tab != null && tab.isSelected());
        }

        final void z() {
            setOrientation(!TabLayout.this.G ? 1 : 0);
            TextView textView = this.f11788k;
            if (textView == null && this.f11789l == null) {
                A(this.f11783f, this.f11784g);
            } else {
                A(textView, this.f11789l);
            }
        }
    }

    public static class i implements d {
        private final ViewPager a;

        public i(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(Tab tab) {
            this.a.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(Tab tab) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.G);
    }

    private void D(int i2) {
        h hVar = (h) this.f11766i.getChildAt(i2);
        this.f11766i.removeViewAt(i2);
        if (hVar != null) {
            hVar.s();
            this.V.a(hVar);
        }
        requestLayout();
    }

    private void K(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            g gVar = this.S;
            if (gVar != null) {
                viewPager2.J(gVar);
            }
            b bVar = this.T;
            if (bVar != null) {
                this.P.I(bVar);
            }
        }
        c cVar = this.N;
        if (cVar != null) {
            C(cVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new g(this);
            }
            this.S.d();
            viewPager.c(this.S);
            i iVar = new i(viewPager);
            this.N = iVar;
            c(iVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                G(adapter, z);
            }
            if (this.T == null) {
                this.T = new b();
            }
            this.T.b(z);
            viewPager.b(this.T);
            H(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            G(null, false);
        }
        this.U = z2;
    }

    private void L() {
        int size = this.f11764g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f11764g.get(i2).updateView();
        }
    }

    private void M(LinearLayout.LayoutParams layoutParams) {
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private void g(com.google.android.material.tabs.c cVar) {
        Tab tabY = y();
        CharSequence charSequence = cVar.f11792e;
        if (charSequence != null) {
            tabY.setText(charSequence);
        }
        Drawable drawable = cVar.f11793f;
        if (drawable != null) {
            tabY.setIcon(drawable);
        }
        int i2 = cVar.f11794g;
        if (i2 != 0) {
            tabY.setCustomView(i2);
        }
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            tabY.setContentDescription(cVar.getContentDescription());
        }
        d(tabY);
    }

    private int getDefaultHeight() {
        int size = this.f11764g.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Tab tab = this.f11764g.get(i2);
                if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z || this.G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.y;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.F;
        if (i3 == 0 || i3 == 2) {
            return this.A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f11766i.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(Tab tab) {
        h hVar = tab.view;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.f11766i.addView(hVar, tab.getPosition(), p());
    }

    private void i(View view) {
        if (!(view instanceof com.google.android.material.tabs.c)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        g((com.google.android.material.tabs.c) view);
    }

    private void j(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !t.Q(this) || this.f11766i.c()) {
            H(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM = m(i2, 0.0f);
        if (scrollX != iM) {
            v();
            this.O.setIntValues(scrollX, iM);
            this.O.start();
        }
        this.f11766i.b(i2, this.D);
    }

    private void k(int i2) {
        if (i2 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i2 == 1) {
            this.f11766i.setGravity(1);
            return;
        } else if (i2 != 2) {
            return;
        }
        this.f11766i.setGravity(8388611);
    }

    private void l() {
        int i2 = this.F;
        t.x0(this.f11766i, (i2 == 0 || i2 == 2) ? Math.max(0, this.B - this.f11767j) : 0, 0, 0, 0);
        int i3 = this.F;
        if (i3 == 0) {
            k(this.C);
        } else if (i3 == 1 || i3 == 2) {
            if (this.C == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f11766i.setGravity(1);
        }
        N(true);
    }

    private int m(int i2, float f2) {
        int i3 = this.F;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.f11766i.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < this.f11766i.getChildCount() ? this.f11766i.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return t.B(this) == 0 ? left + i5 : left - i5;
    }

    private void n(Tab tab, int i2) {
        tab.setPosition(i2);
        this.f11764g.add(i2, tab);
        int size = this.f11764g.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.f11764g.get(i2).setPosition(i2);
            }
        }
    }

    private static ColorStateList o(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private LinearLayout.LayoutParams p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        M(layoutParams);
        return layoutParams;
    }

    private h r(Tab tab) {
        c.h.k.e<h> eVar = this.V;
        h hVarB = eVar != null ? eVar.b() : null;
        if (hVarB == null) {
            hVarB = new h(getContext());
        }
        hVarB.setTab(tab);
        hVarB.setFocusable(true);
        hVarB.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.contentDesc)) {
            hVarB.setContentDescription(tab.text);
        } else {
            hVarB.setContentDescription(tab.contentDesc);
        }
        return hVarB;
    }

    private void s(Tab tab) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).a(tab);
        }
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f11766i.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f11766i.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    private void t(Tab tab) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).b(tab);
        }
    }

    private void u(Tab tab) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).c(tab);
        }
    }

    private void v() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(e.c.b.c.m.a.f15264b);
            this.O.setDuration(this.D);
            this.O.addUpdateListener(new a());
        }
    }

    protected boolean A(Tab tab) {
        return f11763f.a(tab);
    }

    public void B() {
        for (int childCount = this.f11766i.getChildCount() - 1; childCount >= 0; childCount--) {
            D(childCount);
        }
        Iterator<Tab> it = this.f11764g.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            A(next);
        }
        this.f11765h = null;
    }

    @Deprecated
    public void C(c cVar) {
        this.M.remove(cVar);
    }

    public void E(Tab tab) {
        F(tab, true);
    }

    public void F(Tab tab, boolean z) {
        Tab tab2 = this.f11765h;
        if (tab2 == tab) {
            if (tab2 != null) {
                s(tab);
                j(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                H(position, 0.0f, true);
            } else {
                j(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f11765h = tab;
        if (tab2 != null) {
            u(tab2);
        }
        if (tab != null) {
            t(tab);
        }
    }

    void G(androidx.viewpager.widget.a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.Q;
        if (aVar2 != null && (dataSetObserver = this.R) != null) {
            aVar2.p(dataSetObserver);
        }
        this.Q = aVar;
        if (z && aVar != null) {
            if (this.R == null) {
                this.R = new e();
            }
            aVar.j(this.R);
        }
        z();
    }

    public void H(int i2, float f2, boolean z) {
        I(i2, f2, z, true);
    }

    public void I(int i2, float f2, boolean z, boolean z2) {
        int iRound = Math.round(i2 + f2);
        if (iRound < 0 || iRound >= this.f11766i.getChildCount()) {
            return;
        }
        if (z2) {
            this.f11766i.e(i2, f2);
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        scrollTo(m(i2, f2), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    public void J(ViewPager viewPager, boolean z) {
        K(viewPager, z, false);
    }

    void N(boolean z) {
        for (int i2 = 0; i2 < this.f11766i.getChildCount(); i2++) {
            View childAt = this.f11766i.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            M((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        i(view);
    }

    @Deprecated
    public void c(c cVar) {
        if (this.M.contains(cVar)) {
            return;
        }
        this.M.add(cVar);
    }

    public void d(Tab tab) {
        f(tab, this.f11764g.isEmpty());
    }

    public void e(Tab tab, int i2, boolean z) {
        if (tab.parent != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        n(tab, i2);
        h(tab);
        if (z) {
            tab.select();
        }
    }

    public void f(Tab tab, boolean z) {
        e(tab, this.f11764g.size(), z);
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f11765h;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f11764g.size();
    }

    public int getTabGravity() {
        return this.C;
    }

    public ColorStateList getTabIconTint() {
        return this.p;
    }

    public int getTabIndicatorAnimationMode() {
        return this.I;
    }

    public int getTabIndicatorGravity() {
        return this.E;
    }

    int getTabMaxWidth() {
        return this.x;
    }

    public int getTabMode() {
        return this.F;
    }

    public ColorStateList getTabRippleColor() {
        return this.q;
    }

    public Drawable getTabSelectedIndicator() {
        return this.r;
    }

    public ColorStateList getTabTextColors() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.c.b.c.c0.h.e(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                K((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.f11766i.getChildCount(); i2++) {
            View childAt = this.f11766i.getChildAt(i2);
            if (childAt instanceof h) {
                ((h) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.h.l.c0.c.y0(accessibilityNodeInfo).a0(c.b.a(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.k.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.z
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.k.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.x = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.F
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    protected Tab q() {
        Tab tabB = f11763f.b();
        return tabB == null ? new Tab() : tabB;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e.c.b.c.c0.h.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.G != z) {
            this.G = z;
            for (int i2 = 0; i2 < this.f11766i.getChildCount(); i2++) {
                View childAt = this.f11766i.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).z();
                }
            }
            l();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        v();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.r != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.r = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.s = i2;
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.E != i2) {
            this.E = i2;
            t.b0(this.f11766i);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f11766i.f(i2);
    }

    public void setTabGravity(int i2) {
        if (this.C != i2) {
            this.C = i2;
            l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            L();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(c.a.k.a.a.c(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.I = i2;
        if (i2 == 0) {
            this.K = new com.google.android.material.tabs.b();
        } else {
            if (i2 == 1) {
                this.K = new com.google.android.material.tabs.a();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.H = z;
        t.b0(this.f11766i);
    }

    public void setTabMode(int i2) {
        if (i2 != this.F) {
            this.F = i2;
            l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            for (int i2 = 0; i2 < this.f11766i.getChildCount(); i2++) {
                View childAt = this.f11766i.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(c.a.k.a.a.c(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            L();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        G(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.J != z) {
            this.J = z;
            for (int i2 = 0; i2 < this.f11766i.getChildCount(); i2++) {
                View childAt = this.f11766i.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        J(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public Tab w(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f11764g.get(i2);
    }

    public boolean x() {
        return this.H;
    }

    public Tab y() {
        Tab tabQ = q();
        tabQ.parent = this;
        tabQ.view = r(tabQ);
        if (tabQ.id != -1) {
            tabQ.view.setId(tabQ.id);
        }
        return tabQ;
    }

    void z() {
        int currentItem;
        B();
        androidx.viewpager.widget.a aVar = this.Q;
        if (aVar != null) {
            int iC = aVar.c();
            for (int i2 = 0; i2 < iC; i2++) {
                f(y().setText(this.Q.e(i2)), false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            E(w(currentItem));
        }
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private CharSequence contentDesc;
        private View customView;
        private Drawable icon;
        public TabLayout parent;
        private Object tag;
        private CharSequence text;
        public h view;
        private int position = -1;
        private int labelVisibilityMode = 1;
        private int id = -1;

        public e.c.b.c.n.a getBadge() {
            return this.view.getBadge();
        }

        public CharSequence getContentDescription() {
            h hVar = this.view;
            if (hVar == null) {
                return null;
            }
            return hVar.getContentDescription();
        }

        public View getCustomView() {
            return this.customView;
        }

        public Drawable getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.id;
        }

        public e.c.b.c.n.a getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.position;
        }

        public int getTabLabelVisibility() {
            return this.labelVisibilityMode;
        }

        public Object getTag() {
            return this.tag;
        }

        public CharSequence getText() {
            return this.text;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.position;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.r();
        }

        void reset() {
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.id = -1;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.E(this);
        }

        public Tab setContentDescription(int i2) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public Tab setCustomView(View view) {
            this.customView = view;
            updateView();
            return this;
        }

        public Tab setIcon(Drawable drawable) {
            this.icon = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                tabLayout.N(true);
            }
            updateView();
            if (e.c.b.c.n.b.a && this.view.o() && this.view.f11786i.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        public Tab setId(int i2) {
            this.id = i2;
            h hVar = this.view;
            if (hVar != null) {
                hVar.setId(i2);
            }
            return this;
        }

        void setPosition(int i2) {
            this.position = i2;
        }

        public Tab setTabLabelVisibility(int i2) {
            this.labelVisibilityMode = i2;
            TabLayout tabLayout = this.parent;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                tabLayout.N(true);
            }
            updateView();
            if (e.c.b.c.n.b.a && this.view.o() && this.view.f11786i.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        public Tab setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Tab setText(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.text = charSequence;
            updateView();
            return this;
        }

        void updateView() {
            h hVar = this.view;
            if (hVar != null) {
                hVar.x();
            }
        }

        public Tab setCustomView(int i2) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i2, (ViewGroup) this.view, false));
        }

        public Tab setContentDescription(CharSequence charSequence) {
            this.contentDesc = charSequence;
            updateView();
            return this;
        }

        public Tab setText(int i2) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public Tab setIcon(int i2) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(c.a.k.a.a.d(tabLayout.getContext(), i2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int i3 = f11762e;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f11764g = new ArrayList<>();
        this.r = new GradientDrawable();
        this.s = 0;
        this.x = Integer.MAX_VALUE;
        this.M = new ArrayList<>();
        this.V = new c.h.k.f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f11766i = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = l.l4;
        int i4 = l.J4;
        TypedArray typedArrayH = com.google.android.material.internal.j.h(context2, attributeSet, iArr, i2, i3, i4);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            e.c.b.c.c0.g gVar = new e.c.b.c.c0.g();
            gVar.X(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.M(context2);
            gVar.W(t.w(this));
            t.n0(this, gVar);
        }
        setSelectedTabIndicator(e.c.b.c.z.c.d(context2, typedArrayH, l.r4));
        setSelectedTabIndicatorColor(typedArrayH.getColor(l.u4, 0));
        fVar.f(typedArrayH.getDimensionPixelSize(l.x4, -1));
        setSelectedTabIndicatorGravity(typedArrayH.getInt(l.w4, 0));
        setTabIndicatorFullWidth(typedArrayH.getBoolean(l.v4, true));
        setTabIndicatorAnimationMode(typedArrayH.getInt(l.t4, 0));
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(l.C4, 0);
        this.f11770m = dimensionPixelSize;
        this.f11769l = dimensionPixelSize;
        this.f11768k = dimensionPixelSize;
        this.f11767j = dimensionPixelSize;
        this.f11767j = typedArrayH.getDimensionPixelSize(l.F4, dimensionPixelSize);
        this.f11768k = typedArrayH.getDimensionPixelSize(l.G4, this.f11768k);
        this.f11769l = typedArrayH.getDimensionPixelSize(l.E4, this.f11769l);
        this.f11770m = typedArrayH.getDimensionPixelSize(l.D4, this.f11770m);
        int resourceId = typedArrayH.getResourceId(i4, k.f15240b);
        this.n = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, c.a.j.X2);
        try {
            this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.a.j.Y2, 0);
            this.o = e.c.b.c.z.c.a(context2, typedArrayObtainStyledAttributes, c.a.j.b3);
            typedArrayObtainStyledAttributes.recycle();
            int i5 = l.K4;
            if (typedArrayH.hasValue(i5)) {
                this.o = e.c.b.c.z.c.a(context2, typedArrayH, i5);
            }
            int i6 = l.I4;
            if (typedArrayH.hasValue(i6)) {
                this.o = o(this.o.getDefaultColor(), typedArrayH.getColor(i6, 0));
            }
            this.p = e.c.b.c.z.c.a(context2, typedArrayH, l.p4);
            this.t = com.google.android.material.internal.k.e(typedArrayH.getInt(l.q4, -1), null);
            this.q = e.c.b.c.z.c.a(context2, typedArrayH, l.H4);
            this.D = typedArrayH.getInt(l.s4, 300);
            this.y = typedArrayH.getDimensionPixelSize(l.A4, -1);
            this.z = typedArrayH.getDimensionPixelSize(l.z4, -1);
            this.w = typedArrayH.getResourceId(l.m4, 0);
            this.B = typedArrayH.getDimensionPixelSize(l.n4, 0);
            this.F = typedArrayH.getInt(l.B4, 1);
            this.C = typedArrayH.getInt(l.o4, 0);
            this.G = typedArrayH.getBoolean(l.y4, false);
            this.J = typedArrayH.getBoolean(l.L4, false);
            typedArrayH.recycle();
            Resources resources = getResources();
            this.v = resources.getDimensionPixelSize(e.c.b.c.d.f15191i);
            this.A = resources.getDimensionPixelSize(e.c.b.c.d.f15190h);
            l();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            C(cVar2);
        }
        this.L = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(c.a.k.a.a.d(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }
}