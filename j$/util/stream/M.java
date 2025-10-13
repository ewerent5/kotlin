package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements j$.util.function.H {
    public static final /* synthetic */ M a = ;

    private /* synthetic */ M() {
    }

    @Override // j$.util.function.H
    public final void accept(Object obj, int i2) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i2;
    }
}