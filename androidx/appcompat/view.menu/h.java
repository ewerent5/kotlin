package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: e, reason: collision with root package name */
    private g f250e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.appcompat.app.b f251f;

    /* renamed from: g, reason: collision with root package name */
    e f252g;

    /* renamed from: h, reason: collision with root package name */
    private m.a f253h;

    public h(g gVar) {
        this.f250e = gVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f251f;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        g gVar = this.f250e;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), c.a.g.f2503j);
        this.f252g = eVar;
        eVar.h(this);
        this.f250e.b(this.f252g);
        aVar.c(this.f252g.a(), this);
        View viewY = gVar.y();
        if (viewY != null) {
            aVar.e(viewY);
        } else {
            aVar.f(gVar.w()).u(gVar.x());
        }
        aVar.n(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f251f = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f251f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f251f.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void c(g gVar, boolean z) {
        if (z || gVar == this.f250e) {
            a();
        }
        m.a aVar = this.f253h;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean d(g gVar) {
        m.a aVar = this.f253h;
        if (aVar != null) {
            return aVar.d(gVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f250e.L((i) this.f252g.a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f252g.c(this.f250e, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f251f.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f251f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f250e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f250e.performShortcut(i2, keyEvent, 0);
    }
}