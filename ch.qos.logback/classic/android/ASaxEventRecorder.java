package ch.qos.logback.classic.android;

import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.JoranException;
import d.a.b.a.a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class ASaxEventRecorder extends SaxEventRecorder {
    private int[] holderForStartAndLength = new int[2];
    private StatePassFilter filter = new StatePassFilter(new String[0]);
    private String elemNameToWatch = null;
    private Map<String, String> elemAttrs = null;

    static class StatePassFilter {
        private int _depth = 0;
        private final String[] _states;

        public StatePassFilter(String... strArr) {
            this._states = strArr == null ? new String[0] : strArr;
        }

        public boolean checkEnd(String str) {
            int i2 = this._depth;
            if (i2 <= 0 || !str.equals(this._states[i2 - 1])) {
                return this._depth == this._states.length;
            }
            this._depth--;
            return false;
        }

        public boolean checkStart(String str) {
            int i2 = this._depth;
            String[] strArr = this._states;
            if (i2 == strArr.length) {
                return true;
            }
            if (!str.equals(strArr[i2])) {
                return false;
            }
            this._depth++;
            return false;
        }

        public int depth() {
            return this._depth;
        }

        public boolean passed() {
            return this._depth == this._states.length;
        }

        public void reset() {
            this._depth = 0;
        }

        public int size() {
            return this._states.length;
        }
    }

    private void characters(XmlPullParser xmlPullParser) {
        if (this.filter.passed()) {
            char[] textCharacters = xmlPullParser.getTextCharacters(this.holderForStartAndLength);
            int[] iArr = this.holderForStartAndLength;
            super.characters(textCharacters, iArr[0], iArr[1]);
        }
    }

    private void checkForWatchedAttributes(XmlPullParser xmlPullParser) {
        String str;
        int i2;
        if (this.elemNameToWatch != null && this.elemAttrs == null && xmlPullParser.getName().equals(this.elemNameToWatch)) {
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < xmlPullParser.getAttributeCount(); i3++) {
                String attributeNamespace = xmlPullParser.getAttributeNamespace(i3);
                if (attributeNamespace.length() > 0) {
                    int iLastIndexOf = attributeNamespace.lastIndexOf("/");
                    if (iLastIndexOf > -1 && (i2 = iLastIndexOf + 1) < attributeNamespace.length()) {
                        attributeNamespace = attributeNamespace.substring(i2);
                    }
                    str = attributeNamespace + ":";
                } else {
                    str = "";
                }
                map.put(str + xmlPullParser.getAttributeName(i3), xmlPullParser.getAttributeValue(i3));
            }
            this.elemAttrs = map;
        }
    }

    private void endElement(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (this.filter.checkEnd(name)) {
            endElement(xmlPullParser.getNamespace(), name, name);
        }
    }

    private void startDocument(XmlPullParser xmlPullParser) {
        super.startDocument();
        super.setDocumentLocator(new LocatorImpl());
    }

    private void startElement(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (this.filter.checkStart(name)) {
            AttributesImpl attributesImpl = new AttributesImpl();
            for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                attributesImpl.addAttribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeType(i2), xmlPullParser.getAttributeValue(i2));
            }
            startElement(xmlPullParser.getNamespace(), name, name, attributesImpl);
        }
        checkForWatchedAttributes(xmlPullParser);
    }

    public Map<String, String> getAttributeWatchValues() {
        return this.elemAttrs;
    }

    @Override // ch.qos.logback.core.joran.event.SaxEventRecorder
    public List<SaxEvent> recordEvents(InputSource inputSource) throws SAXException, JoranException {
        InputStream byteStream = inputSource.getByteStream();
        if (byteStream == null) {
            throw new IllegalArgumentException("Input source must specify an input stream");
        }
        try {
            XmlPullParser aVar = new a(byteStream);
            this.elemAttrs = null;
            while (true) {
                int next = aVar.next();
                if (next <= -1) {
                    break;
                }
                if (next == 0) {
                    this.filter.reset();
                    startDocument(aVar);
                } else {
                    if (1 == next) {
                        this.filter.reset();
                        endDocument();
                        break;
                    }
                    if (2 == next) {
                        startElement(aVar);
                    } else if (3 == next) {
                        endElement(aVar);
                    } else if (4 == next) {
                        characters(aVar);
                    }
                }
            }
            return getSaxEventList();
        } catch (Exception e2) {
            addError(e2.getMessage(), e2);
            throw new JoranException("Can't parse Android XML resource", e2);
        }
    }

    public void setAttributeWatch(String str) {
        this.elemNameToWatch = str;
    }

    public void setFilter(String... strArr) {
        this.filter = new StatePassFilter(strArr);
    }
}