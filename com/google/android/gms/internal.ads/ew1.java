package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ew1 implements cw1 {
    private final cw1 a;

    public ew1(cw1 cw1Var) {
        this.a = cw1Var;
    }

    @Override // com.google.android.gms.internal.ads.cw1
    public final void a(View view, JSONObject jSONObject, bw1 bw1Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        tv1 tv1VarA = tv1.a();
        if (tv1VarA != null) {
            Collection<hv1> collectionF = tv1VarA.f();
            int size = collectionF.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator<hv1> it = collectionF.iterator();
            while (it.hasNext()) {
                View viewJ = it.next().j();
                if (viewJ != null && (Build.VERSION.SDK_INT < 19 || viewJ.isAttachedToWindow())) {
                    if (viewJ.isShown()) {
                        View view2 = viewJ;
                        while (true) {
                            if (view2 == null) {
                                View rootView = viewJ.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float fA = nw1.a(rootView);
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i2 = size2 - 1;
                                        if (nw1.a((View) arrayList.get(i2)) <= fA) {
                                            break;
                                        } else {
                                            size2 = i2;
                                        }
                                    }
                                    arrayList.add(size2, rootView);
                                }
                            } else if (view2.getAlpha() != 0.0f) {
                                Object parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            bw1Var.a((View) arrayList.get(i3), this.a, jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.ads.cw1
    public final JSONObject zza(View view) {
        throw null;
    }
}