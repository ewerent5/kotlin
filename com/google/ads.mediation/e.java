package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.er;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public abstract class e {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    protected @interface b {
        @RecentlyNonNull
        String name();

        boolean required() default true;
    }

    public void a(@RecentlyNonNull Map<String, String> map) throws IllegalAccessException, SecurityException, IllegalArgumentException, a {
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                map2.put(bVar.name(), field);
            }
        }
        if (map2.isEmpty()) {
            er.zzi("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String key = entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 49);
                    sb.append("Server option \"");
                    sb.append(key);
                    sb.append("\" could not be set: Illegal Access");
                    er.zzi(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String key2 = entry.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(key2).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(key2);
                    sb2.append("\" could not be set: Bad Type");
                    er.zzi(sb2.toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length());
                sb3.append("Unexpected server option: ");
                sb3.append(key3);
                sb3.append(" = \"");
                sb3.append(value);
                sb3.append("\"");
                er.zzd(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : map2.values()) {
            if (((b) field3.getAnnotation(b.class)).required()) {
                String strValueOf = String.valueOf(((b) field3.getAnnotation(b.class)).name());
                er.zzi(strValueOf.length() != 0 ? "Required server option missing: ".concat(strValueOf) : new String("Required server option missing: "));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((b) field3.getAnnotation(b.class)).name());
            }
        }
        if (sb4.length() > 0) {
            String strValueOf2 = String.valueOf(sb4.toString());
            throw new a(strValueOf2.length() != 0 ? "Required server option(s) missing: ".concat(strValueOf2) : new String("Required server option(s) missing: "));
        }
    }
}