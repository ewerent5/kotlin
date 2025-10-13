package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements j$.util.function.I {
    public static final /* synthetic */ P a = ;

    private /* synthetic */ P() {
    }

    @Override // j$.util.function.I
    public final void accept(Object obj, long j2) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j2;
    }
}