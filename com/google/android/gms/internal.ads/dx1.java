package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dx1 extends yw1 {
    /* JADX WARN: Multi-variable type inference failed */
    public dx1(rw1 rw1Var, rw1 rw1Var2, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(rw1Var, rw1Var2, hashSet, jSONObject, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zw1
    /* renamed from: a */
    public final void onPostExecute(String str) {
        tv1 tv1VarA;
        if (!TextUtils.isEmpty(str) && (tv1VarA = tv1.a()) != null) {
            for (hv1 hv1Var : tv1VarA.e()) {
                if (this.f10499c.contains(hv1Var.i())) {
                    hv1Var.h().f(str, this.f10501e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        if (kw1.i(this.f10500d, this.f10651b.d())) {
            return null;
        }
        this.f10651b.e(this.f10500d);
        return this.f10500d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zw1, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}