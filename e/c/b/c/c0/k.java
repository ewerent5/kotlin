package e.c.b.c.c0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes.dex */
public class k {
    public static final e.c.b.c.c0.c a = new i(0.5f);

    /* renamed from: b, reason: collision with root package name */
    d f15122b;

    /* renamed from: c, reason: collision with root package name */
    d f15123c;

    /* renamed from: d, reason: collision with root package name */
    d f15124d;

    /* renamed from: e, reason: collision with root package name */
    d f15125e;

    /* renamed from: f, reason: collision with root package name */
    e.c.b.c.c0.c f15126f;

    /* renamed from: g, reason: collision with root package name */
    e.c.b.c.c0.c f15127g;

    /* renamed from: h, reason: collision with root package name */
    e.c.b.c.c0.c f15128h;

    /* renamed from: i, reason: collision with root package name */
    e.c.b.c.c0.c f15129i;

    /* renamed from: j, reason: collision with root package name */
    f f15130j;

    /* renamed from: k, reason: collision with root package name */
    f f15131k;

    /* renamed from: l, reason: collision with root package name */
    f f15132l;

    /* renamed from: m, reason: collision with root package name */
    f f15133m;

    /* compiled from: ShapeAppearanceModel.java */
    public interface c {
        e.c.b.c.c0.c a(e.c.b.c.c0.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    private static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new e.c.b.c.c0.a(i4));
    }

    private static b d(Context context, int i2, int i3, e.c.b.c.c0.c cVar) throws Resources.NotFoundException {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, e.c.b.c.l.F3);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.G3, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.J3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.K3, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.I3, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.H3, i4);
            e.c.b.c.c0.c cVarM = m(typedArrayObtainStyledAttributes, e.c.b.c.l.L3, cVar);
            e.c.b.c.c0.c cVarM2 = m(typedArrayObtainStyledAttributes, e.c.b.c.l.O3, cVarM);
            e.c.b.c.c0.c cVarM3 = m(typedArrayObtainStyledAttributes, e.c.b.c.l.P3, cVarM);
            e.c.b.c.c0.c cVarM4 = m(typedArrayObtainStyledAttributes, e.c.b.c.l.N3, cVarM);
            return new b().y(i5, cVarM2).C(i6, cVarM3).u(i7, cVarM4).q(i8, m(typedArrayObtainStyledAttributes, e.c.b.c.l.M3, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new e.c.b.c.c0.a(i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, e.c.b.c.c0.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.c.b.c.l.T2, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.U2, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.V2, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static e.c.b.c.c0.c m(TypedArray typedArray, int i2, e.c.b.c.c0.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i3 = typedValuePeekValue.type;
        return i3 == 5 ? new e.c.b.c.c0.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f15132l;
    }

    public d i() {
        return this.f15125e;
    }

    public e.c.b.c.c0.c j() {
        return this.f15129i;
    }

    public d k() {
        return this.f15124d;
    }

    public e.c.b.c.c0.c l() {
        return this.f15128h;
    }

    public f n() {
        return this.f15133m;
    }

    public f o() {
        return this.f15131k;
    }

    public f p() {
        return this.f15130j;
    }

    public d q() {
        return this.f15122b;
    }

    public e.c.b.c.c0.c r() {
        return this.f15126f;
    }

    public d s() {
        return this.f15123c;
    }

    public e.c.b.c.c0.c t() {
        return this.f15127g;
    }

    public boolean u(RectF rectF) {
        boolean z = this.f15133m.getClass().equals(f.class) && this.f15131k.getClass().equals(f.class) && this.f15130j.getClass().equals(f.class) && this.f15132l.getClass().equals(f.class);
        float fA = this.f15126f.a(rectF);
        return z && ((this.f15127g.a(rectF) > fA ? 1 : (this.f15127g.a(rectF) == fA ? 0 : -1)) == 0 && (this.f15129i.a(rectF) > fA ? 1 : (this.f15129i.a(rectF) == fA ? 0 : -1)) == 0 && (this.f15128h.a(rectF) > fA ? 1 : (this.f15128h.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f15123c instanceof j) && (this.f15122b instanceof j) && (this.f15124d instanceof j) && (this.f15125e instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        return v().o(f2).m();
    }

    public k x(e.c.b.c.c0.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f15122b = bVar.a;
        this.f15123c = bVar.f15134b;
        this.f15124d = bVar.f15135c;
        this.f15125e = bVar.f15136d;
        this.f15126f = bVar.f15137e;
        this.f15127g = bVar.f15138f;
        this.f15128h = bVar.f15139g;
        this.f15129i = bVar.f15140h;
        this.f15130j = bVar.f15141i;
        this.f15131k = bVar.f15142j;
        this.f15132l = bVar.f15143k;
        this.f15133m = bVar.f15144l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    public static final class b {
        private d a;

        /* renamed from: b, reason: collision with root package name */
        private d f15134b;

        /* renamed from: c, reason: collision with root package name */
        private d f15135c;

        /* renamed from: d, reason: collision with root package name */
        private d f15136d;

        /* renamed from: e, reason: collision with root package name */
        private e.c.b.c.c0.c f15137e;

        /* renamed from: f, reason: collision with root package name */
        private e.c.b.c.c0.c f15138f;

        /* renamed from: g, reason: collision with root package name */
        private e.c.b.c.c0.c f15139g;

        /* renamed from: h, reason: collision with root package name */
        private e.c.b.c.c0.c f15140h;

        /* renamed from: i, reason: collision with root package name */
        private f f15141i;

        /* renamed from: j, reason: collision with root package name */
        private f f15142j;

        /* renamed from: k, reason: collision with root package name */
        private f f15143k;

        /* renamed from: l, reason: collision with root package name */
        private f f15144l;

        public b() {
            this.a = h.b();
            this.f15134b = h.b();
            this.f15135c = h.b();
            this.f15136d = h.b();
            this.f15137e = new e.c.b.c.c0.a(0.0f);
            this.f15138f = new e.c.b.c.c0.a(0.0f);
            this.f15139g = new e.c.b.c.c0.a(0.0f);
            this.f15140h = new e.c.b.c.c0.a(0.0f);
            this.f15141i = h.c();
            this.f15142j = h.c();
            this.f15143k = h.c();
            this.f15144l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).a;
            }
            return -1.0f;
        }

        public b A(float f2) {
            this.f15137e = new e.c.b.c.c0.a(f2);
            return this;
        }

        public b B(e.c.b.c.c0.c cVar) {
            this.f15137e = cVar;
            return this;
        }

        public b C(int i2, e.c.b.c.c0.c cVar) {
            return D(h.a(i2)).F(cVar);
        }

        public b D(d dVar) {
            this.f15134b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f2) {
            this.f15138f = new e.c.b.c.c0.a(f2);
            return this;
        }

        public b F(e.c.b.c.c0.c cVar) {
            this.f15138f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            return A(f2).E(f2).w(f2).s(f2);
        }

        public b p(e.c.b.c.c0.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i2, e.c.b.c.c0.c cVar) {
            return r(h.a(i2)).t(cVar);
        }

        public b r(d dVar) {
            this.f15136d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f2) {
            this.f15140h = new e.c.b.c.c0.a(f2);
            return this;
        }

        public b t(e.c.b.c.c0.c cVar) {
            this.f15140h = cVar;
            return this;
        }

        public b u(int i2, e.c.b.c.c0.c cVar) {
            return v(h.a(i2)).x(cVar);
        }

        public b v(d dVar) {
            this.f15135c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f2) {
            this.f15139g = new e.c.b.c.c0.a(f2);
            return this;
        }

        public b x(e.c.b.c.c0.c cVar) {
            this.f15139g = cVar;
            return this;
        }

        public b y(int i2, e.c.b.c.c0.c cVar) {
            return z(h.a(i2)).B(cVar);
        }

        public b z(d dVar) {
            this.a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(k kVar) {
            this.a = h.b();
            this.f15134b = h.b();
            this.f15135c = h.b();
            this.f15136d = h.b();
            this.f15137e = new e.c.b.c.c0.a(0.0f);
            this.f15138f = new e.c.b.c.c0.a(0.0f);
            this.f15139g = new e.c.b.c.c0.a(0.0f);
            this.f15140h = new e.c.b.c.c0.a(0.0f);
            this.f15141i = h.c();
            this.f15142j = h.c();
            this.f15143k = h.c();
            this.f15144l = h.c();
            this.a = kVar.f15122b;
            this.f15134b = kVar.f15123c;
            this.f15135c = kVar.f15124d;
            this.f15136d = kVar.f15125e;
            this.f15137e = kVar.f15126f;
            this.f15138f = kVar.f15127g;
            this.f15139g = kVar.f15128h;
            this.f15140h = kVar.f15129i;
            this.f15141i = kVar.f15130j;
            this.f15142j = kVar.f15131k;
            this.f15143k = kVar.f15132l;
            this.f15144l = kVar.f15133m;
        }
    }

    public k() {
        this.f15122b = h.b();
        this.f15123c = h.b();
        this.f15124d = h.b();
        this.f15125e = h.b();
        this.f15126f = new e.c.b.c.c0.a(0.0f);
        this.f15127g = new e.c.b.c.c0.a(0.0f);
        this.f15128h = new e.c.b.c.c0.a(0.0f);
        this.f15129i = new e.c.b.c.c0.a(0.0f);
        this.f15130j = h.c();
        this.f15131k = h.c();
        this.f15132l = h.c();
        this.f15133m = h.c();
    }
}