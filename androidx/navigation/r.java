package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Navigator.java */
/* loaded from: classes.dex */
public abstract class r<D extends j> {

    /* compiled from: Navigator.java */
    public interface a {
    }

    /* compiled from: Navigator.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public abstract D a();

    public abstract j b(D d2, Bundle bundle, o oVar, a aVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}