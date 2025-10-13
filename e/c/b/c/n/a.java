package e.c.b.c.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.h.l.t;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import e.c.b.c.c0.g;
import e.c.b.c.d;
import e.c.b.c.f;
import e.c.b.c.i;
import e.c.b.c.k;
import e.c.b.c.l;
import e.c.b.c.z.c;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements h.b {

    /* renamed from: e, reason: collision with root package name */
    private static final int f15278e = k.f15249k;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15279f = e.c.b.c.b.f15071b;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Context> f15280g;

    /* renamed from: h, reason: collision with root package name */
    private final g f15281h;

    /* renamed from: i, reason: collision with root package name */
    private final h f15282i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f15283j;

    /* renamed from: k, reason: collision with root package name */
    private final float f15284k;

    /* renamed from: l, reason: collision with root package name */
    private final float f15285l;

    /* renamed from: m, reason: collision with root package name */
    private final float f15286m;
    private final b n;
    private float o;
    private float p;
    private int q;
    private float r;
    private float s;
    private float t;
    private WeakReference<View> u;
    private WeakReference<FrameLayout> v;

    /* compiled from: BadgeDrawable.java */
    /* renamed from: e.c.b.c.n.a$a, reason: collision with other inner class name */
    class RunnableC0180a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f15287e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FrameLayout f15288f;

        RunnableC0180a(View view, FrameLayout frameLayout) {
            this.f15287e = view;
            this.f15288f = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f15287e, this.f15288f);
        }
    }

    private a(Context context) throws Resources.NotFoundException {
        this.f15280g = new WeakReference<>(context);
        j.c(context);
        Resources resources = context.getResources();
        this.f15283j = new Rect();
        this.f15281h = new g();
        this.f15284k = resources.getDimensionPixelSize(d.z);
        this.f15286m = resources.getDimensionPixelSize(d.y);
        this.f15285l = resources.getDimensionPixelSize(d.B);
        h hVar = new h(this);
        this.f15282i = hVar;
        hVar.e().setTextAlign(Paint.Align.CENTER);
        this.n = new b(context);
        u(k.f15241c);
    }

    private void A() {
        this.q = ((int) Math.pow(10.0d, i() - 1.0d)) - 1;
    }

    private void b(Context context, Rect rect, View view) throws Resources.NotFoundException {
        int i2 = this.n.f15298m;
        if (i2 == 8388691 || i2 == 8388693) {
            this.p = rect.bottom - this.n.p;
        } else {
            this.p = rect.top + this.n.p;
        }
        if (j() <= 9) {
            float f2 = !k() ? this.f15284k : this.f15285l;
            this.r = f2;
            this.t = f2;
            this.s = f2;
        } else {
            float f3 = this.f15285l;
            this.r = f3;
            this.t = f3;
            this.s = (this.f15282i.f(f()) / 2.0f) + this.f15286m;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k() ? d.A : d.x);
        int i3 = this.n.f15298m;
        if (i3 == 8388659 || i3 == 8388691) {
            this.o = t.B(view) == 0 ? (rect.left - this.s) + dimensionPixelSize + this.n.o : ((rect.right + this.s) - dimensionPixelSize) - this.n.o;
        } else {
            this.o = t.B(view) == 0 ? ((rect.right + this.s) - dimensionPixelSize) - this.n.o : (rect.left - this.s) + dimensionPixelSize + this.n.o;
        }
    }

    public static a c(Context context) {
        return d(context, null, f15279f, f15278e);
    }

    private static a d(Context context, AttributeSet attributeSet, int i2, int i3) throws Resources.NotFoundException {
        a aVar = new a(context);
        aVar.l(context, attributeSet, i2, i3);
        return aVar;
    }

    private void e(Canvas canvas) {
        Rect rect = new Rect();
        String strF = f();
        this.f15282i.e().getTextBounds(strF, 0, strF.length(), rect);
        canvas.drawText(strF, this.o, this.p + (rect.height() / 2), this.f15282i.e());
    }

    private String f() {
        if (j() <= this.q) {
            return NumberFormat.getInstance().format(j());
        }
        Context context = this.f15280g.get();
        return context == null ? "" : context.getString(e.c.b.c.j.f15238l, Integer.valueOf(this.q), Marker.ANY_NON_NULL_MARKER);
    }

    private void l(Context context, AttributeSet attributeSet, int i2, int i3) throws Resources.NotFoundException {
        TypedArray typedArrayH = j.h(context, attributeSet, l.u, i2, i3, new int[0]);
        r(typedArrayH.getInt(l.z, 4));
        int i4 = l.A;
        if (typedArrayH.hasValue(i4)) {
            s(typedArrayH.getInt(i4, 0));
        }
        n(m(context, typedArrayH, l.v));
        int i5 = l.x;
        if (typedArrayH.hasValue(i5)) {
            p(m(context, typedArrayH, i5));
        }
        o(typedArrayH.getInt(l.w, 8388661));
        q(typedArrayH.getDimensionPixelOffset(l.y, 0));
        v(typedArrayH.getDimensionPixelOffset(l.B, 0));
        typedArrayH.recycle();
    }

    private static int m(Context context, TypedArray typedArray, int i2) {
        return c.a(context, typedArray, i2).getDefaultColor();
    }

    private void t(e.c.b.c.z.d dVar) throws Resources.NotFoundException {
        Context context;
        if (this.f15282i.d() == dVar || (context = this.f15280g.get()) == null) {
            return;
        }
        this.f15282i.h(dVar, context);
        z();
    }

    private void u(int i2) throws Resources.NotFoundException {
        Context context = this.f15280g.get();
        if (context == null) {
            return;
        }
        t(new e.c.b.c.z.d(context, i2));
    }

    private void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.t) {
            WeakReference<FrameLayout> weakReference = this.v;
            if (weakReference == null || weakReference.get() != viewGroup) {
                x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.t);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.v = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0180a(view, frameLayout));
            }
        }
    }

    private static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void z() throws Resources.NotFoundException {
        Context context = this.f15280g.get();
        WeakReference<View> weakReference = this.u;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f15283j);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.v;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || e.c.b.c.n.b.a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        e.c.b.c.n.b.d(this.f15283j, this.o, this.p, this.s, this.t);
        this.f15281h.U(this.r);
        if (rect.equals(this.f15283j)) {
            return;
        }
        this.f15281h.setBounds(this.f15283j);
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f15281h.draw(canvas);
        if (k()) {
            e(canvas);
        }
    }

    public CharSequence g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!k()) {
            return this.n.f15295j;
        }
        if (this.n.f15296k <= 0 || (context = this.f15280g.get()) == null) {
            return null;
        }
        return j() <= this.q ? context.getResources().getQuantityString(this.n.f15296k, j(), Integer.valueOf(j())) : context.getString(this.n.f15297l, Integer.valueOf(this.q));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n.f15292g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15283j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15283j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public FrameLayout h() {
        WeakReference<FrameLayout> weakReference = this.v;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int i() {
        return this.n.f15294i;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        if (k()) {
            return this.n.f15293h;
        }
        return 0;
    }

    public boolean k() {
        return this.n.f15293h != -1;
    }

    public void n(int i2) {
        this.n.f15290e = i2;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        if (this.f15281h.x() != colorStateListValueOf) {
            this.f15281h.X(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void o(int i2) {
        if (this.n.f15298m != i2) {
            this.n.f15298m = i2;
            WeakReference<View> weakReference = this.u;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.u.get();
            WeakReference<FrameLayout> weakReference2 = this.v;
            y(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i2) {
        this.n.f15291f = i2;
        if (this.f15282i.e().getColor() != i2) {
            this.f15282i.e().setColor(i2);
            invalidateSelf();
        }
    }

    public void q(int i2) throws Resources.NotFoundException {
        this.n.o = i2;
        z();
    }

    public void r(int i2) throws Resources.NotFoundException {
        if (this.n.f15294i != i2) {
            this.n.f15294i = i2;
            A();
            this.f15282i.i(true);
            z();
            invalidateSelf();
        }
    }

    public void s(int i2) throws Resources.NotFoundException {
        int iMax = Math.max(0, i2);
        if (this.n.f15293h != iMax) {
            this.n.f15293h = iMax;
            this.f15282i.i(true);
            z();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.n.f15292g = i2;
        this.f15282i.e().setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void v(int i2) throws Resources.NotFoundException {
        this.n.p = i2;
        z();
    }

    public void y(View view, FrameLayout frameLayout) {
        this.u = new WeakReference<>(view);
        boolean z = e.c.b.c.n.b.a;
        if (z && frameLayout == null) {
            w(view);
        } else {
            this.v = new WeakReference<>(frameLayout);
        }
        if (!z) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    /* compiled from: BadgeDrawable.java */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0181a();

        /* renamed from: e, reason: collision with root package name */
        private int f15290e;

        /* renamed from: f, reason: collision with root package name */
        private int f15291f;

        /* renamed from: g, reason: collision with root package name */
        private int f15292g;

        /* renamed from: h, reason: collision with root package name */
        private int f15293h;

        /* renamed from: i, reason: collision with root package name */
        private int f15294i;

        /* renamed from: j, reason: collision with root package name */
        private CharSequence f15295j;

        /* renamed from: k, reason: collision with root package name */
        private int f15296k;

        /* renamed from: l, reason: collision with root package name */
        private int f15297l;

        /* renamed from: m, reason: collision with root package name */
        private int f15298m;
        private boolean n;
        private int o;
        private int p;

        /* compiled from: BadgeDrawable.java */
        /* renamed from: e.c.b.c.n.a$b$a, reason: collision with other inner class name */
        static class C0181a implements Parcelable.Creator<b> {
            C0181a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Context context) {
            this.f15292g = 255;
            this.f15293h = -1;
            this.f15291f = new e.c.b.c.z.d(context, k.f15241c).a.getDefaultColor();
            this.f15295j = context.getString(e.c.b.c.j.f15235i);
            this.f15296k = i.a;
            this.f15297l = e.c.b.c.j.f15237k;
            this.n = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f15290e);
            parcel.writeInt(this.f15291f);
            parcel.writeInt(this.f15292g);
            parcel.writeInt(this.f15293h);
            parcel.writeInt(this.f15294i);
            parcel.writeString(this.f15295j.toString());
            parcel.writeInt(this.f15296k);
            parcel.writeInt(this.f15298m);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.n ? 1 : 0);
        }

        protected b(Parcel parcel) {
            this.f15292g = 255;
            this.f15293h = -1;
            this.f15290e = parcel.readInt();
            this.f15291f = parcel.readInt();
            this.f15292g = parcel.readInt();
            this.f15293h = parcel.readInt();
            this.f15294i = parcel.readInt();
            this.f15295j = parcel.readString();
            this.f15296k = parcel.readInt();
            this.f15298m = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.n = parcel.readInt() != 0;
        }
    }
}