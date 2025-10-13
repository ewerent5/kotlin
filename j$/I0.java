package j$;

import j$.util.stream.InterfaceC0329l1;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class I0 implements BaseStream {
    final /* synthetic */ InterfaceC0329l1 a;

    private /* synthetic */ I0(InterfaceC0329l1 interfaceC0329l1) {
        this.a = interfaceC0329l1;
    }

    public static /* synthetic */ BaseStream m0(InterfaceC0329l1 interfaceC0329l1) {
        if (interfaceC0329l1 == null) {
            return null;
        }
        return interfaceC0329l1 instanceof H0 ? ((H0) interfaceC0329l1).a : new I0(interfaceC0329l1);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m0(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream parallel() {
        return m0(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream sequential() {
        return m0(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Spliterator spliterator() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream unordered() {
        return m0(this.a.unordered());
    }
}