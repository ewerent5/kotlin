package com.google.firebase.crashlytics.d.j.x;

import android.util.JsonReader;
import com.google.firebase.crashlytics.d.j.x.h;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes.dex */
final /* synthetic */ class d implements h.a {
    private static final d a = new d();

    private d() {
    }

    public static h.a b() {
        return a;
    }

    @Override // com.google.firebase.crashlytics.d.j.x.h.a
    public Object a(JsonReader jsonReader) {
        return h.w(jsonReader);
    }
}