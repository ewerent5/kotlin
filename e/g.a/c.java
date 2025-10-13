package e.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import e.g.a.d;
import e.g.a.f;
import java.util.List;

/* compiled from: BillingHelper.java */
/* loaded from: classes.dex */
public abstract class c implements f.InterfaceC0193f, f.d {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private f f15656b;

    /* renamed from: c, reason: collision with root package name */
    private d f15657c;

    public c(Context context) {
        this.a = context;
    }

    private String d() {
        return this.a.getPackageName();
    }

    private String e(String str) {
        return new String(q(Base64.decode(str, 0), this.a.getPackageName().getBytes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k(final boolean z, final List list, final List list2, g gVar) {
        if (gVar.b()) {
            m(false);
            m.a.a.f("setup: operation failed, result=%s", gVar);
            return;
        }
        m(true);
        m.a.a.a("setup: success", new Object[0]);
        this.f15657c = new d(new d.a() { // from class: e.g.a.a
            @Override // e.g.a.d.a
            public final void a() {
                this.a.i(z, list, list2);
            }
        });
        this.a.registerReceiver(this.f15657c, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
        h(z, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(boolean z, List<String> list, List<String> list2) {
        try {
            this.f15656b.q(z, list, list2, this);
        } catch (Exception e2) {
            m.a.a.h(e2, "queryInventory", new Object[0]);
        }
    }

    private static byte[] q(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
        return bArr3;
    }

    public void c() {
        d dVar = this.f15657c;
        if (dVar != null) {
            this.a.unregisterReceiver(dVar);
        }
        f fVar = this.f15656b;
        if (fVar != null) {
            fVar.d();
            this.f15656b = null;
        }
    }

    public boolean f(int i2, int i3, Intent intent) {
        try {
            return this.f15656b.k(i2, i3, intent);
        } catch (Exception e2) {
            m.a.a.h(e2, "handleActivityResult", new Object[0]);
            return false;
        }
    }

    protected boolean g() {
        return this.f15656b.u();
    }

    public void l(Activity activity, String str, String str2) {
        try {
            this.f15656b.l(activity, str, str2, null, 10001, this, d());
        } catch (Exception e2) {
            m.a.a.h(e2, "purchase", new Object[0]);
        }
    }

    public abstract void m(boolean z);

    public void o(String str, final boolean z, final List<String> list, final List<String> list2) {
        f fVar = new f(this.a, e(str));
        this.f15656b = fVar;
        fVar.e(false);
        this.f15656b.t(new f.e() { // from class: e.g.a.b
            @Override // e.g.a.f.e
            public final void a(g gVar) {
                this.a.k(z, list, list2, gVar);
            }
        });
    }

    protected boolean p(i iVar) {
        return d().equals(iVar.a());
    }
}