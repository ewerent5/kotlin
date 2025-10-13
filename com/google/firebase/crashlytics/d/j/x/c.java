package com.google.firebase.crashlytics.d.j.x;

import android.util.JsonReader;
import com.google.firebase.crashlytics.d.j.x.h;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes.dex */
final /* synthetic */ class c implements h.a {
    private static final c a = new c();

    private c() {
    }

    public static h.a b() {
        return a;
    }

    @Override // com.google.firebase.crashlytics.d.j.x.h.a
    public Object a(JsonReader jsonReader) {
        return h.l(jsonReader);
    }
}