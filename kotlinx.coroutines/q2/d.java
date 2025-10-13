package kotlinx.coroutines.q2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[f.values().length];
        a = iArr;
        iArr[f.SUSPEND.ordinal()] = 1;
        iArr[f.DROP_LATEST.ordinal()] = 2;
        iArr[f.DROP_OLDEST.ordinal()] = 3;
    }
}