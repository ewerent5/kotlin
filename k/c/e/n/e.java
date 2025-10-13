package k.c.e.n;

import java.util.concurrent.Semaphore;

/* compiled from: OnlineTileSourceBase.java */
/* loaded from: classes3.dex */
public abstract class e extends a {

    /* renamed from: j, reason: collision with root package name */
    private final String[] f16688j;

    /* renamed from: k, reason: collision with root package name */
    private final Semaphore f16689k;

    /* renamed from: l, reason: collision with root package name */
    private final g f16690l;

    public e(String str, int i2, int i3, int i4, String str2, String[] strArr) {
        this(str, i2, i3, i4, str2, strArr, null);
    }

    public void j() throws InterruptedException {
        Semaphore semaphore = this.f16689k;
        if (semaphore == null) {
            return;
        }
        semaphore.acquire();
    }

    public String k() {
        String[] strArr = this.f16688j;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[this.f16685h.nextInt(strArr.length)];
    }

    public g l() {
        return this.f16690l;
    }

    public abstract String m(long j2);

    public void n() {
        Semaphore semaphore = this.f16689k;
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    public e(String str, int i2, int i3, int i4, String str2, String[] strArr, String str3) {
        this(str, i2, i3, i4, str2, strArr, str3, new g());
    }

    public e(String str, int i2, int i3, int i4, String str2, String[] strArr, String str3, g gVar) {
        super(str, i2, i3, i4, str2, str3);
        this.f16688j = strArr;
        this.f16690l = gVar;
        if (gVar.h() > 0) {
            this.f16689k = new Semaphore(gVar.h(), true);
        } else {
            this.f16689k = null;
        }
    }
}