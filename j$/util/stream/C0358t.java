package j$.util.stream;

/* renamed from: j$.util.stream.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0358t implements j$.util.function.G {
    public static final /* synthetic */ C0358t a = ;

    private /* synthetic */ C0358t() {
    }

    @Override // j$.util.function.G
    public final void accept(Object obj, double d2) {
        double[] dArr = (double[]) obj;
        dArr[2] = dArr[2] + 1.0d;
        C0337n1.b(dArr, d2);
        dArr[3] = dArr[3] + d2;
    }
}