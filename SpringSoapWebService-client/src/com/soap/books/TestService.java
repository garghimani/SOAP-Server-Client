/**
 * TestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.books;

public interface TestService extends java.rmi.Remote {
    public void createBook(com.soap.books.vo.Books book) throws java.rmi.RemoteException;
    public void updateBooks(com.soap.books.vo.Books book) throws java.rmi.RemoteException;
    public void deleteBooks(int bookid) throws java.rmi.RemoteException;
    public com.soap.books.vo.Books getBooks(int bookid) throws java.rmi.RemoteException;
}
