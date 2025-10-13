package k.c.f;

/* compiled from: NetworkLocationIgnorer.java */
/* loaded from: classes3.dex */
public class p {
    private long a = 0;

    public boolean a(String str, long j2) {
        if (!"gps".equals(str)) {
            return j2 < this.a + k.c.b.a.a().q();
        }
        this.a = j2;
        return false;
    }
}