package c.s;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
class l0 implements m0 {
    private final WindowId a;

    l0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}