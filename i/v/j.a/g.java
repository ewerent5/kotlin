package i.v.j.a;

import i.y.d.l;
import java.lang.reflect.Field;

/* compiled from: DebugMetadata.kt */
/* loaded from: classes3.dex */
public final class g {
    private static final void a(int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            l.c(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        String strC;
        l.d(aVar, "$this$getStackTraceElementImpl");
        f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        int iC = c(aVar);
        int i2 = iC < 0 ? -1 : fVarB.l()[iC];
        String strB = i.f15871c.b(aVar);
        if (strB == null) {
            strC = fVarB.c();
        } else {
            strC = strB + '/' + fVarB.c();
        }
        return new StackTraceElement(strC, fVarB.m(), fVarB.f(), i2);
    }
}