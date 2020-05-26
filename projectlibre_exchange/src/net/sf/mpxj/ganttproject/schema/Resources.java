//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.12.28 at 05:49:44 PM GMT
//

package net.sf.mpxj.ganttproject.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for resources complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custom-property-definition" type="{}custom-property-definition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resource" type="{}resource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "resources", propOrder =
{
   "customPropertyDefinition",
   "resource"
}) public class Resources
{

   @XmlElement(name = "custom-property-definition") protected List<CustomPropertyDefinition> customPropertyDefinition;
   protected List<Resource> resource;

   /**
    * Gets the value of the customPropertyDefinition property.
    * 
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the customPropertyDefinition property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getCustomPropertyDefinition().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link CustomPropertyDefinition }
    * 
    * 
    */
   public List<CustomPropertyDefinition> getCustomPropertyDefinition()
   {
      if (customPropertyDefinition == null)
      {
         customPropertyDefinition = new ArrayList<CustomPropertyDefinition>();
      }
      return this.customPropertyDefinition;
   }

   /**
    * Gets the value of the resource property.
    * 
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the resource property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getResource().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Resource }
    * 
    * 
    */
   public List<Resource> getResource()
   {
      if (resource == null)
      {
         resource = new ArrayList<Resource>();
      }
      return this.resource;
   }

}