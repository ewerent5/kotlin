package e.c.b.c.a0;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: RippleUtils.java */
/* loaded from: classes.dex */
public class b {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f15060b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f15061c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f15062d;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f15063e;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f15064f;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f15065g;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f15066h;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f15067i;

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f15068j;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f15069k;

    /* renamed from: l, reason: collision with root package name */
    static final String f15070l;

    static {
        a = Build.VERSION.SDK_INT >= 21;
        f15060b = new int[]{R.attr.state_pressed};
        f15061c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f15062d = new int[]{R.attr.state_focused};
        f15063e = new int[]{R.attr.state_hovered};
        f15064f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f15065g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f15066h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f15067i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f15068j = new int[]{R.attr.state_selected};
        f15069k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f15070l = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (a) {
            return new ColorStateList(new int[][]{f15068j, StateSet.NOTHING}, new int[]{c(colorStateList, f15064f), c(colorStateList, f15060b)});
        }
        int[] iArr = f15064f;
        int[] iArr2 = f15065g;
        int[] iArr3 = f15066h;
        int[] iArr4 = f15067i;
        int[] iArr5 = f15060b;
        int[] iArr6 = f15061c;
        int[] iArr7 = f15062d;
        int[] iArr8 = f15063e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f15068j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i2) {
        return c.h.d.a.d(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f15069k, 0)) != 0) {
            Log.w(f15070l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}