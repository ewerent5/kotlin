package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c */
    private float f11708c;

    /* renamed from: f */
    private e.c.b.c.z.d f11711f;
    private final TextPaint a = new TextPaint(1);

    /* renamed from: b */
    private final e.c.b.c.z.f f11707b = new a();

    /* renamed from: d */
    private boolean f11709d = true;

    /* renamed from: e */
    private WeakReference<b> f11710e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    class a extends e.c.b.c.z.f {
        a() {
        }

        @Override // e.c.b.c.z.f
        public void a(int i2) {
            h.this.f11709d = true;
            b bVar = (b) h.this.f11710e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // e.c.b.c.z.f
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            h.this.f11709d = true;
            b bVar = (b) h.this.f11710e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public e.c.b.c.z.d d() {
        return this.f11711f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.f11709d) {
            return this.f11708c;
        }
        float fC = c(str);
        this.f11708c = fC;
        this.f11709d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f11710e = new WeakReference<>(bVar);
    }

    public void h(e.c.b.c.z.d dVar, Context context) {
        if (this.f11711f != dVar) {
            this.f11711f = dVar;
            if (dVar != null) {
                dVar.k(context, this.a, this.f11707b);
                b bVar = this.f11710e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                dVar.j(context, this.a, this.f11707b);
                this.f11709d = true;
            }
            b bVar2 = this.f11710e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.f11709d = z;
    }

    public void j(Context context) {
        this.f11711f.j(context, this.a, this.f11707b);
    }
}