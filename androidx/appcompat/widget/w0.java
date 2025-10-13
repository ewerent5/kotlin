package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.c.f;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class w0 {
    private final Context a;

    /* renamed from: b */
    private final TypedArray f612b;

    /* renamed from: c */
    private TypedValue f613c;

    private w0(Context context, TypedArray typedArray) {
        this.a = context;
        this.f612b = typedArray;
    }

    public static w0 t(Context context, int i2, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static w0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 v(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.f612b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.f612b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f612b.hasValue(i2) || (resourceId = this.f612b.getResourceId(i2, 0)) == 0 || (colorStateListC = c.a.k.a.a.c(this.a, resourceId)) == null) ? this.f612b.getColorStateList(i2) : colorStateListC;
    }

    public float d(int i2, float f2) {
        return this.f612b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.f612b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.f612b.getDimensionPixelSize(i2, i3);
    }

    public Drawable g(int i2) {
        int resourceId;
        return (!this.f612b.hasValue(i2) || (resourceId = this.f612b.getResourceId(i2, 0)) == 0) ? this.f612b.getDrawable(i2) : c.a.k.a.a.d(this.a, resourceId);
    }

    public Drawable h(int i2) {
        int resourceId;
        if (!this.f612b.hasValue(i2) || (resourceId = this.f612b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.b().d(this.a, resourceId, true);
    }

    public float i(int i2, float f2) {
        return this.f612b.getFloat(i2, f2);
    }

    public Typeface j(int i2, int i3, f.a aVar) {
        int resourceId = this.f612b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f613c == null) {
            this.f613c = new TypedValue();
        }
        return androidx.core.content.c.f.c(this.a, resourceId, this.f613c, i3, aVar);
    }

    public int k(int i2, int i3) {
        return this.f612b.getInt(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f612b.getInteger(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f612b.getLayoutDimension(i2, i3);
    }

    public int n(int i2, int i3) {
        return this.f612b.getResourceId(i2, i3);
    }

    public String o(int i2) {
        return this.f612b.getString(i2);
    }

    public CharSequence p(int i2) {
        return this.f612b.getText(i2);
    }

    public CharSequence[] q(int i2) {
        return this.f612b.getTextArray(i2);
    }

    public TypedArray r() {
        return this.f612b;
    }

    public boolean s(int i2) {
        return this.f612b.hasValue(i2);
    }

    public void w() {
        this.f612b.recycle();
    }
}