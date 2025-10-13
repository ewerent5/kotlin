package ch.qos.logback.core.pattern.parser;

/* loaded from: classes.dex */
public class CompositeNode extends SimpleKeywordNode {
    Node childNode;

    CompositeNode(String str) {
        super(2, str);
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof CompositeNode)) {
            return false;
        }
        Node node = this.childNode;
        Node node2 = ((CompositeNode) obj).childNode;
        return node != null ? node.equals(node2) : node2 == null;
    }

    public Node getChildNode() {
        return this.childNode;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setChildNode(Node node) {
        this.childNode = node;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.childNode != null) {
            str = "CompositeNode(" + this.childNode + ")";
        } else {
            str = "CompositeNode(no child)";
        }
        stringBuffer.append(str);
        stringBuffer.append(printNext());
        return stringBuffer.toString();
    }
}