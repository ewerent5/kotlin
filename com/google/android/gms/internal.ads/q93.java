package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q93 {
    public static final q93 a = new q93();

    protected q93() {
    }

    public final m93 a(Context context, u1 u1Var) {
        Context context2;
        List listUnmodifiableList;
        e93 e93Var;
        String strL;
        Date dateA = u1Var.a();
        long time = dateA != null ? dateA.getTime() : -1L;
        String strB = u1Var.b();
        int iD = u1Var.d();
        Set<String> setE = u1Var.e();
        if (setE.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setE));
            context2 = context;
        }
        boolean zM = u1Var.m(context2);
        Location locationF = u1Var.f();
        Bundle bundleH = u1Var.h(AdMobAdapter.class);
        if (u1Var.t() != null) {
            e93Var = new e93(u1Var.t().getAdString(), ta3.f().containsKey(u1Var.t().getQueryInfo()) ? ta3.f().get(u1Var.t().getQueryInfo()) : "");
        } else {
            e93Var = null;
        }
        String strJ = u1Var.j();
        SearchAdRequest searchAdRequestL = u1Var.l();
        z2 z2Var = searchAdRequestL != null ? new z2(searchAdRequestL) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            ta3.a();
            strL = xq.l(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strL = null;
        }
        boolean zS = u1Var.s();
        RequestConfiguration requestConfigurationM = c2.a().m();
        return new m93(8, time, bundleH, iD, listUnmodifiableList, zM, Math.max(u1Var.p(), requestConfigurationM.getTagForChildDirectedTreatment()), false, strJ, z2Var, locationF, strB, u1Var.o(), u1Var.q(), Collections.unmodifiableList(new ArrayList(u1Var.r())), u1Var.k(), strL, zS, e93Var, Math.max(-1, requestConfigurationM.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, requestConfigurationM.getMaxAdContentRating()), p93.f8128e), u1Var.c(), u1Var.u());
    }
}