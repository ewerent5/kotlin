package e.c.b.c.m;

import android.util.Property;
import android.view.ViewGroup;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes.dex */
public class d extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(e.c.b.c.f.B);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f2) {
        float fFloatValue = f2.floatValue();
        viewGroup.setTag(e.c.b.c.f.B, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setAlpha(fFloatValue);
        }
    }
}