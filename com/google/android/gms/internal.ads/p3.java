package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class p3 {
    private final Collection<o3<?>> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Collection<o3<String>> f8075b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Collection<o3<String>> f8076c = new ArrayList();

    public final void a(o3 o3Var) {
        this.a.add(o3Var);
    }

    public final void b(o3<String> o3Var) {
        this.f8075b.add(o3Var);
    }

    public final void c(SharedPreferences.Editor editor, int i2, JSONObject jSONObject) {
        for (o3<?> o3Var : this.a) {
            if (o3Var.m() == 1) {
                o3Var.b(editor, o3Var.c(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            er.zzf("Flag Json is null.");
        }
    }

    public final List<String> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<o3<String>> it = this.f8075b.iterator();
        while (it.hasNext()) {
            String str = (String) c.c().b(it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(x3.a());
        return arrayList;
    }

    public final List<String> e() {
        List<String> listD = d();
        Iterator<o3<String>> it = this.f8076c.iterator();
        while (it.hasNext()) {
            String str = (String) c.c().b(it.next());
            if (!TextUtils.isEmpty(str)) {
                listD.add(str);
            }
        }
        listD.addAll(x3.b());
        return listD;
    }
}