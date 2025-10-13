package e.f.o;

import com.google.android.gms.ads.AdRequest;
import e.f.l.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LineValidatorAggregator.java */
/* loaded from: classes.dex */
public class b {
    private List<a> a = new ArrayList();

    public void a(String str) throws e {
        if (this.a.isEmpty()) {
            return;
        }
        StringBuilder sb = null;
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(str);
            } catch (e e2) {
                if (sb == null) {
                    sb = new StringBuilder(Math.max((e2.getMessage().length() + 2) * 3, AdRequest.MAX_CONTENT_URL_LENGTH));
                }
                sb.append(e2.getMessage());
                sb.append("\n");
            }
        }
        if (sb != null && sb.length() > 0) {
            throw new e(sb.toString());
        }
    }
}