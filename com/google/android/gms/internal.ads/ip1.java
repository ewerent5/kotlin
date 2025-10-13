package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.ads.internal.util.zzbk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ip1 {
    public final List<xo1> a;

    /* renamed from: b, reason: collision with root package name */
    public final ap1 f6562b;

    /* renamed from: c, reason: collision with root package name */
    public final List<hp1> f6563c;

    ip1(JsonReader jsonReader) throws IOException {
        List<xo1> listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ap1 ap1Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new xo1(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        ap1Var = new ap1(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzc = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (Action.NAME_ATTRIBUTE.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzc = zzbk.zzc(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new hp1(strNextString, jSONObjectZzc));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f6563c = arrayList;
        this.a = listEmptyList;
        this.f6562b = ap1Var == null ? new ap1(new JsonReader(new StringReader("{}"))) : ap1Var;
    }

    public static ip1 a(Reader reader) throws IOException {
        try {
            try {
                return new ip1(new JsonReader(reader));
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e2) {
                throw new bp1("unable to parse ServerResponse", e2);
            }
        } finally {
            com.google.android.gms.common.util.l.a(reader);
        }
    }
}