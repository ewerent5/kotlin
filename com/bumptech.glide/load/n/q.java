package com.bumptech.glide.load.n;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: GlideException.java */
/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private static final StackTraceElement[] f3830e = new StackTraceElement[0];

    /* renamed from: f, reason: collision with root package name */
    private final List<Throwable> f3831f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.g f3832g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.a f3833h;

    /* renamed from: i, reason: collision with root package name */
    private Class<?> f3834i;

    /* renamed from: j, reason: collision with root package name */
    private String f3835j;

    /* renamed from: k, reason: collision with root package name */
    private Exception f3836k;

    public q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((q) th).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    private static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) throws IOException {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f3831f;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> listF = f();
        int size = listF.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), listF.get(i2));
            i2 = i3;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3835j);
        sb.append(this.f3834i != null ? ", " + this.f3834i : "");
        sb.append(this.f3833h != null ? ", " + this.f3833h : "");
        sb.append(this.f3832g != null ? ", " + this.f3832g : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb.toString();
        }
        if (listF.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listF.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listF) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(th.getMessage());
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    void i(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.a aVar) {
        j(gVar, aVar, null);
    }

    void j(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f3832g = gVar;
        this.f3833h = aVar;
        this.f3834i = cls;
    }

    public void k(Exception exc) {
        this.f3836k = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        h(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f3835j = str;
        setStackTrace(f3830e);
        this.f3831f = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        h(printWriter);
    }

    /* compiled from: GlideException.java */
    private static final class a implements Appendable {

        /* renamed from: e, reason: collision with root package name */
        private final Appendable f3837e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3838f = true;

        a(Appendable appendable) {
            this.f3837e = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f3838f) {
                this.f3838f = false;
                this.f3837e.append("  ");
            }
            this.f3838f = c2 == '\n';
            this.f3837e.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z = false;
            if (this.f3838f) {
                this.f3838f = false;
                this.f3837e.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f3838f = z;
            this.f3837e.append(charSequenceA, i2, i3);
            return this;
        }
    }
}