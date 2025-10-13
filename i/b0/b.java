package i.b0;

import java.util.List;
import java.util.Map;

/* compiled from: KCallable.kt */
/* loaded from: classes3.dex */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<?, ? extends Object> map);

    List<?> getParameters();

    j getReturnType();

    List<?> getTypeParameters();

    k getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}