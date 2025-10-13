package c.s;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: classes.dex */
class h<T> extends Property<T, Float> {
    private final Property<T, PointF> a;

    /* renamed from: b, reason: collision with root package name */
    private final PathMeasure f3368b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3369c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f3370d;

    /* renamed from: e, reason: collision with root package name */
    private final PointF f3371e;

    /* renamed from: f, reason: collision with root package name */
    private float f3372f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f3370d = new float[2];
        this.f3371e = new PointF();
        this.a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f3368b = pathMeasure;
        this.f3369c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f3372f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f2) {
        this.f3372f = f2.floatValue();
        this.f3368b.getPosTan(this.f3369c * f2.floatValue(), this.f3370d, null);
        PointF pointF = this.f3371e;
        float[] fArr = this.f3370d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(t, pointF);
    }
}