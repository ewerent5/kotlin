package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.qi2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class zi2<T extends qi2> {
    private static final Logger a = Logger.getLogger(li2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final String f10604b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zi2() {
    }

    static <T extends qi2> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = zi2.class.getClassLoader();
        if (cls.equals(qi2.class)) {
            str = f10604b;
        } else {
            if (!cls.getPackage().equals(zi2.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((zi2) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    } catch (NoSuchMethodException e3) {
                        throw new IllegalStateException(e3);
                    }
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(e4);
                }
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zi2.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zi2) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    protected abstract T a();
}