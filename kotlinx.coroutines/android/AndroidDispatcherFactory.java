package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import kotlinx.coroutines.y1;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public /* bridge */ /* synthetic */ y1 createDispatcher(List list) {
        return createDispatcher((List<? extends MainDispatcherFactory>) list);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public a createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new a(c.a(Looper.getMainLooper(), true), null, 2, 0 == true ? 1 : 0);
    }
}