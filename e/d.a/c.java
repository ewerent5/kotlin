package e.d.a;

import android.content.Context;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: FigUtils.java */
/* loaded from: classes.dex */
abstract class c {
    protected static final Pattern a = Pattern.compile("^\\-?\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, Integer> f15582b = a();

    /* compiled from: FigUtils.java */
    private static class a {
        float a;

        /* renamed from: b, reason: collision with root package name */
        int f15583b;

        public a(float f2, int i2) {
            this.a = f2;
            this.f15583b = i2;
        }
    }

    private static Map<String, Integer> a() {
        HashMap map = new HashMap();
        map.put("px", 0);
        map.put("dip", 1);
        map.put("dp", 1);
        map.put("sp", 2);
        map.put("pt", 3);
        map.put("in", 4);
        map.put("mm", 5);
        return Collections.unmodifiableMap(map);
    }

    public static float b(Context context, String str) {
        a aVarC = c(str);
        return TypedValue.applyDimension(aVarC.f15583b, aVarC.a, context.getResources().getDisplayMetrics());
    }

    private static a c(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float fFloatValue = Float.valueOf(matcher.group(1)).floatValue();
        Integer num = f15582b.get(matcher.group(3).toLowerCase());
        if (num != null) {
            return new a(fFloatValue, num.intValue());
        }
        throw new NumberFormatException();
    }
}