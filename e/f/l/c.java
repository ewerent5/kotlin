package e.f.l;

import java.io.IOException;

/* compiled from: CsvMalformedLineException.java */
/* loaded from: classes.dex */
public class c extends IOException {

    /* renamed from: e, reason: collision with root package name */
    private long f15644e;

    /* renamed from: f, reason: collision with root package name */
    private String f15645f;

    public c(String str, long j2, String str2) {
        super(str);
        this.f15644e = j2;
        this.f15645f = str2;
    }
}