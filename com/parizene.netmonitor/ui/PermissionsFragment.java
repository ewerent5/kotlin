package com.parizene.netmonitor.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.n0;

/* compiled from: PermissionsFragment.kt */
/* loaded from: classes3.dex */
public final class PermissionsFragment extends Fragment {
    public static final b b0 = new b(null);
    private a c0;

    /* compiled from: PermissionsFragment.kt */
    public interface a {

        /* compiled from: PermissionsFragment.kt */
        /* renamed from: com.parizene.netmonitor.ui.PermissionsFragment$a$a, reason: collision with other inner class name */
        public static final class C0166a {
            public static void a(a aVar) {
                i.y.d.l.d(aVar, "this");
            }

            public static void b(a aVar) {
                i.y.d.l.d(aVar, "this");
            }
        }

        void a();

        void e();
    }

    /* compiled from: PermissionsFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i.y.d.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(PermissionsFragment permissionsFragment, View view) {
        i.y.d.l.d(permissionsFragment, "this$0");
        g1.a(permissionsFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(PermissionsFragment permissionsFragment, View view) {
        i.y.d.l.d(permissionsFragment, "this$0");
        a aVar = permissionsFragment.c0;
        if (aVar != null) {
            aVar.a();
        } else {
            i.y.d.l.m("callback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(int i2, String[] strArr, int[] iArr) {
        i.y.d.l.d(strArr, "permissions");
        i.y.d.l.d(iArr, "grantResults");
        super.F1(i2, strArr, iArr);
        g1.b(this, i2, iArr);
    }

    public final void K2() {
        a aVar = this.c0;
        if (aVar != null) {
            aVar.e();
        } else {
            i.y.d.l.m("callback");
            throw null;
        }
    }

    public final void N2() {
        Toast.makeText(m2(), R.string.permissions_not_granted_msg, 0).show();
    }

    public final void O2() {
        try {
            F2(e1.a.a(), 1);
        } catch (ActivityNotFoundException e2) {
            m.a.a.g(e2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void g1(int i2, int i3, Intent intent) {
        super.g1(i2, i3, intent);
        if (1 == i2) {
            n0.a aVar = n0.a;
            Context contextM2 = m2();
            i.y.d.l.c(contextM2, "requireContext()");
            if (aVar.a(contextM2)) {
                g1.a(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.i1(context);
        if (context instanceof a) {
            this.c0 = (a) context;
            return;
        }
        throw new ClassCastException(context + " should implement PermissionsFragment.Callback");
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.y.d.l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_intro_permissions, viewGroup, false);
        ((Button) viewInflate.findViewById(R.id.btnGrantPermissions)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsFragment.L2(this.f14028e, view);
            }
        });
        viewInflate.findViewById(R.id.termsAndPrivacy).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsFragment.M2(this.f14029e, view);
            }
        });
        return viewInflate;
    }
}