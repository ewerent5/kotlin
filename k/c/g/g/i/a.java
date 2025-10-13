package k.c.g.g.i;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import k.c.g.d;

/* compiled from: InfoWindow.java */
/* loaded from: classes3.dex */
public abstract class a {
    protected View a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f16906b;

    /* renamed from: c, reason: collision with root package name */
    protected d f16907c;

    public void a() {
        if (this.f16906b) {
            this.f16906b = false;
            ((ViewGroup) this.a.getParent()).removeView(this.a);
            b();
        }
    }

    public abstract void b();

    public void c() {
        a();
        View view = this.a;
        if (view != null) {
            view.setTag(null);
        }
        this.a = null;
        this.f16907c = null;
        if (k.c.b.a.a().c()) {
            Log.d("OsmDroid", "Marked detached");
        }
    }
}