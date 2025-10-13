package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers.java */
/* loaded from: classes.dex */
public final class d {
    private final Set<a> a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    public static final class a {
        private final Uri a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2121b;

        a(Uri uri, boolean z) {
            this.a = uri;
            this.f2121b = z;
        }

        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.f2121b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2121b == aVar.f2121b && this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.f2121b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z) {
        this.a.add(new a(uri, z));
    }

    public Set<a> b() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}