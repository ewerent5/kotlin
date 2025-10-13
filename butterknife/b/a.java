package butterknife.b;

import android.util.TypedValue;
import android.view.View;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class a {
    private static final TypedValue a = new TypedValue();

    public static <T> T a(View view, int i2, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e2) {
            throw new IllegalStateException("View '" + d(view, i2) + "' with ID " + i2 + " for " + str + " was of the wrong type. See cause for more info.", e2);
        }
    }

    public static View b(View view, int i2, String str) {
        View viewFindViewById = view.findViewById(i2);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("Required view '" + d(view, i2) + "' with ID " + i2 + " for " + str + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    public static <T> T c(View view, int i2, String str, Class<T> cls) {
        return (T) a(b(view, i2, str), i2, str, cls);
    }

    private static String d(View view, int i2) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i2);
    }
}