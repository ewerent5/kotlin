package e.c.b.c.z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.c.f;
import e.c.b.c.l;

/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public class d {
    public final ColorStateList a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f15321b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f15322c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f15323d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15324e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15327h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15328i;

    /* renamed from: j, reason: collision with root package name */
    public final float f15329j;

    /* renamed from: k, reason: collision with root package name */
    public final float f15330k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15331l;

    /* renamed from: m, reason: collision with root package name */
    public final float f15332m;
    public float n;
    private final int o;
    private boolean p = false;
    private Typeface q;

    /* compiled from: TextAppearance.java */
    class a extends f.a {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // androidx.core.content.c.f.a
        public void c(int i2) {
            d.this.p = true;
            this.a.a(i2);
        }

        @Override // androidx.core.content.c.f.a
        public void d(Typeface typeface) {
            d dVar = d.this;
            dVar.q = Typeface.create(typeface, dVar.f15325f);
            d.this.p = true;
            this.a.b(d.this.q, false);
        }
    }

    /* compiled from: TextAppearance.java */
    class b extends f {
        final /* synthetic */ TextPaint a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f15334b;

        b(TextPaint textPaint, f fVar) {
            this.a = textPaint;
            this.f15334b = fVar;
        }

        @Override // e.c.b.c.z.f
        public void a(int i2) {
            this.f15334b.a(i2);
        }

        @Override // e.c.b.c.z.f
        public void b(Typeface typeface, boolean z) {
            d.this.l(this.a, typeface);
            this.f15334b.b(typeface, z);
        }
    }

    public d(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, l.M4);
        this.n = typedArrayObtainStyledAttributes.getDimension(l.N4, 0.0f);
        this.a = c.a(context, typedArrayObtainStyledAttributes, l.Q4);
        this.f15321b = c.a(context, typedArrayObtainStyledAttributes, l.R4);
        this.f15322c = c.a(context, typedArrayObtainStyledAttributes, l.S4);
        this.f15325f = typedArrayObtainStyledAttributes.getInt(l.P4, 0);
        this.f15326g = typedArrayObtainStyledAttributes.getInt(l.O4, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, l.Y4, l.X4);
        this.o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f15324e = typedArrayObtainStyledAttributes.getString(iE);
        this.f15327h = typedArrayObtainStyledAttributes.getBoolean(l.Z4, false);
        this.f15323d = c.a(context, typedArrayObtainStyledAttributes, l.T4);
        this.f15328i = typedArrayObtainStyledAttributes.getFloat(l.U4, 0.0f);
        this.f15329j = typedArrayObtainStyledAttributes.getFloat(l.V4, 0.0f);
        this.f15330k = typedArrayObtainStyledAttributes.getFloat(l.W4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.f15331l = false;
            this.f15332m = 0.0f;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, l.W2);
        int i3 = l.X2;
        this.f15331l = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.f15332m = typedArrayObtainStyledAttributes2.getFloat(i3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.q == null && (str = this.f15324e) != null) {
            this.q = Typeface.create(str, this.f15325f);
        }
        if (this.q == null) {
            int i2 = this.f15326g;
            if (i2 == 1) {
                this.q = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.q = Typeface.SERIF;
            } else if (i2 != 3) {
                this.q = Typeface.DEFAULT;
            } else {
                this.q = Typeface.MONOSPACE;
            }
            this.q = Typeface.create(this.q, this.f15325f);
        }
    }

    private boolean i(Context context) {
        return e.a();
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = androidx.core.content.c.f.b(context, this.o);
                this.q = typefaceB;
                if (typefaceB != null) {
                    this.q = Typeface.create(typefaceB, this.f15325f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f15324e, e2);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i2 = this.o;
        if (i2 == 0) {
            this.p = true;
        }
        if (this.p) {
            fVar.b(this.q, true);
            return;
        }
        try {
            androidx.core.content.c.f.d(context, i2, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f15324e, e2);
            this.p = true;
            fVar.a(-3);
        }
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f15330k;
        float f3 = this.f15328i;
        float f4 = this.f15329j;
        ColorStateList colorStateList2 = this.f15323d;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f15325f;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (Build.VERSION.SDK_INT < 21 || !this.f15331l) {
            return;
        }
        textPaint.setLetterSpacing(this.f15332m);
    }
}