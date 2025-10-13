package e.c.b.b.c.e;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class w9<FieldDescriptorType> extends t9<FieldDescriptorType, Object> {
    w9(int i2) {
        super(i2, null);
    }

    @Override // e.c.b.b.c.e.t9
    public final void e() {
        if (!i()) {
            for (int i2 = 0; i2 < j(); i2++) {
                Map.Entry<FieldDescriptorType, Object> entryH = h(i2);
                if (((j7) entryH.getKey()).zzd()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                if (((j7) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}