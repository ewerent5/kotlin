package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.g0;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: e, reason: collision with root package name */
    int f1787e = 0;

    /* renamed from: f, reason: collision with root package name */
    final HashMap<Integer, String> f1788f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    final RemoteCallbackList<f0> f1789g = new a();

    /* renamed from: h, reason: collision with root package name */
    private final g0.a f1790h = new b();

    class a extends RemoteCallbackList<f0> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(f0 f0Var, Object obj) {
            MultiInstanceInvalidationService.this.f1788f.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends g0.a {
        b() {
        }

        @Override // androidx.room.g0
        public int e1(f0 f0Var, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1789g) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f1787e + 1;
                multiInstanceInvalidationService.f1787e = i2;
                if (multiInstanceInvalidationService.f1789g.register(f0Var, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f1788f.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1787e--;
                return 0;
            }
        }

        @Override // androidx.room.g0
        public void e4(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1789g) {
                String str = MultiInstanceInvalidationService.this.f1788f.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f1789g.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f1789g.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1788f.get(Integer.valueOf(iIntValue));
                        if (i2 != iIntValue && str.equals(str2)) {
                            try {
                                ((f0) MultiInstanceInvalidationService.this.f1789g.getBroadcastItem(i3)).L0(strArr);
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f1789g.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.g0
        public void x4(f0 f0Var, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f1789g) {
                MultiInstanceInvalidationService.this.f1789g.unregister(f0Var);
                MultiInstanceInvalidationService.this.f1788f.remove(Integer.valueOf(i2));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1790h;
    }
}