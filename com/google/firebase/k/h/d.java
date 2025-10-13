package com.google.firebase.k.h;

import com.google.firebase.k.f;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes.dex */
public final class d implements com.google.firebase.k.g.b<d> {
    private static final com.google.firebase.k.c<Object> a = com.google.firebase.k.h.a.b();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.k.e<String> f12871b = com.google.firebase.k.h.b.b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.k.e<Boolean> f12872c = c.b();

    /* renamed from: d, reason: collision with root package name */
    private static final b f12873d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.k.c<?>> f12874e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.k.e<?>> f12875f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.k.c<Object> f12876g = a;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12877h = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    class a implements com.google.firebase.k.a {
        a() {
        }

        @Override // com.google.firebase.k.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f12874e, d.this.f12875f, d.this.f12876g, d.this.f12877h);
            eVar.i(obj, false);
            eVar.r();
        }

        @Override // com.google.firebase.k.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    private static final class b implements com.google.firebase.k.e<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // com.google.firebase.k.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, f fVar) {
            fVar.d(a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f12871b);
        m(Boolean.class, f12872c);
        m(Date.class, f12873d);
    }

    static /* synthetic */ void i(Object obj, com.google.firebase.k.d dVar) {
        throw new com.google.firebase.k.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public com.google.firebase.k.a f() {
        return new a();
    }

    public d g(com.google.firebase.k.g.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z) {
        this.f12877h = z;
        return this;
    }

    @Override // com.google.firebase.k.g.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, com.google.firebase.k.c<? super T> cVar) {
        this.f12874e.put(cls, cVar);
        this.f12875f.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, com.google.firebase.k.e<? super T> eVar) {
        this.f12875f.put(cls, eVar);
        this.f12874e.remove(cls);
        return this;
    }
}