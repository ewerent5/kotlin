package com.google.firebase.j;

import android.text.TextUtils;
import com.google.firebase.analytics.a.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes.dex */
public class b {
    private static final String[] a = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: b, reason: collision with root package name */
    static final DateFormat f12862b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: c, reason: collision with root package name */
    private final String f12863c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12864d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12865e;

    /* renamed from: f, reason: collision with root package name */
    private final Date f12866f;

    /* renamed from: g, reason: collision with root package name */
    private final long f12867g;

    /* renamed from: h, reason: collision with root package name */
    private final long f12868h;

    public b(String str, String str2, String str3, Date date, long j2, long j3) {
        this.f12863c = str;
        this.f12864d = str2;
        this.f12865e = str3;
        this.f12866f = date;
        this.f12867g = j2;
        this.f12868h = j3;
    }

    static b a(Map<String, String> map) throws a, NumberFormatException, ParseException {
        e(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f12862b.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e2) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e2);
        } catch (ParseException e3) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e3);
        }
    }

    private static void e(Map<String, String> map) throws a {
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String b() {
        return this.f12863c;
    }

    long c() {
        return this.f12866f.getTime();
    }

    a.c d(String str) {
        a.c cVar = new a.c();
        cVar.a = str;
        cVar.f12245m = c();
        cVar.f12234b = this.f12863c;
        cVar.f12235c = this.f12864d;
        cVar.f12236d = TextUtils.isEmpty(this.f12865e) ? null : this.f12865e;
        cVar.f12237e = this.f12867g;
        cVar.f12242j = this.f12868h;
        return cVar;
    }
}