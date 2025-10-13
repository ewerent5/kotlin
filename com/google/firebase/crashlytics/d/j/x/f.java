package com.google.firebase.crashlytics.d.j.x;

import android.util.JsonReader;
import com.google.firebase.crashlytics.d.j.x.h;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes.dex */
final /* synthetic */ class f implements h.a {
    private static final f a = new f();

    private f() {
    }

    public static h.a b() {
        return a;
    }

    @Override // com.google.firebase.crashlytics.d.j.x.h.a
    public Object a(JsonReader jsonReader) {
        return h.t(jsonReader);
    }
}