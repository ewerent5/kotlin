package com.google.firebase.k.h;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.k.f;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes.dex */
final class e implements com.google.firebase.k.d, f {
    private e a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12878b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f12879c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.k.c<?>> f12880d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.k.e<?>> f12881e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.k.c<Object> f12882f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12883g;

    e(Writer writer, Map<Class<?>, com.google.firebase.k.c<?>> map, Map<Class<?>, com.google.firebase.k.e<?>> map2, com.google.firebase.k.c<Object> cVar, boolean z) {
        this.f12879c = new JsonWriter(writer);
        this.f12880d = map;
        this.f12881e = map2;
        this.f12882f = cVar;
        this.f12883g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) throws IOException {
        v();
        this.f12879c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.f12879c.nullValue();
        return this;
    }

    private e u(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        v();
        this.f12879c.name(str);
        return i(obj, false);
    }

    private void v() throws IOException {
        if (!this.f12878b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.a;
        if (eVar != null) {
            eVar.v();
            this.a.f12878b = false;
            this.a = null;
            this.f12879c.endObject();
        }
    }

    public e g(int i2) throws IOException {
        v();
        this.f12879c.value(i2);
        return this;
    }

    public e h(long j2) throws IOException {
        v();
        this.f12879c.value(j2);
        return this;
    }

    e i(Object obj, boolean z) throws IOException {
        int i2 = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new com.google.firebase.k.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f12879c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f12879c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f12879c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(it.next(), false);
                }
                this.f12879c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f12879c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new com.google.firebase.k.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f12879c.endObject();
                return this;
            }
            com.google.firebase.k.c<?> cVar = this.f12880d.get(obj.getClass());
            if (cVar != null) {
                return s(cVar, obj, z);
            }
            com.google.firebase.k.e<?> eVar = this.f12881e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return s(this.f12882f, obj, z);
            }
            d(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return p((byte[]) obj);
        }
        this.f12879c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                this.f12879c.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                h(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.f12879c.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.f12879c.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                i(obj2, false);
            }
        }
        this.f12879c.endArray();
        return this;
    }

    @Override // com.google.firebase.k.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e d(String str) throws IOException {
        v();
        this.f12879c.value(str);
        return this;
    }

    @Override // com.google.firebase.k.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e c(String str, int i2) throws IOException {
        v();
        this.f12879c.name(str);
        return g(i2);
    }

    @Override // com.google.firebase.k.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e b(String str, long j2) throws IOException {
        v();
        this.f12879c.name(str);
        return h(j2);
    }

    @Override // com.google.firebase.k.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e f(String str, Object obj) {
        return this.f12883g ? u(str, obj) : t(str, obj);
    }

    @Override // com.google.firebase.k.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e a(String str, boolean z) throws IOException {
        v();
        this.f12879c.name(str);
        return e(z);
    }

    @Override // com.google.firebase.k.f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e e(boolean z) throws IOException {
        v();
        this.f12879c.value(z);
        return this;
    }

    public e p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.f12879c.nullValue();
        } else {
            this.f12879c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void r() throws IOException {
        v();
        this.f12879c.flush();
    }

    e s(com.google.firebase.k.c<Object> cVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f12879c.beginObject();
        }
        cVar.a(obj, this);
        if (!z) {
            this.f12879c.endObject();
        }
        return this;
    }
}