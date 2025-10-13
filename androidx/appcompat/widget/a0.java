package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
class a0 {
    private static final RectF a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f406b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f407c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f408d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f409e = false;

    /* renamed from: f, reason: collision with root package name */
    private float f410f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f411g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f412h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    private int[] f413i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private boolean f414j = false;

    /* renamed from: k, reason: collision with root package name */
    private TextPaint f415k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f416l;

    /* renamed from: m, reason: collision with root package name */
    private final Context f417m;
    private final c n;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.a0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.a0.a, androidx.appcompat.widget.a0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.a0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) a0.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    a0(TextView textView) {
        this.f416l = textView;
        this.f417m = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.n = new b();
        } else if (i2 >= 23) {
            this.n = new a();
        } else {
            this.n = new c();
        }
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f413i = c(iArr);
            B();
        }
    }

    private boolean B() {
        boolean z = this.f413i.length > 0;
        this.f414j = z;
        if (z) {
            this.f408d = 1;
            this.f411g = r0[0];
            this.f412h = r0[r1 - 1];
            this.f410f = -1.0f;
        }
        return z;
    }

    private boolean C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f416l.getText();
        TransformationMethod transformationMethod = this.f416l.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f416l)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f416l.getMaxLines() : -1;
        q(i2);
        StaticLayout staticLayoutE = e(text, (Layout.Alignment) r(this.f416l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutE.getLineCount() <= maxLines && staticLayoutE.getLineEnd(staticLayoutE.getLineCount() - 1) == text.length())) && ((float) staticLayoutE.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f416l instanceof k);
    }

    private void E(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f408d = 1;
        this.f411g = f2;
        this.f412h = f3;
        this.f410f = f4;
        this.f414j = false;
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field fieldO = o(str);
            return fieldO == null ? t : (T) fieldO.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f408d = 0;
        this.f411g = -1.0f;
        this.f412h = -1.0f;
        this.f410f = -1.0f;
        this.f413i = new int[0];
        this.f409e = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f415k, i2);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f416l.getLineSpacingExtra(), this.f416l.getLineSpacingMultiplier()).setIncludePad(this.f416l.getIncludeFontPadding()).setBreakStrategy(this.f416l.getBreakStrategy()).setHyphenationFrequency(this.f416l.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.n.a(builderObtain, this.f416l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f415k, i2, alignment, ((Float) a(this.f416l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f416l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f416l, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f415k, i2, alignment, this.f416l.getLineSpacingMultiplier(), this.f416l.getLineSpacingExtra(), this.f416l.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f413i.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            if (C(this.f413i[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i3;
                i3 = i6;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f413i[i4];
    }

    private static Field o(String str) {
        try {
            Field declaredField = (Field) f407c.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f407c.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method declaredMethod = (Method) f406b.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f406b.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    static <T> T r(Object obj, String str, T t) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private void x(float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f2 != this.f416l.getPaint().getTextSize()) {
            this.f416l.getPaint().setTextSize(f2);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.f416l.isInLayout() : false;
            if (this.f416l.getLayout() != null) {
                this.f409e = false;
                try {
                    Method methodP = p("nullLayouts");
                    if (methodP != null) {
                        methodP.invoke(this.f416l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.f416l.forceLayout();
                } else {
                    this.f416l.requestLayout();
                }
                this.f416l.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f408d == 1) {
            if (!this.f414j || this.f413i.length == 0) {
                int iFloor = ((int) Math.floor((this.f412h - this.f411g) / this.f410f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round(this.f411g + (i2 * this.f410f));
                }
                this.f413i = c(iArr);
            }
            this.f409e = true;
        } else {
            this.f409e = false;
        }
        return this.f409e;
    }

    void b() {
        if (s()) {
            if (this.f409e) {
                if (this.f416l.getMeasuredHeight() <= 0 || this.f416l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.n.b(this.f416l) ? 1048576 : (this.f416l.getMeasuredWidth() - this.f416l.getTotalPaddingLeft()) - this.f416l.getTotalPaddingRight();
                int height = (this.f416l.getHeight() - this.f416l.getCompoundPaddingBottom()) - this.f416l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = a;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fI = i(rectF);
                    if (fI != this.f416l.getTextSize()) {
                        y(0, fI);
                    }
                }
            }
            this.f409e = true;
        }
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? f(charSequence, alignment, i2, i3) : i4 >= 16 ? h(charSequence, alignment, i2) : g(charSequence, alignment, i2);
    }

    int j() {
        return Math.round(this.f412h);
    }

    int k() {
        return Math.round(this.f411g);
    }

    int l() {
        return Math.round(this.f410f);
    }

    int[] m() {
        return this.f413i;
    }

    int n() {
        return this.f408d;
    }

    void q(int i2) {
        TextPaint textPaint = this.f415k;
        if (textPaint == null) {
            this.f415k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f415k.set(this.f416l.getPaint());
        this.f415k.setTextSize(i2);
    }

    boolean s() {
        return D() && this.f408d != 0;
    }

    void t(AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int resourceId;
        Context context = this.f417m;
        int[] iArr = c.a.j.i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f416l;
        c.h.l.t.i0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        int i3 = c.a.j.n0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f408d = typedArrayObtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = c.a.j.m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = c.a.j.k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = c.a.j.j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = c.a.j.l0;
        if (typedArrayObtainStyledAttributes.hasValue(i7) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!D()) {
            this.f408d = 0;
            return;
        }
        if (this.f408d == 1) {
            if (!this.f414j) {
                DisplayMetrics displayMetrics = this.f417m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    void u(int i2, int i3, int i4, int i5) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f417m.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    void v(int[] iArr, int i2) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f417m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f413i = c(iArrCopyOf);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f414j = false;
            }
            if (z()) {
                b();
            }
        }
    }

    void w(int i2) {
        if (D()) {
            if (i2 == 0) {
                d();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f417m.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        }
    }

    void y(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f417m;
        x(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}