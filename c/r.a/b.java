package c.r.a;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase.java */
/* loaded from: classes.dex */
public interface b extends Closeable {
    boolean E0();

    Cursor J(e eVar, CancellationSignal cancellationSignal);

    void S();

    void U();

    Cursor d0(String str);

    String getPath();

    void i0();

    boolean isOpen();

    void k();

    List<Pair<String, String>> n();

    void p(String str);

    Cursor s0(e eVar);

    f x(String str);

    boolean x0();
}