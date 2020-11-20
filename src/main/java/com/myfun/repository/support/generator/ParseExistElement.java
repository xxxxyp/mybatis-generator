package com.myfun.repository.support.generator;

import org.jdom.Content;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
@Deprecated
public class ParseExistElement {

    public static void main(String[] args) {

    }


    public void addCustomizedElement(String xmlPath, XmlElement mapper) {

        List<String> inner = Arrays.asList("countByExample", "deleteByExample", "deleteByPrimaryKey", "insert", "insertSelective", "selectAll", "selectByExample"
                , "selectByExampleWithBLOBs", "selectByPrimaryKey", "updateByExample", "updateByExampleSelective", "updateByExampleWithBLOBs", "updateByPrimaryKey",
                "updateByPrimaryKeySelective", "updateByPrimaryKeyWithBLOBs", "BaseResultMap", "ResultMapWithBLOBs", "Example_Where_Clause", "Base_Column_List",
                "Blob_Column_List", "Update_By_Example_Where_Clause");


        List<Element> elements = mapper.getElements();
        HashSet<String> mapperMethodNames = new HashSet<>(inner);
        for (Element element : elements) {
            XmlElement xmlElement = (XmlElement) element;
            List<Attribute> attributes = xmlElement.getAttributes();
            for (Attribute attribute : attributes) {
                String name = attribute.getName();
                if (!"id".equals(name)) {
                    mapperMethodNames.add(attribute.getValue());
                }
            }
        }
        //
        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            //2.创建输入流
            InputStream is = new FileInputStream(new File(xmlPath));
            //3.将输入流加载到build中
            Document document = saxBuilder.build(is);
            //4.获取根节点
            org.jdom.Element rootElement = document.getRootElement();
            //5.获取子节点
            List<org.jdom.Element> children = rootElement.getChildren();
            for (org.jdom.Element child : children) {
                org.jdom.Attribute id = child.getAttribute("id");
                if (Objects.isNull(id)) { continue; }
                if(mapperMethodNames.contains(id.getValue())){ continue; }
                XmlElement customizedMethod = new XmlElement(child.getName());
                parseCustomizedEle(customizedMethod, child);
                mapper.addElement(customizedMethod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void parseCustomizedEle(XmlElement customizedMethod, org.jdom.Element child) {
        //attribute
        List<org.jdom.Attribute> attributes = child.getAttributes();
        for (org.jdom.Attribute attribute : attributes) {
            customizedMethod.addAttribute(new Attribute(attribute.getName(),attribute.getValue()));
        }
        //content
        List content = child.getContent();
        System.out.println(content);
        Content content1 = child.getContent(0);
        String s = content1.getValue();
        s = s.replaceAll("^\n\\s{0,4}", "");
        s = s.replaceAll("\n\\s*$", "");
        TextElement textElement = new TextElement(s);
        customizedMethod.addElement(textElement);
        System.out.println(customizedMethod.getFormattedContent(0));
    }


}
