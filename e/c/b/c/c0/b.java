package e.c.b.c.c0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes.dex */
public final class b implements c {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final float f15099b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f2 += ((b) cVar).f15099b;
        }
        this.a = cVar;
        this.f15099b = f2;
    }

    @Override // e.c.b.c.c0.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f15099b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.f15099b == bVar.f15099b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f15099b)});
    }
}