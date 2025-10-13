package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.c0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final c.e.a<c0<?>, com.google.android.gms.common.b> f4539e;

    public c(c.e.a<c0<?>, com.google.android.gms.common.b> aVar) {
        this.f4539e = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (c0<?> c0Var : this.f4539e.keySet()) {
            com.google.android.gms.common.b bVar = this.f4539e.get(c0Var);
            if (bVar.L()) {
                z = false;
            }
            String strA = c0Var.a();
            String strValueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 2 + strValueOf.length());
            sb.append(strA);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}