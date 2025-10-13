package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0032a extends a {
            private final e a;

            public C0032a() {
                this(e.f2122b);
            }

            public e e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0032a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0032a) obj).a);
            }

            public int hashCode() {
                return (C0032a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + CoreConstants.CURLY_RIGHT;
            }

            public C0032a(e eVar) {
                this.a = eVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            private final e a;

            public c() {
                this(e.f2122b);
            }

            public e e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + CoreConstants.CURLY_RIGHT;
            }

            public c(e eVar) {
                this.a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0032a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public final UUID getId() {
        return this.mWorkerParams.b();
    }

    public final e getInputData() {
        return this.mWorkerParams.c();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.d();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f();
    }

    public androidx.work.impl.utils.k.a getTaskExecutor() {
        return this.mWorkerParams.g();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.h();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.i();
    }

    public q getWorkerFactory() {
        return this.mWorkerParams.j();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract e.c.c.a.a.a<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}