package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class b extends g implements DialogInterface {

    /* renamed from: g, reason: collision with root package name */
    final AlertController f71g;

    /* compiled from: AlertDialog.java */
    public static class a {
        private final AlertController.f a;

        /* renamed from: b, reason: collision with root package name */
        private final int f72b;

        public a(Context context) {
            this(context, b.h(context, 0));
        }

        public b a() {
            b bVar = new b(this.a.a, this.f72b);
            this.a.a(bVar.f71g);
            bVar.setCancelable(this.a.r);
            if (this.a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.a.s);
            bVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        public a e(View view) {
            this.a.f52g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.a.f49d = drawable;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            return this;
        }

        public a h(int i2) {
            AlertController.f fVar = this.a;
            fVar.f53h = fVar.a.getText(i2);
            return this;
        }

        public a i(CharSequence charSequence) {
            this.a.f53h = charSequence;
            return this;
        }

        public a j(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a k(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f57l = fVar.a.getText(i2);
            this.a.n = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f57l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a m(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.o = fVar.a.getText(i2);
            this.a.q = onClickListener;
            return this;
        }

        public a n(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a o(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f54i = fVar.a.getText(i2);
            this.a.f56k = onClickListener;
            return this;
        }

        public a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f54i = charSequence;
            fVar.f56k = onClickListener;
            return this;
        }

        public a q(int i2, int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i2);
            AlertController.f fVar2 = this.a;
            fVar2.x = onClickListener;
            fVar2.I = i3;
            fVar2.H = true;
            return this;
        }

        public a r(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a s(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a t(int i2) {
            AlertController.f fVar = this.a;
            fVar.f51f = fVar.a.getText(i2);
            return this;
        }

        public a u(CharSequence charSequence) {
            this.a.f51f = charSequence;
            return this;
        }

        public a v(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i2) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, b.h(context, i2)));
            this.f72b = i2;
        }
    }

    protected b(Context context, int i2) {
        super(context, h(context, i2));
        this.f71g = new AlertController(getContext(), this, getWindow());
    }

    static int h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.a.o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f71g.d();
    }

    @Override // androidx.appcompat.app.g, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f71g.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f71g.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f71g.h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // androidx.appcompat.app.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f71g.q(charSequence);
    }
}