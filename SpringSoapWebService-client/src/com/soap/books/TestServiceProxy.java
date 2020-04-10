package com.soap.books;

public class TestServiceProxy implements com.soap.books.TestService {
  private String _endpoint = null;
  private com.soap.books.TestService testService = null;
  
  public TestServiceProxy() {
    _initTestServiceProxy();
  }
  
  public TestServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestServiceProxy();
  }
  
  private void _initTestServiceProxy() {
    try {
      testService = (new com.soap.books.TestServiceServiceLocator()).getTestService();
      if (testService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testService != null)
      ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soap.books.TestService getTestService() {
    if (testService == null)
      _initTestServiceProxy();
    return testService;
  }
  
  public void createBook(com.soap.books.vo.Books book) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    testService.createBook(book);
  }
  
  public void updateBooks(com.soap.books.vo.Books book) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    testService.updateBooks(book);
  }
  
  public void deleteBooks(int bookid) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    testService.deleteBooks(bookid);
  }
  
  public com.soap.books.vo.Books getBooks(int bookid) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.getBooks(bookid);
  }
  
  
}