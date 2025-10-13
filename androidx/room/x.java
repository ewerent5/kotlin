package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoClosingRoomOpenHelper.java */
/* loaded from: classes.dex */
final class x implements c.r.a.c, c0 {

    /* renamed from: e, reason: collision with root package name */
    private final c.r.a.c f2000e;

    /* renamed from: f, reason: collision with root package name */
    private final a f2001f;

    /* renamed from: g, reason: collision with root package name */
    private final w f2002g;

    /* compiled from: AutoClosingRoomOpenHelper.java */
    static final class a implements c.r.a.b {

        /* renamed from: e, reason: collision with root package name */
        private final w f2003e;

        a(w wVar) {
            this.f2003e = wVar;
        }

        static /* synthetic */ Object b(String str, c.r.a.b bVar) {
            bVar.p(str);
            return null;
        }

        static /* synthetic */ Boolean c(c.r.a.b bVar) {
            return Build.VERSION.SDK_INT >= 16 ? Boolean.valueOf(bVar.E0()) : Boolean.FALSE;
        }

        static /* synthetic */ Object d(c.r.a.b bVar) {
            return null;
        }

        @Override // c.r.a.b
        @SuppressLint({"UnsafeNewApiCall"})
        public boolean E0() {
            return ((Boolean) this.f2003e.c(new c.b.a.c.a() { // from class: androidx.room.c
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return x.a.c((c.r.a.b) obj);
                }
            })).booleanValue();
        }

        @Override // c.r.a.b
        public Cursor J(c.r.a.e eVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f2003e.e().J(eVar, cancellationSignal), this.f2003e);
            } catch (Throwable th) {
                this.f2003e.b();
                throw th;
            }
        }

        @Override // c.r.a.b
        public void S() {
            c.r.a.b bVarD = this.f2003e.d();
            if (bVarD == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            bVarD.S();
        }

        @Override // c.r.a.b
        public void U() {
            try {
                this.f2003e.e().U();
            } catch (Throwable th) {
                this.f2003e.b();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2003e.a();
        }

        @Override // c.r.a.b
        public Cursor d0(String str) {
            try {
                return new c(this.f2003e.e().d0(str), this.f2003e);
            } catch (Throwable th) {
                this.f2003e.b();
                throw th;
            }
        }

        void g() {
            this.f2003e.c(new c.b.a.c.a() { // from class: androidx.room.d
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    x.a.d((c.r.a.b) obj);
                    return null;
                }
            });
        }

        @Override // c.r.a.b
        public String getPath() {
            return (String) this.f2003e.c(new c.b.a.c.a() { // from class: androidx.room.a
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return ((c.r.a.b) obj).getPath();
                }
            });
        }

        @Override // c.r.a.b
        public void i0() {
            if (this.f2003e.d() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.f2003e.d().i0();
            } finally {
                this.f2003e.b();
            }
        }

        @Override // c.r.a.b
        public boolean isOpen() {
            c.r.a.b bVarD = this.f2003e.d();
            if (bVarD == null) {
                return false;
            }
            return bVarD.isOpen();
        }

        @Override // c.r.a.b
        public void k() {
            try {
                this.f2003e.e().k();
            } catch (Throwable th) {
                this.f2003e.b();
                throw th;
            }
        }

        @Override // c.r.a.b
        public List<Pair<String, String>> n() {
            return (List) this.f2003e.c(new c.b.a.c.a() { // from class: androidx.room.t
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return ((c.r.a.b) obj).n();
                }
            });
        }

        @Override // c.r.a.b
        public void p(final String str) {
            this.f2003e.c(new c.b.a.c.a() { // from class: androidx.room.b
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    x.a.b(str, (c.r.a.b) obj);
                    return null;
                }
            });
        }

        @Override // c.r.a.b
        public Cursor s0(c.r.a.e eVar) {
            try {
                return new c(this.f2003e.e().s0(eVar), this.f2003e);
            } catch (Throwable th) {
                this.f2003e.b();
                throw th;
            }
        }

        @Override // c.r.a.b
        public c.r.a.f x(String str) {
            return new b(str, this.f2003e);
        }

        @Override // c.r.a.b
        public boolean x0() {
            if (this.f2003e.d() == null) {
                return false;
            }
            return ((Boolean) this.f2003e.c(new c.b.a.c.a() { // from class: androidx.room.f
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((c.r.a.b) obj).x0());
                }
            })).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.java */
    static class b implements c.r.a.f {

        /* renamed from: e, reason: collision with root package name */
        private final String f2004e;

        /* renamed from: f, reason: collision with root package name */
        private final ArrayList<Object> f2005f = new ArrayList<>();

        /* renamed from: g, reason: collision with root package name */
        private final w f2006g;

        b(String str, w wVar) {
            this.f2004e = str;
            this.f2006g = wVar;
        }

        private void b(c.r.a.f fVar) {
            int i2 = 0;
            while (i2 < this.f2005f.size()) {
                int i3 = i2 + 1;
                Object obj = this.f2005f.get(i2);
                if (obj == null) {
                    fVar.t0(i3);
                } else if (obj instanceof Long) {
                    fVar.R(i3, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    fVar.E(i3, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    fVar.r(i3, (String) obj);
                } else if (obj instanceof byte[]) {
                    fVar.X(i3, (byte[]) obj);
                }
                i2 = i3;
            }
        }

        private <T> T c(final c.b.a.c.a<c.r.a.f, T> aVar) {
            return (T) this.f2006g.c(new c.b.a.c.a() { // from class: androidx.room.e
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return this.a.g(aVar, (c.r.a.b) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ Object g(c.b.a.c.a aVar, c.r.a.b bVar) {
            c.r.a.f fVarX = bVar.x(this.f2004e);
            b(fVarX);
            return aVar.apply(fVarX);
        }

        private void i(int i2, Object obj) {
            int i3 = i2 - 1;
            if (i3 >= this.f2005f.size()) {
                for (int size = this.f2005f.size(); size <= i3; size++) {
                    this.f2005f.add(null);
                }
            }
            this.f2005f.set(i3, obj);
        }

        @Override // c.r.a.d
        public void E(int i2, double d2) {
            i(i2, Double.valueOf(d2));
        }

        @Override // c.r.a.f
        public long N0() {
            return ((Long) c(new c.b.a.c.a() { // from class: androidx.room.s
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return Long.valueOf(((c.r.a.f) obj).N0());
                }
            })).longValue();
        }

        @Override // c.r.a.d
        public void R(int i2, long j2) {
            i(i2, Long.valueOf(j2));
        }

        @Override // c.r.a.d
        public void X(int i2, byte[] bArr) {
            i(i2, bArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // c.r.a.d
        public void r(int i2, String str) {
            i(i2, str);
        }

        @Override // c.r.a.d
        public void t0(int i2) {
            i(i2, null);
        }

        @Override // c.r.a.f
        public int w() {
            return ((Integer) c(new c.b.a.c.a() { // from class: androidx.room.v
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    return Integer.valueOf(((c.r.a.f) obj).w());
                }
            })).intValue();
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.java */
    private static final class c implements Cursor {

        /* renamed from: e, reason: collision with root package name */
        private final Cursor f2007e;

        /* renamed from: f, reason: collision with root package name */
        private final w f2008f;

        c(Cursor cursor, w wVar) {
            this.f2007e = cursor;
            this.f2008f = wVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2007e.close();
            this.f2008f.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
            this.f2007e.copyStringToBuffer(i2, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f2007e.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i2) {
            return this.f2007e.getBlob(i2);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f2007e.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f2007e.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f2007e.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i2) {
            return this.f2007e.getColumnName(i2);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f2007e.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f2007e.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i2) {
            return this.f2007e.getDouble(i2);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f2007e.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i2) {
            return this.f2007e.getFloat(i2);
        }

        @Override // android.database.Cursor
        public int getInt(int i2) {
            return this.f2007e.getInt(i2);
        }

        @Override // android.database.Cursor
        public long getLong(int i2) {
            return this.f2007e.getLong(i2);
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public Uri getNotificationUri() {
            return this.f2007e.getNotificationUri();
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public List<Uri> getNotificationUris() {
            return this.f2007e.getNotificationUris();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f2007e.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i2) {
            return this.f2007e.getShort(i2);
        }

        @Override // android.database.Cursor
        public String getString(int i2) {
            return this.f2007e.getString(i2);
        }

        @Override // android.database.Cursor
        public int getType(int i2) {
            return this.f2007e.getType(i2);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f2007e.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f2007e.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f2007e.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f2007e.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f2007e.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f2007e.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i2) {
            return this.f2007e.isNull(i2);
        }

        @Override // android.database.Cursor
        public boolean move(int i2) {
            return this.f2007e.move(i2);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f2007e.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f2007e.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f2007e.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i2) {
            return this.f2007e.moveToPosition(i2);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f2007e.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f2007e.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f2007e.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f2007e.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f2007e.respond(bundle);
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public void setExtras(Bundle bundle) {
            this.f2007e.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f2007e.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            this.f2007e.setNotificationUris(contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f2007e.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f2007e.unregisterDataSetObserver(dataSetObserver);
        }
    }

    x(c.r.a.c cVar, w wVar) {
        this.f2000e = cVar;
        this.f2002g = wVar;
        wVar.f(cVar);
        this.f2001f = new a(wVar);
    }

    @Override // c.r.a.c
    public c.r.a.b V() {
        this.f2001f.g();
        return this.f2001f;
    }

    w b() {
        return this.f2002g;
    }

    @Override // c.r.a.c
    public c.r.a.b c0() {
        this.f2001f.g();
        return this.f2001f;
    }

    @Override // c.r.a.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            this.f2001f.close();
        } catch (IOException e2) {
            androidx.room.c1.e.a(e2);
        }
    }

    @Override // c.r.a.c
    public String getDatabaseName() {
        return this.f2000e.getDatabaseName();
    }

    @Override // androidx.room.c0
    public c.r.a.c getDelegate() {
        return this.f2000e;
    }

    @Override // c.r.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f2000e.setWriteAheadLoggingEnabled(z);
    }
}