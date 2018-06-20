/**
 * APIServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class APIServiceSoapStub extends org.apache.axis.client.Stub implements net.docusign.www.API._3_0.APIServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[75];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"), net.docusign.www.API._3_0.Envelope.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAndSendEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"), net.docusign.www.API._3_0.Envelope.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateAndSendEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SendEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CorrectAndResendEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Correction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Correction"), net.docusign.www.API._3_0.Correction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectionStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.CorrectionStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectAndResendEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestPDFNoWaterMark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopePDF.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFNoWaterMarkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestPDFWithOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFOptions"), net.docusign.www.API._3_0.PDFOptions.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopePDF.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFWithOptionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestPDFRecipientsView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFOptions"), net.docusign.www.API._3_0.PDFOptions.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopePDF.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFRecipientsViewResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestPDFsWithOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFsOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFsOptions"), net.docusign.www.API._3_0.PDFsOptions.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocumentPDFs.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFsWithOptionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestPDF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopePDF.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestPDFWithCert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddWaterMark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopePDF.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFWithCertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestCertificate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocumentPDFs.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCertificateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestCertificateWithCertLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CertLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocumentPDFs.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCertificateWithCertLanguageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestDocumentPDFs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocumentPDFs.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestDocumentPDFsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestDocumentPDFsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocumentPDFs.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestDocumentPDFsExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestDocumentPDFsRecipientsView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocumentPDFs.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestDocumentPDFsRecipientsViewResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatusEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatusWithDocumentFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusWithDocumentFieldsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatusCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), net.docusign.www.API._3_0.EnvelopeStatusFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatusChanges"));
        oper.setReturnClass(net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusCodesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatusChanges");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChangeFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChangeFilter"), net.docusign.www.API._3_0.EnvelopeStatusChangeFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatusChanges"));
        oper.setReturnClass(net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusChangesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatusesEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), net.docusign.www.API._3_0.EnvelopeStatusFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatuses"));
        oper.setReturnClass(net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusesExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), net.docusign.www.API._3_0.EnvelopeStatusFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatuses"));
        oper.setReturnClass(net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestStatusesWithDocumentFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"), net.docusign.www.API._3_0.EnvelopeStatusFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatuses"));
        oper.setReturnClass(net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusesWithDocumentFieldsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRecipientEsignList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderAccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEsignList"));
        oper.setReturnClass(net.docusign.www.API._3_0.RecipientEsignList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientEsignListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRecipientList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderAccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientList"));
        oper.setReturnClass(net.docusign.www.API._3_0.RecipientList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAccountBrands");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandDeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandDeleteRequest"), net.docusign.www.API._3_0.BrandDeleteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResults"));
        oper.setReturnClass(net.docusign.www.API._3_0.BrandResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteAccountBrandsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAccountBrands");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandDefinitions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandDefinitions"), net.docusign.www.API._3_0.BrandDefinitions.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResults"));
        oper.setReturnClass(net.docusign.www.API._3_0.BrandResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateAccountBrandsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountBrands");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResults"));
        oper.setReturnClass(net.docusign.www.API._3_0.BrandResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAccountBrandsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRecipientAuthenticationStatusEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientAuthenticationStatusExArg"), net.docusign.www.API._3_0.GetRecipientAuthenticationStatusExArg.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.AuthenticationStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientAuthenticationStatusExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoidEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VoidEnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.VoidEnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VoidEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveEnvelopes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MoveEnvelopesArg"), net.docusign.www.API._3_0.MoveEnvelopesArg.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MoveEnvelopesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteEnvelopes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteEnvelopesArg"), net.docusign.www.API._3_0.DeleteEnvelopesArg.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteEnvelopesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCaptiveRecipientsSignatures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteCaptiveRecipientsSignaturesArg"), net.docusign.www.API._3_0.DeleteCaptiveRecipientsSignaturesArg.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipientResults"));
        oper.setReturnClass(net.docusign.www.API._3_0.CaptiveRecipientResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteCaptiveRecipientsSignaturesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestRecipientToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertion"), net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientURLs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenClientURLs"), net.docusign.www.API._3_0.RequestRecipientTokenClientURLs.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestRecipientFaxToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertion"), net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientURLs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenClientURLs"), net.docusign.www.API._3_0.RequestRecipientTokenClientURLs.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientFaxTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestRecipientFaxPDF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertion"), net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopePDF.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientFaxPDFResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransferEnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.TransferEnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransferEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountMembershipFeaturesList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountMembershipFeaturesList"));
        oper.setReturnClass(net.docusign.www.API._3_0.AccountMembershipFeaturesList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAccountMembershipFeaturesListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountSettingsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountSettingsList"));
        oper.setReturnClass(net.docusign.www.API._3_0.AccountSetting[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAccountSettingsListResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountSetting"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompleteAuthoritativeCopyExport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExternalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompleteAuthoritativeCopyExportResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAuthoritativeCopyExportKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "checkSumHash"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAuthoritativeCopyExportKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcknowledgeAuthoritativeCopyExport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "checkSumHash"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AcknowledgeAuthoritativeCopyExportResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExportAuthoritativeCopy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportDocuments"));
        oper.setReturnClass(net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExportAuthoritativeCopyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnvelopeAuditEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">>EnvelopeAuditEventsResponse>EnvelopeAuditEventsResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnvelopeAuditEventsV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeAuditEvent"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeAuditEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEventsV2Result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestEnvelopeHistoryToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeHistoryTokenArg"), net.docusign.www.API._3_0.RequestEnvelopeHistoryTokenArg.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeHistoryTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateEnvelopeFromTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferences"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfTemplateReference"), net.docusign.www.API._3_0.TemplateReference[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipients"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipient1"), net.docusign.www.API._3_0.Recipient[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"), net.docusign.www.API._3_0.EnvelopeInformation.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ActivateEnvelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeFromTemplatesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateEnvelopeFromTemplatesAndForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"), net.docusign.www.API._3_0.EnvelopeInformation.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfCompositeTemplate"), net.docusign.www.API._3_0.CompositeTemplate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ActivateEnvelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeFromTemplatesAndFormsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusInDocuSignConnectFormat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocuSignEnvelopeInformation"));
        oper.setReturnClass(net.docusign.www.API._3_0.DocuSignEnvelopeInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetStatusInDocuSignConnectFormatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PurgeDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.PurgeDocumentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PurgeDocumentsAndMetaData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.PurgeDocumentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentsAndMetaDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"), net.docusign.www.API._3_0.EnvelopeTemplate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SaveTemplateResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.SaveTemplateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SaveTemplateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SaveTemplateResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.SaveTemplateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UploadTemplateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeAdvancedTemplates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplates"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeTemplateDefinition[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplatesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeTemplate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTemplateList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString5"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeTemplate"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeTemplate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateListResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTemplateWithDocumentFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeTemplate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateWithDocumentFieldsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTemplateListWithDocumentFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString5"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeTemplate"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeTemplate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateListWithDocumentFieldsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAuthenticationToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GoToEnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAuthenticationTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAddressBookItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAddressBookItem"));
        oper.setReturnClass(net.docusign.www.API._3_0.AddressBookItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAddressBookItemsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAddressBookItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAddressBookItem"), net.docusign.www.API._3_0.AddressBookItem[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReturnAddressBook"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UpdateAddressBookResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.UpdateAddressBookResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UpdateAddressBookItemsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveAddressBookItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAddressBookRemoveItem"), net.docusign.www.API._3_0.AddressBookRemoveItem[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReturnAddressBook"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UpdateAddressBookResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.UpdateAddressBookResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RemoveAddressBookItemsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynchEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Block"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelopeStatus"));
        oper.setReturnClass(net.docusign.www.API._3_0.SynchEnvelopeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestSenderToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReturnURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestSenderTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestCorrectToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SuppressNavigation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReturnURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCorrectTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFolderItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderFilter"), net.docusign.www.API._3_0.FolderFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderResults"));
        oper.setReturnClass(net.docusign.www.API._3_0.FolderResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetFolderItemsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFolderList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FoldersFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FoldersFilter"), net.docusign.www.API._3_0.FoldersFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AvailableFolders"));
        oper.setReturnClass(net.docusign.www.API._3_0.AvailableFolders.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetFolderListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"));
        oper.setReturnClass(net.docusign.www.API._3_0.Envelope.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestEnvelopeWithDocumentFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"));
        oper.setReturnClass(net.docusign.www.API._3_0.Envelope.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestEnvelopeWithDocumentFieldsV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsV2Options"), net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFieldsV2Options.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeV2"));
        oper.setReturnClass(net.docusign.www.API._3_0.EnvelopeV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsV2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConnectFailures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailuresFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailuresFilter"), net.docusign.www.API._3_0.ConnectFailuresFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfConnectFailure"));
        oper.setReturnClass(net.docusign.www.API._3_0.ConnectFailure[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetConnectFailuresResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailure"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PublishConnectFailures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresFilter"), net.docusign.www.API._3_0.PublishConnectFailuresFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfPublishConnectFailuresResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.PublishConnectFailuresResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSharedAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessFilter"), net.docusign.www.API._3_0.SharedAccessFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccessResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.GetSharedAccessResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccessResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetSharedAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessRequest"), net.docusign.www.API._3_0.SetSharedAccessRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessResult"));
        oper.setReturnClass(net.docusign.www.API._3_0.SetSharedAccessResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

    }

    public APIServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public APIServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public APIServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">>EnvelopeAuditEventsResponse>EnvelopeAuditEventsResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplates");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CreateEnvelopeFromTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplatesAndForms");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CreateEnvelopeFromTemplatesAndForms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplatesAndFormsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CreateEnvelopeFromTemplatesAndFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CreateEnvelopeFromTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">EnvelopeAuditEventsV2");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeAuditEventsV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">EnvelopeAuditEventsV2Response");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeAuditEventsV2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetAddressBookItems");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetAddressBookItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetAddressBookItemsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetAddressBookItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetAuthenticationToken");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetAuthenticationToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetAuthenticationTokenResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetAuthenticationTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetConnectFailures");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetConnectFailures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetConnectFailuresResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetConnectFailuresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetFolderItems");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetFolderItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetFolderItemsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetFolderItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetFolderList");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetFolderList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetFolderListResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetFolderListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetSharedAccess");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetSharedAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetSharedAccessResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetSharedAccessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetStatusInDocuSignConnectFormat");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetStatusInDocuSignConnectFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetStatusInDocuSignConnectFormatResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetStatusInDocuSignConnectFormatResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">Ping");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Ping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PingResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PublishConnectFailures");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PublishConnectFailures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PublishConnectFailuresResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PublishConnectFailuresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PurgeDocuments");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PurgeDocuments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PurgeDocumentsAndMetaData");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PurgeDocumentsAndMetaData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PurgeDocumentsAndMetaDataResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PurgeDocumentsAndMetaDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">PurgeDocumentsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PurgeDocumentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RemoveAddressBookItems");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RemoveAddressBookItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RemoveAddressBookItemsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RemoveAddressBookItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestCorrectToken");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestCorrectToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestCorrectTokenResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestCorrectTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelope");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeHistoryToken");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeHistoryToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeHistoryTokenResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeHistoryTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeWithDocumentFields");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeWithDocumentFieldsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeWithDocumentFieldsV2");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFieldsV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeWithDocumentFieldsV2Response");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFieldsV2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestSenderToken");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestSenderToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestSenderTokenResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestSenderTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateList");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateListResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateListWithDocumentFields");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateListWithDocumentFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateListWithDocumentFieldsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateListWithDocumentFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplates");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateWithDocumentFields");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateWithDocumentFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateWithDocumentFieldsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestTemplateWithDocumentFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SaveTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SaveTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SaveTemplateResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SaveTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SetSharedAccess");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SetSharedAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SetSharedAccessResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SetSharedAccessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SynchEnvelope");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SynchEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SynchEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SynchEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">UpdateAddressBookItems");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UpdateAddressBookItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">UpdateAddressBookItemsResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UpdateAddressBookItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">UploadTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UploadTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">UploadTemplateResponse");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UploadTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountMembershipFeaturesList");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AccountMembershipFeaturesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountSetting");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AccountSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountSettingsList");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AccountSetting[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountSetting");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountSetting");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressBookItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookPhoneNumber");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressBookPhoneNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressBookRemoveItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformationInput");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressInformationInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTab");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AnchorTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabProcessorVersion");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AnchorTabProcessorVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAddressBookItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressBookItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAddressBookItem1");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressBookItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAddressBookRemoveItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AddressBookRemoveItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItem");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfAttachment");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfBCCEmailAddress");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BCCEmailAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BCCEmailAddress");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BCCEmailAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfBrandRequestItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandRequestItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandRequestItem");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandRequestItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfBrandResultItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandResultItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItem");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfCaptiveRecipient");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CaptiveRecipient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipient");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfCaptiveRecipient1");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CaptiveRecipient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipient");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfCompositeTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CompositeTemplate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfConnectFailure");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ConnectFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailure");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfCustomField");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CustomField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfDocument");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Document[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfDocumentField");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentField");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfDocumentPDF");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentPDF[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfDocumentStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatus");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfDocumentV2");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentV2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentV2");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentV2");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeAuditEvent");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeAuditEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeEvent");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeStatusChange");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusChange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChange");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfEnvelopeTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeTemplate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfFolder");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Folder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Folder");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Folder");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfFolderItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FolderItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItem");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfFormDataXfdfField");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FormDataXfdfField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormDataXfdfField");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "field");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfInlineTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.InlineTemplate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InlineTemplate");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InlineTemplate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfMatchBox");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.MatchBox[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBox");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBox");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfPositiveInteger");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.PositiveInteger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfPublishConnectFailuresResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PublishConnectFailuresResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresResult");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipient");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Recipient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipient1");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Recipient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipientCorrection");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientCorrection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipientCorrectionStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientCorrectionStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipientEsign");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEsign[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEsign");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEsign");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipientEvent");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvent");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipientSignatureProvider");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientSignatureProvider[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProvider");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProvider");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfRecipientStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfSAMLAttribute");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SAMLAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAttribute");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfServerTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ServerTemplate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ServerTemplate");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ServerTemplate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderProvidedNumber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString1");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString2");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString3");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString4");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnabledFeatures");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString5");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfString6");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfTab");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Tab[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfTabStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TabStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatus");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfTemplateReference");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfTemplateReferenceFieldDataDataValue");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReferenceFieldDataDataValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceFieldDataDataValue");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DataValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ArrayOfTemplateReferenceRoleAssignment");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReferenceRoleAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceRoleAssignment");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AuthenticationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportDocuments");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AvailableFolders");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.AvailableFolders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BCCEmailAddress");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BCCEmailAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandDefinitions");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandDefinitions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandDeleteRequest");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandRequestItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResults");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.BrandResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipient");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CaptiveRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipientResults");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CaptiveRecipientResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CompositeTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailure");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ConnectFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailuresFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ConnectFailuresFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectPublishStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ConnectPublishStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Correction");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Correction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectionStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CorrectionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFieldType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CustomFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.CustomTabType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteCaptiveRecipientsSignaturesArg");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DeleteCaptiveRecipientsSignaturesArg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteEnvelopesArg");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DeleteEnvelopesArg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeliveryMethod");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DeliveryMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DisplayLevelCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DisplayLevelCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DOBInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformationInput");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DOBInformationInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentField");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentPDF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentPDFs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentV2");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocumentV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocuSignEnvelopeInformation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.DocuSignEnvelopeInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailSettings");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EmailSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Envelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeACStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeACStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeAuditEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEventStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeEventStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDF");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopePDF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettings");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChange");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChangeFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusChangeFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilterBeginDateTime");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeStatusFilterBeginDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeTemplateDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplates");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeTemplateDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition");
            qName2 = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeV2");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EnvelopeV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ErrorDetails");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ErrorDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EventNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EventResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.EventStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Expirations");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Expirations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatusChanges");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatuses");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Folder");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FolderFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItem");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FolderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderResults");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FolderResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FoldersFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FoldersFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FolderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderTypeInfo");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FolderTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Font");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Font.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontColor");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FontColor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontSize");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FontSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontStyleCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FontStyleCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FormData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormDataXfdf");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FormDataXfdf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormDataXfdfField");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.FormDataXfdfField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientAuthenticationStatusExArg");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetRecipientAuthenticationStatusExArg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccessResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.GetSharedAccessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "HorizontalAlignmentType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.HorizontalAlignmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.IDCheckInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.IDCheckInformationInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InlineTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.InlineTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBox");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.MatchBox.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MoveEnvelopesArg");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.MoveEnvelopesArg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Notification");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFMetaDataTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PDFMetaDataTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFOptions");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PDFOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFsOptions");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PDFsOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneNumberDesignation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PhoneNumberDesignation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PublishConnectFailuresFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PublishConnectFailuresResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.PurgeDocumentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Recipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCaptiveInfo");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientCaptiveInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientCorrection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionCorrectedCaptiveInfo");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientCorrectionCorrectedCaptiveInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientCorrectionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmailNotification");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEmailNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEsign");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEsign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEsignList");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEsignList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvent");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEventStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientEventStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientList");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientPhoneAuthentication");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientPhoneAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSAMLAuthentication");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientSAMLAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureInfo");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientSignatureInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProvider");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientSignatureProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSMSAuthentication");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientSMSAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatusCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatusEsignAgreementInformation");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientStatusEsignAgreementInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientTypeCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RecipientTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reminders");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Reminders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeHistoryTokenArg");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeHistoryTokenArg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsV2Options");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFieldsV2Options.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertion");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertionAuthenticationMethod");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenClientURLs");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.RequestRecipientTokenClientURLs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAttribute");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SAMLAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SaveTemplateResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SaveTemplateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ServerTemplate");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.ServerTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessRequest");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SetSharedAccessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SetSharedAccessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessFilter");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedAccessFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessItemResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedAccessItemResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessItemType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedAccessItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessShareType");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedAccessShareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItemRequest");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItemResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedItemResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItems");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedUserInfoRequest");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedUserInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedUserInfoResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SharedUserInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureProviderOptions");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SignatureProviderOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocationCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SigningLocationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4Information");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SSN4Information.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4InformationInput");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SSN4InformationInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9Information");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SSN9Information.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9InformationInput");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SSN9InformationInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SupportedLanguage");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SupportedLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelopeStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.SynchEnvelopeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.Tab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TabStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabTypeCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TabTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocationCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateLocationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceFieldData");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReferenceFieldData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceFieldDataDataValue");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReferenceFieldDataDataValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceRoleAssignment");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TemplateReferenceRoleAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransferEnvelopeStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.TransferEnvelopeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UnitTypeCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UnitTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UpdateAddressBookResult");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UpdateAddressBookResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserInfo");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.VaultingDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingModeCode");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.VaultingModeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingOptions");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.VaultingOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VoidEnvelopeStatus");
            cachedSerQNames.add(qName);
            cls = net.docusign.www.API._3_0.VoidEnvelopeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public net.docusign.www.API._3_0.EnvelopeStatus createEnvelope(net.docusign.www.API._3_0.Envelope envelope) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CreateEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelope});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus createAndSendEnvelope(net.docusign.www.API._3_0.Envelope envelope) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CreateAndSendEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateAndSendEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelope});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus sendEnvelope(java.lang.String envelopeId, java.lang.String accountId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/SendEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SendEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId, accountId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.CorrectionStatus correctAndResendEnvelope(net.docusign.www.API._3_0.Correction correction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CorrectAndResendEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectAndResendEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {correction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.CorrectionStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.CorrectionStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.CorrectionStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopePDF requestPDFNoWaterMark(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestPDFNoWaterMark");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFNoWaterMark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopePDF) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopePDF) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopePDF.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopePDF requestPDFWithOptions(java.lang.String envelopeID, net.docusign.www.API._3_0.PDFOptions PDFOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestPDFWithOptions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFWithOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, PDFOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopePDF) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopePDF) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopePDF.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopePDF requestPDFRecipientsView(java.lang.String envelopeID, java.lang.String recipientName, java.lang.String recipientEmail, net.docusign.www.API._3_0.PDFOptions PDFOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestPDFRecipientsView");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFRecipientsView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, recipientName, recipientEmail, PDFOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopePDF) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopePDF) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopePDF.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocumentPDFs requestPDFsWithOptions(java.lang.String envelopeID, net.docusign.www.API._3_0.PDFsOptions PDFsOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestPDFsWithOptions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFsWithOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, PDFsOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocumentPDFs) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocumentPDFs) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocumentPDFs.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopePDF requestPDF(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestPDF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopePDF) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopePDF) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopePDF.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopePDF requestPDFWithCert(java.lang.String envelopeID, boolean addWaterMark) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestPDFWithCert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestPDFWithCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, new java.lang.Boolean(addWaterMark)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopePDF) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopePDF) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopePDF.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocumentPDFs requestCertificate(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestCertificate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCertificate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocumentPDFs) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocumentPDFs) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocumentPDFs.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocumentPDFs requestCertificateWithCertLanguage(java.lang.String envelopeID, java.lang.String certLanguage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestCertificateWithCertLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCertificateWithCertLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, certLanguage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocumentPDFs) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocumentPDFs) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocumentPDFs.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFs(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestDocumentPDFs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestDocumentPDFs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocumentPDFs) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocumentPDFs) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocumentPDFs.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFsEx(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestDocumentPDFsEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestDocumentPDFsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocumentPDFs) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocumentPDFs) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocumentPDFs.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFsRecipientsView(java.lang.String envelopeID, java.lang.String recipientName, java.lang.String recipientEmail) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestDocumentPDFsRecipientsView");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestDocumentPDFsRecipientsView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, recipientName, recipientEmail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocumentPDFs) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocumentPDFs) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocumentPDFs.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus requestStatusEx(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatusEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus requestStatus(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus requestStatusWithDocumentFields(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatusWithDocumentFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusWithDocumentFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges requestStatusCodes(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatusCodes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeStatusFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges requestStatusChanges(net.docusign.www.API._3_0.EnvelopeStatusChangeFilter envelopeStatusChangeFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatusChanges");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusChanges"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeStatusChangeFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.FilteredEnvelopeStatusChanges.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatusesEx(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatusesEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusesEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeStatusFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatuses) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatuses) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatuses(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatuses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeStatusFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatuses) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatuses) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatusesWithDocumentFields(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestStatusesWithDocumentFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestStatusesWithDocumentFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeStatusFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatuses) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.FilteredEnvelopeStatuses) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.FilteredEnvelopeStatuses.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.RecipientEsignList getRecipientEsignList(java.lang.String userName, java.lang.String senderEmail, java.lang.String senderAccountId, java.lang.String recipientEmail) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetRecipientEsignList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientEsignList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, senderEmail, senderAccountId, recipientEmail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.RecipientEsignList) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.RecipientEsignList) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.RecipientEsignList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.RecipientList getRecipientList(java.lang.String senderAccountId, java.lang.String recipientEmail) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetRecipientList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {senderAccountId, recipientEmail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.RecipientList) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.RecipientList) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.RecipientList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.BrandResults deleteAccountBrands(java.lang.String accountId, net.docusign.www.API._3_0.BrandDeleteRequest brandDeleteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/DeleteAccountBrands");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteAccountBrands"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId, brandDeleteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.BrandResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.BrandResults) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.BrandResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.BrandResults createAccountBrands(java.lang.String accountId, net.docusign.www.API._3_0.BrandDefinitions brandDefinitions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CreateAccountBrands");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateAccountBrands"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId, brandDefinitions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.BrandResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.BrandResults) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.BrandResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.BrandResults getAccountBrands(java.lang.String accountId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetAccountBrands");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAccountBrands"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.BrandResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.BrandResults) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.BrandResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AuthenticationStatus getRecipientAuthenticationStatusEx(net.docusign.www.API._3_0.GetRecipientAuthenticationStatusExArg arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetRecipientAuthenticationStatusEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientAuthenticationStatusEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AuthenticationStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AuthenticationStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AuthenticationStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.VoidEnvelopeStatus voidEnvelope(java.lang.String envelopeID, java.lang.String reason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/VoidEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VoidEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, reason});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.VoidEnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.VoidEnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.VoidEnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean moveEnvelopes(net.docusign.www.API._3_0.MoveEnvelopesArg arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/MoveEnvelopes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MoveEnvelopes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean deleteEnvelopes(net.docusign.www.API._3_0.DeleteEnvelopesArg arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/DeleteEnvelopes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteEnvelopes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.CaptiveRecipientResults deleteCaptiveRecipientsSignatures(java.lang.String accountId, net.docusign.www.API._3_0.DeleteCaptiveRecipientsSignaturesArg arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/DeleteCaptiveRecipientsSignatures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeleteCaptiveRecipientsSignatures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId, arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.CaptiveRecipientResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.CaptiveRecipientResults) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.CaptiveRecipientResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String requestRecipientToken(java.lang.String envelopeID, java.lang.String clientUserID, java.lang.String username, java.lang.String email, net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion authenticationAssertion, net.docusign.www.API._3_0.RequestRecipientTokenClientURLs clientURLs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestRecipientToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, clientUserID, username, email, authenticationAssertion, clientURLs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String requestRecipientFaxToken(java.lang.String envelopeID, java.lang.String clientUserID, java.lang.String username, java.lang.String email, net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion authenticationAssertion, net.docusign.www.API._3_0.RequestRecipientTokenClientURLs clientURLs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestRecipientFaxToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientFaxToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, clientUserID, username, email, authenticationAssertion, clientURLs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopePDF requestRecipientFaxPDF(java.lang.String envelopeID, java.lang.String clientUserID, java.lang.String username, java.lang.String email, net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion authenticationAssertion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestRecipientFaxPDF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientFaxPDF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, clientUserID, username, email, authenticationAssertion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopePDF) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopePDF) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopePDF.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.TransferEnvelopeStatus transferEnvelope(java.lang.String envelopeID, java.lang.String accountID, java.lang.String userID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/TransferEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransferEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, accountID, userID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.TransferEnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.TransferEnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.TransferEnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AccountMembershipFeaturesList getAccountMembershipFeaturesList(java.lang.String accountId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetAccountMembershipFeaturesList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAccountMembershipFeaturesList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AccountMembershipFeaturesList) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AccountMembershipFeaturesList) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AccountMembershipFeaturesList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AccountSetting[] getAccountSettingsList(java.lang.String accountId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetAccountSettingsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAccountSettingsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AccountSetting[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AccountSetting[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AccountSetting[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AuthoritativeCopyExportStatus completeAuthoritativeCopyExport(java.lang.String envelopeId, java.lang.String transactionId, java.lang.String externalId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CompleteAuthoritativeCopyExport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompleteAuthoritativeCopyExport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId, transactionId, externalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AuthoritativeCopyExportStatus getAuthoritativeCopyExportKey(java.lang.String envelopeId, java.lang.String transactionId, byte[] checkSumHash) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetAuthoritativeCopyExportKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAuthoritativeCopyExportKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId, transactionId, checkSumHash});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AuthoritativeCopyExportStatus acknowledgeAuthoritativeCopyExport(java.lang.String envelopeId, java.lang.String transactionId, byte[] checkSumHash) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/AcknowledgeAuthoritativeCopyExport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AcknowledgeAuthoritativeCopyExport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId, transactionId, checkSumHash});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AuthoritativeCopyExportStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments exportAuthoritativeCopy(java.lang.String envelopeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/ExportAuthoritativeCopy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExportAuthoritativeCopy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult envelopeAuditEvents(java.lang.String envelopeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/EnvelopeAuditEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeAuditEvent[] envelopeAuditEventsV2(java.lang.String envelopeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/EnvelopeAuditEventsV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEventsV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeAuditEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeAuditEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeAuditEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String requestEnvelopeHistoryToken(net.docusign.www.API._3_0.RequestEnvelopeHistoryTokenArg arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestEnvelopeHistoryToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeHistoryToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean ping() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplates(net.docusign.www.API._3_0.TemplateReference[] templateReferences, net.docusign.www.API._3_0.Recipient[] recipients, net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation, boolean activateEnvelope) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeFromTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {templateReferences, recipients, envelopeInformation, new java.lang.Boolean(activateEnvelope)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesAndForms(net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation, net.docusign.www.API._3_0.CompositeTemplate[] compositeTemplates, boolean activateEnvelope) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplatesAndForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeFromTemplatesAndForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeInformation, compositeTemplates, new java.lang.Boolean(activateEnvelope)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.DocuSignEnvelopeInformation getStatusInDocuSignConnectFormat(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetStatusInDocuSignConnectFormat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetStatusInDocuSignConnectFormat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.DocuSignEnvelopeInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.DocuSignEnvelopeInformation) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.DocuSignEnvelopeInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.PurgeDocumentStatus purgeDocuments(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/PurgeDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.PurgeDocumentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.PurgeDocumentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.PurgeDocumentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.PurgeDocumentStatus purgeDocumentsAndMetaData(java.lang.String envelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/PurgeDocumentsAndMetaData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentsAndMetaData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.PurgeDocumentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.PurgeDocumentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.PurgeDocumentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.SaveTemplateResult saveTemplate(net.docusign.www.API._3_0.EnvelopeTemplate envelopeTemplate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/SaveTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SaveTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeTemplate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.SaveTemplateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.SaveTemplateResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.SaveTemplateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.SaveTemplateResult uploadTemplate(java.lang.String templateXML, java.lang.String accountID, boolean shared) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/UploadTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UploadTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {templateXML, accountID, new java.lang.Boolean(shared)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.SaveTemplateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.SaveTemplateResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.SaveTemplateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] requestTemplates(java.lang.String accountID, boolean includeAdvancedTemplates) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountID, new java.lang.Boolean(includeAdvancedTemplates)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeTemplateDefinition[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeTemplateDefinition[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeTemplateDefinition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeTemplate requestTemplate(java.lang.String templateID, boolean includeDocumentBytes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {templateID, new java.lang.Boolean(includeDocumentBytes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeTemplate) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeTemplate) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeTemplate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateList(java.lang.String[] templateIDs, boolean includeDocumentBytes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestTemplateList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {templateIDs, new java.lang.Boolean(includeDocumentBytes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeTemplate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeTemplate[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeTemplate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeTemplate requestTemplateWithDocumentFields(java.lang.String templateID, boolean includeDocumentBytes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestTemplateWithDocumentFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateWithDocumentFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {templateID, new java.lang.Boolean(includeDocumentBytes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeTemplate) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeTemplate) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeTemplate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListWithDocumentFields(java.lang.String[] templateIDs, boolean includeDocumentBytes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestTemplateListWithDocumentFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateListWithDocumentFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {templateIDs, new java.lang.Boolean(includeDocumentBytes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeTemplate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeTemplate[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeTemplate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getAuthenticationToken(java.lang.String goToEnvelopeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetAuthenticationToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAuthenticationToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {goToEnvelopeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AddressBookItem[] getAddressBookItems(java.lang.String accountID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetAddressBookItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetAddressBookItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AddressBookItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AddressBookItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AddressBookItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.UpdateAddressBookResult updateAddressBookItems(net.docusign.www.API._3_0.AddressBookItem[] addressBookItems, boolean returnAddressBook) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/UpdateAddressBookItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UpdateAddressBookItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addressBookItems, new java.lang.Boolean(returnAddressBook)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.UpdateAddressBookResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.UpdateAddressBookResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.UpdateAddressBookResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.UpdateAddressBookResult removeAddressBookItems(net.docusign.www.API._3_0.AddressBookRemoveItem[] addressBookRemoveItems, boolean returnAddressBook) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RemoveAddressBookItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RemoveAddressBookItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addressBookRemoveItems, new java.lang.Boolean(returnAddressBook)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.UpdateAddressBookResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.UpdateAddressBookResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.UpdateAddressBookResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.SynchEnvelopeStatus synchEnvelope(java.lang.String transactionID, java.lang.String accountID, boolean block) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/SynchEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transactionID, accountID, new java.lang.Boolean(block)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.SynchEnvelopeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.SynchEnvelopeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.SynchEnvelopeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String requestSenderToken(java.lang.String envelopeID, java.lang.String accountID, java.lang.String returnURL) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestSenderToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestSenderToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, accountID, returnURL});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String requestCorrectToken(java.lang.String envelopeID, boolean suppressNavigation, java.lang.String returnURL) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestCorrectToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCorrectToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, new java.lang.Boolean(suppressNavigation), returnURL});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.FolderResults getFolderItems(net.docusign.www.API._3_0.FolderFilter folderFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetFolderItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetFolderItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {folderFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.FolderResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.FolderResults) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.FolderResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.AvailableFolders getFolderList(net.docusign.www.API._3_0.FoldersFilter foldersFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetFolderList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetFolderList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {foldersFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.AvailableFolders) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.AvailableFolders) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.AvailableFolders.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.Envelope requestEnvelope(java.lang.String envelopeID, boolean includeDocumentBytes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, new java.lang.Boolean(includeDocumentBytes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.Envelope) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.Envelope) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.Envelope.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.Envelope requestEnvelopeWithDocumentFields(java.lang.String envelopeID, boolean includeDocumentBytes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestEnvelopeWithDocumentFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, new java.lang.Boolean(includeDocumentBytes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.Envelope) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.Envelope) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.Envelope.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.EnvelopeV2 requestEnvelopeWithDocumentFieldsV2(java.lang.String envelopeID, net.docusign.www.API._3_0.RequestEnvelopeWithDocumentFieldsV2Options options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/RequestEnvelopeWithDocumentFieldsV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelopeID, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.EnvelopeV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.EnvelopeV2) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.EnvelopeV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.ConnectFailure[] getConnectFailures(net.docusign.www.API._3_0.ConnectFailuresFilter connectFailuresFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetConnectFailures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetConnectFailures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {connectFailuresFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.ConnectFailure[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.ConnectFailure[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.ConnectFailure[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.PublishConnectFailuresResult[] publishConnectFailures(net.docusign.www.API._3_0.PublishConnectFailuresFilter publishConnectFailuresFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/PublishConnectFailures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {publishConnectFailuresFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.PublishConnectFailuresResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.PublishConnectFailuresResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.PublishConnectFailuresResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.GetSharedAccessResult getSharedAccess(java.lang.String accountId, net.docusign.www.API._3_0.SharedAccessFilter sharedAccessFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/GetSharedAccess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId, sharedAccessFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.GetSharedAccessResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.GetSharedAccessResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.GetSharedAccessResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.docusign.www.API._3_0.SetSharedAccessResult setSharedAccess(net.docusign.www.API._3_0.SetSharedAccessRequest setSharedAccessRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.docusign.net/API/3.0/SetSharedAccess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setSharedAccessRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.docusign.www.API._3_0.SetSharedAccessResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.docusign.www.API._3_0.SetSharedAccessResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.docusign.www.API._3_0.SetSharedAccessResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
