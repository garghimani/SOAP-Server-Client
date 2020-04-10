/**
 * Books.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.books.vo;

public class Books  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String author;

    private java.lang.String bookName;

    private int bookid;

    private java.lang.String category;

    private int noOfCopies;

    public Books() {
    }

    public Books(
           java.lang.String author,
           java.lang.String bookName,
           int bookid,
           java.lang.String category,
           int noOfCopies) {
           this.author = author;
           this.bookName = bookName;
           this.bookid = bookid;
           this.category = category;
           this.noOfCopies = noOfCopies;
    }


    /**
     * Gets the author value for this Books.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Books.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the bookName value for this Books.
     * 
     * @return bookName
     */
    public java.lang.String getBookName() {
        return bookName;
    }


    /**
     * Sets the bookName value for this Books.
     * 
     * @param bookName
     */
    public void setBookName(java.lang.String bookName) {
        this.bookName = bookName;
    }


    /**
     * Gets the bookid value for this Books.
     * 
     * @return bookid
     */
    public int getBookid() {
        return bookid;
    }


    /**
     * Sets the bookid value for this Books.
     * 
     * @param bookid
     */
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }


    /**
     * Gets the category value for this Books.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Books.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the noOfCopies value for this Books.
     * 
     * @return noOfCopies
     */
    public int getNoOfCopies() {
        return noOfCopies;
    }


    /**
     * Sets the noOfCopies value for this Books.
     * 
     * @param noOfCopies
     */
    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Books)) return false;
        Books other = (Books) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.bookName==null && other.getBookName()==null) || 
             (this.bookName!=null &&
              this.bookName.equals(other.getBookName()))) &&
            this.bookid == other.getBookid() &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            this.noOfCopies == other.getNoOfCopies();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getBookName() != null) {
            _hashCode += getBookName().hashCode();
        }
        _hashCode += getBookid();
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        _hashCode += getNoOfCopies();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Books.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.books.soap.com", "Books"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.books.soap.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.books.soap.com", "bookName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.books.soap.com", "bookid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.books.soap.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.books.soap.com", "noOfCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
