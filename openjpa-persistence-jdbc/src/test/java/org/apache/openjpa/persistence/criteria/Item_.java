/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.Map;

@javax.persistence.metamodel.TypesafeMetamodel(
    value=org.apache.openjpa.persistence.criteria.Item.class)
public class Item_ {
    public static volatile Attribute<Item,Integer> id;
    public static volatile Attribute<Item,String> name;
    public static volatile Map<Item,String,Photo> photos;
}
