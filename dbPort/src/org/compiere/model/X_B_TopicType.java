/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for B_TopicType
 *  @author Adempiere (generated) 
 *  @version Release 3.2.0 - $Id$ */
public class X_B_TopicType extends PO
{
/** Standard Constructor
@param ctx context
@param B_TopicType_ID id
@param trxName transaction
*/
public X_B_TopicType (Properties ctx, int B_TopicType_ID, String trxName)
{
super (ctx, B_TopicType_ID, trxName);
/** if (B_TopicType_ID == 0)
{
setAuctionType (null);
setB_TopicType_ID (0);
setM_PriceList_ID (0);
setM_ProductMember_ID (0);
setM_Product_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_TopicType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=690 */
public static final int Table_ID=MTable.getTable_ID("B_TopicType");

/** TableName=B_TopicType */
public static final String Table_Name="B_TopicType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_TopicType");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_TopicType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Auction Type.
@param AuctionType Auction Type */
public void setAuctionType (String AuctionType)
{
if (AuctionType == null) throw new IllegalArgumentException ("AuctionType is mandatory.");
if (AuctionType.length() > 1)
{
log.warning("Length > 1 - truncated");
AuctionType = AuctionType.substring(0,0);
}
set_Value ("AuctionType", AuctionType);
}
/** Get Auction Type.
@return Auction Type */
public String getAuctionType() 
{
return (String)get_Value("AuctionType");
}
/** Column name AuctionType */
public static final String COLUMNNAME_AuctionType = "AuctionType";
/** Set Topic Type.
@param B_TopicType_ID Auction Topic Type */
public void setB_TopicType_ID (int B_TopicType_ID)
{
if (B_TopicType_ID < 1) throw new IllegalArgumentException ("B_TopicType_ID is mandatory.");
set_ValueNoCheck ("B_TopicType_ID", Integer.valueOf(B_TopicType_ID));
}
/** Get Topic Type.
@return Auction Topic Type */
public int getB_TopicType_ID() 
{
Integer ii = (Integer)get_Value("B_TopicType_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name B_TopicType_ID */
public static final String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,1999);
}
set_Value ("Help", Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
return (String)get_Value("Help");
}
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set Price List.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_Value ("M_PriceList_ID", Integer.valueOf(M_PriceList_ID));
}
/** Get Price List.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value("M_PriceList_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";

/** M_ProductMember_ID AD_Reference_ID=162 */
public static final int M_PRODUCTMEMBER_ID_AD_Reference_ID=162;
/** Set Membership.
@param M_ProductMember_ID Product used to deternine the price of the membership for the topic type */
public void setM_ProductMember_ID (int M_ProductMember_ID)
{
if (M_ProductMember_ID < 1) throw new IllegalArgumentException ("M_ProductMember_ID is mandatory.");
set_Value ("M_ProductMember_ID", Integer.valueOf(M_ProductMember_ID));
}
/** Get Membership.
@return Product used to deternine the price of the membership for the topic type */
public int getM_ProductMember_ID() 
{
Integer ii = (Integer)get_Value("M_ProductMember_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_ProductMember_ID */
public static final String COLUMNNAME_M_ProductMember_ID = "M_ProductMember_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_Value ("M_Product_ID", Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value("M_Product_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
