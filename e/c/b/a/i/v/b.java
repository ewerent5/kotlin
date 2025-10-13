package e.c.b.a.i.v;

/* compiled from: Retries.java */
/* loaded from: classes.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i2, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult tresultApply;
        if (i2 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i2--;
        } while (i2 >= 1);
        return tresultApply;
    }
}