//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.10.22 at 02:49:21 PM BST
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("all") public class Adapter3 extends XmlAdapter<String, String>
{

   public String unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseString(value));
   }

   public String marshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printString(value));
   }

}
