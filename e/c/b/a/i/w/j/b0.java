package e.c.b.a.i.w.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e.c.b.a.i.h;
import e.c.b.a.i.x.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public class b0 implements e.c.b.a.i.w.j.c, e.c.b.a.i.x.b {

    /* renamed from: e, reason: collision with root package name */
    private static final e.c.b.a.b f14310e = e.c.b.a.b.b("proto");

    /* renamed from: f, reason: collision with root package name */
    private final h0 f14311f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.b.a.i.y.a f14312g;

    /* renamed from: h, reason: collision with root package name */
    private final e.c.b.a.i.y.a f14313h;

    /* renamed from: i, reason: collision with root package name */
    private final e.c.b.a.i.w.j.d f14314i;

    /* compiled from: SQLiteEventStore.java */
    interface b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    static class c {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final String f14315b;

        private c(String str, String str2) {
            this.a = str;
            this.f14315b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    interface d<T> {
        T a();
    }

    b0(e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, e.c.b.a.i.w.j.d dVar, h0 h0Var) {
        this.f14311f = h0Var;
        this.f14312g = aVar;
        this.f14313h = aVar2;
        this.f14314i = dVar;
    }

    private List<i> A(List<i> list, Map<Long, Set<c>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                h.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.a, cVar.f14315b);
                }
                listIterator.set(i.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }

    static /* synthetic */ Object C(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private static byte[] C0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    static /* synthetic */ Object D(Throwable th) {
        throw new e.c.b.a.i.x.a("Timed out while trying to acquire the lock.", th);
    }

    private byte[] G0(long j2) {
        return (byte[]) S0(g().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), o.a());
    }

    private <T> T H0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f14313h.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f14313h.a() >= this.f14314i.b() + jA) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static e.c.b.a.b I0(String str) {
        return str == null ? f14310e : e.c.b.a.b.b(str);
    }

    static /* synthetic */ SQLiteDatabase K(Throwable th) {
        throw new e.c.b.a.i.x.a("Timed out while trying to open db.", th);
    }

    static /* synthetic */ Long N(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private static String O0(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    private static <T> T S0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    static /* synthetic */ Long T(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    static /* synthetic */ Boolean W(b0 b0Var, e.c.b.a.i.m mVar, SQLiteDatabase sQLiteDatabase) {
        Long lQ = b0Var.q(sQLiteDatabase, mVar);
        return lQ == null ? Boolean.FALSE : (Boolean) S0(b0Var.g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lQ.toString()}), u.a());
    }

    static /* synthetic */ List Z(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(e.c.b.a.i.m.a().b(cursor.getString(1)).d(e.c.b.a.i.z.a.b(cursor.getInt(2))).c(C0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    static /* synthetic */ List a0(SQLiteDatabase sQLiteDatabase) {
        return (List) S0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.a());
    }

    static /* synthetic */ List b0(b0 b0Var, e.c.b.a.i.m mVar, SQLiteDatabase sQLiteDatabase) {
        List<i> listV0 = b0Var.v0(sQLiteDatabase, mVar);
        return b0Var.A(listV0, b0Var.y0(sQLiteDatabase, listV0));
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        H0(q.b(sQLiteDatabase), r.a());
    }

    private long d(SQLiteDatabase sQLiteDatabase, e.c.b.a.i.m mVar) {
        Long lQ = q(sQLiteDatabase, mVar);
        if (lQ != null) {
            return lQ.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.b());
        contentValues.put("priority", Integer.valueOf(e.c.b.a.i.z.a.a(mVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (mVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    static /* synthetic */ Object h0(b0 b0Var, List list, e.c.b.a.i.m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            h.a aVarK = e.c.b.a.i.h.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                aVarK.h(new e.c.b.a.i.g(I0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new e.c.b.a.i.g(I0(cursor.getString(4)), b0Var.G0(j2)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j2, mVar, aVarK.d()));
        }
        return null;
    }

    private long i() {
        return g().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long j() {
        return g().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    static /* synthetic */ Object j0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j2 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j2));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j2), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    static /* synthetic */ Long k0(b0 b0Var, e.c.b.a.i.m mVar, e.c.b.a.i.h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.v()) {
            return -1L;
        }
        long jD = b0Var.d(sQLiteDatabase, mVar);
        int iE = b0Var.f14314i.e();
        byte[] bArrA = hVar.e().a();
        boolean z = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jD));
        contentValues.put("transport_name", hVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.k()));
        contentValues.put("payload_encoding", hVar.e().b().a());
        contentValues.put("code", hVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(bArrA.length / iE);
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i2 - 1) * iE, Math.min(i2 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : hVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put(Action.NAME_ATTRIBUTE, entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    static /* synthetic */ byte[] l0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private Long q(SQLiteDatabase sQLiteDatabase, e.c.b.a.i.m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(mVar.b(), String.valueOf(e.c.b.a.i.z.a.a(mVar.d()))));
        if (mVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.c(), 0));
        }
        return (Long) S0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), x.a());
    }

    static /* synthetic */ Object q0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    static /* synthetic */ Object r0(long j2, e.c.b.a.i.m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(e.c.b.a.i.z.a.a(mVar.d()))}) < 1) {
            contentValues.put("backend_name", mVar.b());
            contentValues.put("priority", Integer.valueOf(e.c.b.a.i.z.a.a(mVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private <T> T s(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseG = g();
        sQLiteDatabaseG.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseG);
            sQLiteDatabaseG.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    private boolean v() {
        return i() * j() >= this.f14314i.f();
    }

    private List<i> v0(SQLiteDatabase sQLiteDatabase, e.c.b.a.i.m mVar) {
        ArrayList arrayList = new ArrayList();
        Long lQ = q(sQLiteDatabase, mVar);
        if (lQ == null) {
            return arrayList;
        }
        S0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lQ.toString()}, null, null, null, String.valueOf(this.f14314i.d())), n.a(this, arrayList, mVar));
        return arrayList;
    }

    private Map<Long, Set<c>> y0(SQLiteDatabase sQLiteDatabase, List<i> list) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        S0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", Action.NAME_ATTRIBUTE, "value"}, sb.toString(), null, null, null, null), p.a(map));
        return map;
    }

    @Override // e.c.b.a.i.w.j.c
    public long D0(e.c.b.a.i.m mVar) {
        return ((Long) S0(g().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(e.c.b.a.i.z.a.a(mVar.d()))}), z.a())).longValue();
    }

    @Override // e.c.b.a.i.w.j.c
    public boolean F0(e.c.b.a.i.m mVar) {
        return ((Boolean) s(a0.a(this, mVar))).booleanValue();
    }

    @Override // e.c.b.a.i.w.j.c
    public void G(e.c.b.a.i.m mVar, long j2) {
        s(j.a(j2, mVar));
    }

    @Override // e.c.b.a.i.w.j.c
    public void K0(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            s(y.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + O0(iterable)));
        }
    }

    @Override // e.c.b.a.i.w.j.c
    public Iterable<e.c.b.a.i.m> L() {
        return (Iterable) s(l.a());
    }

    @Override // e.c.b.a.i.x.b
    public <T> T b(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseG = g();
        c(sQLiteDatabaseG);
        try {
            T tExecute = aVar.execute();
            sQLiteDatabaseG.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14311f.close();
    }

    SQLiteDatabase g() {
        h0 h0Var = this.f14311f;
        h0Var.getClass();
        return (SQLiteDatabase) H0(s.b(h0Var), v.a());
    }

    @Override // e.c.b.a.i.w.j.c
    public int l() {
        return ((Integer) s(m.a(this.f14312g.a() - this.f14314i.c()))).intValue();
    }

    @Override // e.c.b.a.i.w.j.c
    public void m(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            g().compileStatement("DELETE FROM events WHERE _id in " + O0(iterable)).execute();
        }
    }

    @Override // e.c.b.a.i.w.j.c
    public Iterable<i> z(e.c.b.a.i.m mVar) {
        return (Iterable) s(k.a(this, mVar));
    }

    @Override // e.c.b.a.i.w.j.c
    public i z0(e.c.b.a.i.m mVar, e.c.b.a.i.h hVar) {
        e.c.b.a.i.u.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.d(), hVar.j(), mVar.b());
        long jLongValue = ((Long) s(w.a(this, mVar, hVar))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return i.a(jLongValue, mVar, hVar);
    }
}