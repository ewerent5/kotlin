package g.a.a.a;

import j$.util.StringJoiner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: CsvRow.java */
/* loaded from: classes3.dex */
public final class d {
    private static final String[] a = {""};

    /* renamed from: b, reason: collision with root package name */
    private final long f15727b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f15728c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15729d;

    d(long j2, boolean z) {
        this(j2, a, z);
    }

    public String a(int i2) {
        return this.f15728c[i2];
    }

    public int b() {
        return this.f15728c.length;
    }

    public List<String> c() {
        return Collections.unmodifiableList(Arrays.asList(this.f15728c));
    }

    public long d() {
        return this.f15727b;
    }

    public boolean e() {
        return this.f15729d;
    }

    public boolean f() {
        return this.f15728c == a;
    }

    public String toString() {
        return new StringJoiner(", ", d.class.getSimpleName() + "[", "]").add("originalLineNumber=" + this.f15727b).add("fields=" + Arrays.toString(this.f15728c)).add("comment=" + this.f15729d).toString();
    }

    d(long j2, String[] strArr, boolean z) {
        this.f15727b = j2;
        this.f15728c = strArr;
        this.f15729d = z;
    }
}