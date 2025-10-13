package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.a.o.b;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public void l(Configuration configuration) {
    }

    void m() {
    }

    public abstract boolean n(int i2, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z);

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(CharSequence charSequence);

    public c.a.o.b u(b.a aVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0000a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0000a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.t);
            this.a = typedArrayObtainStyledAttributes.getInt(c.a.j.u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0000a(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.a = 8388627;
        }

        public C0000a(C0000a c0000a) {
            super((ViewGroup.MarginLayoutParams) c0000a);
            this.a = 0;
            this.a = c0000a.a;
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}