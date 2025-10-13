package f.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import f.b.b;
import f.c.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DispatchingAndroidInjector.java */
/* loaded from: classes3.dex */
public final class c<T> implements b<T> {
    private final Map<String, h.a.a<b.InterfaceC0194b<?>>> a;

    /* compiled from: DispatchingAndroidInjector.java */
    public static final class a extends RuntimeException {
        a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    c(Map<Class<?>, h.a.a<b.InterfaceC0194b<?>>> map, Map<String, h.a.a<b.InterfaceC0194b<?>>> map2) {
        this.a = d(map, map2);
    }

    private String b(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = t.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (this.a.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t.getClass().getCanonicalName(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <C, V> Map<String, h.a.a<b.InterfaceC0194b<?>>> d(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap linkedHashMapB = f.c.a.b(map.size() + map2.size());
        linkedHashMapB.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            linkedHashMapB.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(linkedHashMapB);
    }

    @Override // f.b.b
    public void a(T t) {
        if (!c(t)) {
            throw new IllegalArgumentException(b(t));
        }
    }

    @CanIgnoreReturnValue
    public boolean c(T t) {
        h.a.a<b.InterfaceC0194b<?>> aVar = this.a.get(t.getClass().getName());
        if (aVar == null) {
            return false;
        }
        b.InterfaceC0194b<?> interfaceC0194b = aVar.get();
        try {
            ((b) f.d(interfaceC0194b.a(t), "%s.create(I) should not return null.", interfaceC0194b.getClass())).a(t);
            return true;
        } catch (ClassCastException e2) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", interfaceC0194b.getClass().getCanonicalName(), t.getClass().getCanonicalName()), e2);
        }
    }
}