package k.c.e;

import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.LinkedHashSet;

/* compiled from: TileStates.java */
/* loaded from: classes3.dex */
public class l {
    private Collection<Runnable> a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private boolean f16619b;

    /* renamed from: c, reason: collision with root package name */
    private int f16620c;

    /* renamed from: d, reason: collision with root package name */
    private int f16621d;

    /* renamed from: e, reason: collision with root package name */
    private int f16622e;

    /* renamed from: f, reason: collision with root package name */
    private int f16623f;

    /* renamed from: g, reason: collision with root package name */
    private int f16624g;

    public void a() {
        this.f16619b = true;
        for (Runnable runnable : this.a) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b(Drawable drawable) {
        this.f16620c++;
        if (drawable == null) {
            this.f16624g++;
            return;
        }
        int iA = b.a(drawable);
        if (iA == -4) {
            this.f16624g++;
            return;
        }
        if (iA == -3) {
            this.f16623f++;
            return;
        }
        if (iA == -2) {
            this.f16622e++;
        } else {
            if (iA == -1) {
                this.f16621d++;
                return;
            }
            throw new IllegalArgumentException("Unknown state: " + iA);
        }
    }

    public void c() {
        this.f16619b = false;
        this.f16620c = 0;
        this.f16621d = 0;
        this.f16622e = 0;
        this.f16623f = 0;
        this.f16624g = 0;
    }

    public String toString() {
        if (!this.f16619b) {
            return "TileStates";
        }
        return "TileStates: " + this.f16620c + " = " + this.f16621d + "(U) + " + this.f16622e + "(E) + " + this.f16623f + "(S) + " + this.f16624g + "(N)";
    }
}