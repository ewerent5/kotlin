package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import j$.lang.Iterable;
import j$.time.a;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class TurboFilterList extends CopyOnWriteArrayList<TurboFilter> implements List {
    private static final long serialVersionUID = 1;

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public FilterReply getTurboFilterChainDecision(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (size() == 1) {
            try {
                return get(0).decide(marker, logger, level, str, objArr, th);
            } catch (IndexOutOfBoundsException unused) {
                return FilterReply.NEUTRAL;
            }
        }
        for (Object obj : toArray()) {
            FilterReply filterReplyDecide = ((TurboFilter) obj).decide(marker, logger, level, str, objArr, th);
            if (filterReplyDecide == FilterReply.DENY || filterReplyDecide == FilterReply.ACCEPT) {
                return filterReplyDecide;
            }
        }
        return FilterReply.NEUTRAL;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(a.L(this), true);
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(a.L(this), false);
    }
}