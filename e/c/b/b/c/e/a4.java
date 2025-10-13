package e.c.b.b.c.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
abstract class a4<K, V> implements a5<K, V> {
    a4() {
    }

    public boolean a(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = zza().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a5) {
            return zza().equals(((a5) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }

    @Override // e.c.b.b.c.e.a5
    public abstract Map<K, Collection<V>> zza();
}