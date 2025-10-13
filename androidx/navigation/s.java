package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.r;
import java.util.HashMap;
import java.util.Map;

/* compiled from: NavigatorProvider.java */
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class s {
    private static final HashMap<Class<?>, String> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, r<? extends j>> f1365b = new HashMap<>();

    static String c(Class<? extends r> cls) {
        HashMap<Class<?>, String> map = a;
        String strValue = map.get(cls);
        if (strValue == null) {
            r.b bVar = (r.b) cls.getAnnotation(r.b.class);
            strValue = bVar != null ? bVar.value() : null;
            if (!g(strValue)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            map.put(cls, strValue);
        }
        return strValue;
    }

    private static boolean g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final r<? extends j> a(r<? extends j> rVar) {
        return b(c(rVar.getClass()), rVar);
    }

    public r<? extends j> b(String str, r<? extends j> rVar) {
        if (g(str)) {
            return this.f1365b.put(str, rVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends r<?>> T d(Class<T> cls) {
        return (T) e(c(cls));
    }

    public <T extends r<?>> T e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        r<? extends j> rVar = this.f1365b.get(str);
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    Map<String, r<? extends j>> f() {
        return this.f1365b;
    }
}