package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cx1 extends yw1 {
    /* JADX WARN: Multi-variable type inference failed */
    public cx1(rw1 rw1Var, rw1 rw1Var2, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(rw1Var, rw1Var2, hashSet, jSONObject, null);
    }

    private final void c(String str) {
        tv1 tv1VarA = tv1.a();
        if (tv1VarA != null) {
            for (hv1 hv1Var : tv1VarA.e()) {
                if (this.f10499c.contains(hv1Var.i())) {
                    hv1Var.h().g(str, this.f10501e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zw1
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f10500d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zw1, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        c(str2);
        super.onPostExecute(str2);
    }
}