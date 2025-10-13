package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.y1;

/* compiled from: MainDispatcherFactory.kt */
/* loaded from: classes3.dex */
public interface MainDispatcherFactory {
    y1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}