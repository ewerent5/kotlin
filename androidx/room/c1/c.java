package androidx.room.c1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: DBUtil.java */
/* loaded from: classes.dex */
public class c {
    public static void a(c.r.a.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorD0 = bVar.d0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorD0.moveToNext()) {
            try {
                arrayList.add(cursorD0.getString(0));
            } catch (Throwable th) {
                cursorD0.close();
                throw th;
            }
        }
        cursorD0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @Deprecated
    public static Cursor b(q0 q0Var, c.r.a.e eVar, boolean z) {
        return c(q0Var, eVar, z, null);
    }

    public static Cursor c(q0 q0Var, c.r.a.e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor cursorC = q0Var.C(eVar, cancellationSignal);
        if (!z || !(cursorC instanceof AbstractWindowedCursor)) {
            return cursorC;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorC;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : cursorC;
    }

    public static int d(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i2 = byteBufferAllocate.getInt();
            channel.close();
            return i2;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}