package androidx.work.impl.l;

import androidx.work.d;
import androidx.work.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* compiled from: WorkTypeConverters.java */
/* loaded from: classes.dex */
public class p {

    /* compiled from: WorkTypeConverters.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2339b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f2340c;

        static {
            int[] iArr = new int[androidx.work.i.values().length];
            f2340c = iArr;
            try {
                iArr[androidx.work.i.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2340c[androidx.work.i.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2340c[androidx.work.i.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2340c[androidx.work.i.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2340c[androidx.work.i.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[androidx.work.a.values().length];
            f2339b = iArr2;
            try {
                iArr2[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2339b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[n.a.values().length];
            a = iArr3;
            try {
                iArr3[n.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[n.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[n.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[n.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[n.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[n.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static int a(androidx.work.a aVar) {
        int i2 = a.f2339b[aVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.d b(byte[] r6) throws java.lang.Throwable {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.l.p.b(byte[]):androidx.work.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please report as a decompilation issue!!! */
    public static byte[] c(androidx.work.d dVar) throws Throwable {
        boolean zHasNext;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream = null;
        if (dVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
            objectOutputStream = objectOutputStream;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(dVar.c());
                    Iterator<d.a> it = dVar.b().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        if (zHasNext != 0) {
                            d.a next = it.next();
                            objectOutputStream3.writeUTF(next.a().toString());
                            objectOutputStream3.writeBoolean(next.b());
                        } else {
                            try {
                                break;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream3.close();
                    byteArrayOutputStream.close();
                    objectOutputStream = zHasNext;
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream2 = objectOutputStream3;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream = objectOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static androidx.work.a d(int i2) {
        if (i2 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i2 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    public static androidx.work.i e(int i2) {
        if (i2 == 0) {
            return androidx.work.i.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return androidx.work.i.CONNECTED;
        }
        if (i2 == 2) {
            return androidx.work.i.UNMETERED;
        }
        if (i2 == 3) {
            return androidx.work.i.NOT_ROAMING;
        }
        if (i2 == 4) {
            return androidx.work.i.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    public static n.a f(int i2) {
        if (i2 == 0) {
            return n.a.ENQUEUED;
        }
        if (i2 == 1) {
            return n.a.RUNNING;
        }
        if (i2 == 2) {
            return n.a.SUCCEEDED;
        }
        if (i2 == 3) {
            return n.a.FAILED;
        }
        if (i2 == 4) {
            return n.a.BLOCKED;
        }
        if (i2 == 5) {
            return n.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    public static int g(androidx.work.i iVar) {
        int i2 = a.f2340c[iVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5) {
            return 4;
        }
        throw new IllegalArgumentException("Could not convert " + iVar + " to int");
    }

    public static int h(n.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}