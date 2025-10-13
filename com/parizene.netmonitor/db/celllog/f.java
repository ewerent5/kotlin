package com.parizene.netmonitor.db.celllog;

import android.util.Xml;
import ch.qos.logback.core.joran.action.Action;
import com.parizene.netmonitor.j0;
import java.io.IOException;
import java.io.OutputStream;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: KmlCreator.java */
/* loaded from: classes.dex */
public class f {
    private XmlSerializer a;

    public f(OutputStream outputStream) throws IllegalStateException, IOException, IllegalArgumentException {
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        this.a = xmlSerializerNewSerializer;
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        this.a.setOutput(outputStream, "UTF-8");
        this.a.startDocument("UTF-8", Boolean.TRUE);
    }

    public static String e(int i2) {
        byte[] bArrF = j0.f(i2);
        return String.format("%x", Integer.valueOf((bArrF[0] << 24) + ((bArrF[3] & 255) << 16) + ((bArrF[2] & 255) << 8) + (bArrF[1] & 255)));
    }

    protected void a(String str, String str2, String str3, String str4) throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "Style").attribute(null, "id", str).startTag(null, "IconStyle").startTag(null, "color").text(str2).endTag(null, "color").startTag(null, "scale").text(str3).endTag(null, "scale").startTag(null, "Icon").startTag(null, "href").text(str4).endTag(null, "href").endTag(null, "Icon").endTag(null, "IconStyle").endTag(null, "Style");
    }

    protected void b(String str, String str2, String str3) throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "Placemark").startTag(null, Action.NAME_ATTRIBUTE).text(str).endTag(null, Action.NAME_ATTRIBUTE).startTag(null, "styleUrl").text("#" + str2).endTag(null, "styleUrl").startTag(null, "LineString").startTag(null, "coordinates").text(str3).endTag(null, "coordinates").endTag(null, "LineString").endTag(null, "Placemark");
    }

    protected void c(String str, String str2, String str3, String str4, String str5) throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "Style").attribute(null, "id", str).startTag(null, "LineStyle").startTag(null, "color").text(str2).endTag(null, "color").startTag(null, "width").text(str3).endTag(null, "width").startTag(null, "gx:outerColor").text(str4).endTag(null, "gx:outerColor").startTag(null, "gx:outerWidth").text(str5).endTag(null, "gx:outerWidth").endTag(null, "LineStyle").endTag(null, "Style");
    }

    protected void d(String str, String str2, String str3, String str4) throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "Placemark").startTag(null, Action.NAME_ATTRIBUTE).text(str).endTag(null, Action.NAME_ATTRIBUTE).startTag(null, "description").text(str2).endTag(null, "description").startTag(null, "styleUrl").text("#" + str3).endTag(null, "styleUrl").startTag(null, "Point").startTag(null, "coordinates").text(str4).endTag(null, "coordinates").endTag(null, "Point").endTag(null, "Placemark");
    }

    public void f() throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.endDocument();
        this.a.flush();
    }

    protected void g() throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.endTag(null, "Document");
    }

    protected void h() throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.endTag(null, "Folder");
    }

    protected void i() throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.endTag(null, "kml");
    }

    protected void j(String str, boolean z) throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "Document").startTag(null, "open").text(z ? "1" : "0").endTag(null, "open").startTag(null, Action.NAME_ATTRIBUTE).text(str).endTag(null, Action.NAME_ATTRIBUTE);
    }

    protected void k(String str, boolean z) throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "Folder").startTag(null, "open").text(z ? "1" : "0").endTag(null, "open").startTag(null, Action.NAME_ATTRIBUTE).text(str).endTag(null, Action.NAME_ATTRIBUTE);
    }

    protected void l() throws IllegalStateException, IOException, IllegalArgumentException {
        this.a.startTag(null, "kml").attribute(null, "xmlns", "http://www.opengis.net/kml/2.2").attribute(null, "xmlns:gx", "http://www.google.com/kml/ext/2.2").attribute(null, "xmlns:kml", "http://www.opengis.net/kml/2.2").attribute(null, "xmlns:atom", "http://www.w3.org/2005/Atom");
    }
}