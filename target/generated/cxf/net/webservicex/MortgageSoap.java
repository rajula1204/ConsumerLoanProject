package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-11-30T13:11:42.585+05:30
 * Generated source version: 3.0.3
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "MortgageSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface MortgageSoap {

    /**
     * Use this Web service to figure out your monthly mortgage payment
     * 			
     */
    @WebResult(name = "GetMortgagePaymentResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "GetMortgagePayment", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.GetMortgagePayment")
    @WebMethod(operationName = "GetMortgagePayment", action = "http://www.webserviceX.NET/GetMortgagePayment")
    @ResponseWrapper(localName = "GetMortgagePaymentResponse", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.GetMortgagePaymentResponse")
    public net.webservicex.MortgageResults getMortgagePayment(
        @WebParam(name = "Years", targetNamespace = "http://www.webserviceX.NET/")
        int years,
        @WebParam(name = "Interest", targetNamespace = "http://www.webserviceX.NET/")
        double interest,
        @WebParam(name = "LoanAmount", targetNamespace = "http://www.webserviceX.NET/")
        double loanAmount,
        @WebParam(name = "AnnualTax", targetNamespace = "http://www.webserviceX.NET/")
        double annualTax,
        @WebParam(name = "AnnualInsurance", targetNamespace = "http://www.webserviceX.NET/")
        double annualInsurance
    );
}