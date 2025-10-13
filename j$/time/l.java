package j$.time;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class l extends j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final String f15931b;

    /* renamed from: c, reason: collision with root package name */
    private final transient j$.time.p.c f15932c;

    l(String str, j$.time.p.c cVar) {
        this.f15931b = str;
        this.f15932c = cVar;
    }

    static l y(String str, boolean z) {
        int length = str.length();
        if (length < 2) {
            throw new c("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i2 == 0) && ((cCharAt < '0' || cCharAt > '9' || i2 == 0) && ((cCharAt != '~' || i2 == 0) && ((cCharAt != '.' || i2 == 0) && ((cCharAt != '_' || i2 == 0) && ((cCharAt != '+' || i2 == 0) && (cCharAt != '-' || i2 == 0))))))))) {
                throw new c("Invalid ID for region-based ZoneId, invalid format: " + str);
            }
        }
        j$.time.p.c cVarA = null;
        try {
            cVarA = j$.time.p.e.a(str, true);
        } catch (j$.time.p.d e2) {
            if (z) {
                throw e2;
            }
        }
        return new l(str, cVarA);
    }

    @Override // j$.time.j
    public String g() {
        return this.f15931b;
    }

    @Override // j$.time.j
    public j$.time.p.c t() {
        j$.time.p.c cVar = this.f15932c;
        return cVar != null ? cVar : j$.time.p.e.a(this.f15931b, false);
    }
}