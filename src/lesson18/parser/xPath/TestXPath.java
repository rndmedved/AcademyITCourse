package lesson18.parser.xPath;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestXPath {
    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
        var factory = XPathFactory.newInstance();
        var xPath = factory.newXPath();
        var query = xPath.compile("//book[@id=1]");
       NodeList nodeList = (NodeList) xPath.evaluate("//book[@id = 1]",new InputSource(new FileReader("./src/books.xml")), XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodeName());
            System.out.println(nodeList.item(i).);
        }
    }
}
