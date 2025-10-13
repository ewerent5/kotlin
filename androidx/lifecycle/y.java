package androidx.lifecycle;

import java.io.IOException;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.t0;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class y {
    public static final i0 a(x xVar) throws IOException {
        i.y.d.l.d(xVar, "$this$viewModelScope");
        i0 i0Var = (i0) xVar.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (i0Var != null) {
            return i0Var;
        }
        Object objE = xVar.e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new c(g2.b(null, 1, null).plus(t0.c().b0())));
        i.y.d.l.c(objE, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (i0) objE;
    }
}