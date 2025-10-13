package g.a.a.b;

/* compiled from: LineDelimiter.java */
/* loaded from: classes3.dex */
public enum b {
    LF("\n"),
    CR("\r"),
    CRLF("\r\n"),
    PLATFORM(System.lineSeparator());


    /* renamed from: j, reason: collision with root package name */
    private final String f15763j;

    b(String str) {
        this.f15763j = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f15763j;
    }
}