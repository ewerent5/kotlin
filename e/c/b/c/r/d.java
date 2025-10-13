package e.c.b.c.r;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> a = new b();

        /* renamed from: b, reason: collision with root package name */
        private final e f15305b = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f15305b.a(e.c.b.c.x.a.c(eVar.a, eVar2.a, f2), e.c.b.c.x.a.c(eVar.f15306b, eVar2.f15306b, f2), e.c.b.c.x.a.c(eVar.f15307c, eVar2.f15307c, f2));
            return this.f15305b;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class c extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: e.c.b.c.r.d$d, reason: collision with other inner class name */
    public static class C0184d extends Property<d, Integer> {
        public static final Property<d, Integer> a = new C0184d("circularRevealScrimColor");

        private C0184d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class e {
        public float a;

        /* renamed from: b, reason: collision with root package name */
        public float f15306b;

        /* renamed from: c, reason: collision with root package name */
        public float f15307c;

        public void a(float f2, float f3, float f4) {
            this.a = f2;
            this.f15306b = f3;
            this.f15307c = f4;
        }

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.f15306b = f3;
            this.f15307c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}