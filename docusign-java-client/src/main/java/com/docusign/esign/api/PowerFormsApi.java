package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.PowerForm;
import com.docusign.esign.model.PowerFormSendersResponse;
import com.docusign.esign.model.PowerFormsFormDataResponse;
import com.docusign.esign.model.PowerFormsRequest;
import com.docusign.esign.model.PowerFormsResponse;




  public class PowerFormsApi {
  private ApiClient apiClient;

  public PowerFormsApi() {
  this(Configuration.getDefaultApiClient());
  }

  public PowerFormsApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Creates a new PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm createPowerForm(String accountId, PowerForm powerForm) throws ApiException {
    Object localVarPostBody = powerForm;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPowerForm");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerForm> localVarReturnType = new GenericType<PowerForm>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Delete a PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePowerForm(String accountId, String powerFormId) throws ApiException {
    Object localVarPostBody = null;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePowerForm");
      }
    
      // verify the required parameter 'powerFormId' is set
      if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling deletePowerForm");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms/{powerFormId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Deletes one or more PowerForms
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormsRequest  (optional)
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsResponse deletePowerForms(String accountId, PowerFormsRequest powerFormsRequest) throws ApiException {
    Object localVarPostBody = powerFormsRequest;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePowerForms");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerFormsResponse> localVarReturnType = new GenericType<PowerFormsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Returns a single PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm getPowerForm(String accountId, String powerFormId) throws ApiException {
    Object localVarPostBody = null;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPowerForm");
      }
    
      // verify the required parameter 'powerFormId' is set
      if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling getPowerForm");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms/{powerFormId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerForm> localVarReturnType = new GenericType<PowerForm>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Returns the form data associated with the usage of a PowerForm. 
  /// </summary>
  public class GetPowerFormDataOptions
  {
  private String dataLayout = null;
  private String fromDate = null;
  private String toDate = null;
  /*
   * 
   */
  public void setDataLayout(String dataLayout) {
    this.dataLayout = dataLayout;
  }
  
  public String getDataLayout() {
    return this.dataLayout;
  }
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }
  
  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }
  
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Returns the form data associated with the usage of a PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerFormsFormDataResponse
   */ 
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId) throws ApiException {
    return getPowerFormData(accountId, powerFormId, null);
  }

  /**
   * Returns the form data associated with the usage of a PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsFormDataResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId, PowerFormsApi.GetPowerFormDataOptions options) throws ApiException {
    Object localVarPostBody = null;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPowerFormData");
      }
    
      // verify the required parameter 'powerFormId' is set
      if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling getPowerFormData");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms/{powerFormId}/form_data".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_layout", options.dataLayout));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerFormsFormDataResponse> localVarReturnType = new GenericType<PowerFormsFormDataResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Returns the list of PowerForms available to the user. 
  /// </summary>
  public class ListPowerFormSendersOptions
  {
  private String startPosition = null;
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PowerFormSendersResponse
   */ 
  public PowerFormSendersResponse listPowerFormSenders(String accountId) throws ApiException {
    return listPowerFormSenders(accountId, null);
  }

  /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormSendersResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormSendersResponse listPowerFormSenders(String accountId, PowerFormsApi.ListPowerFormSendersOptions options) throws ApiException {
    Object localVarPostBody = null;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPowerFormSenders");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms/senders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerFormSendersResponse> localVarReturnType = new GenericType<PowerFormSendersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Returns the list of PowerForms available to the user. 
  /// </summary>
  public class ListPowerFormsOptions
  {
  private String fromDate = null;
  private String order = null;
  private String orderBy = null;
  private String toDate = null;
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }
  
  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setOrder(String order) {
    this.order = order;
  }
  
  public String getOrder() {
    return this.order;
  }
  /*
   * 
   */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }
  
  public String getOrderBy() {
    return this.orderBy;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }
  
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PowerFormsResponse
   */ 
  public PowerFormsResponse listPowerForms(String accountId) throws ApiException {
    return listPowerForms(accountId, null);
  }

  /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsResponse listPowerForms(String accountId, PowerFormsApi.ListPowerFormsOptions options) throws ApiException {
    Object localVarPostBody = null;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPowerForms");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerFormsResponse> localVarReturnType = new GenericType<PowerFormsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Creates a new PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm updatePowerForm(String accountId, String powerFormId, PowerForm powerForm) throws ApiException {
    Object localVarPostBody = powerForm;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePowerForm");
      }
    
      // verify the required parameter 'powerFormId' is set
      if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling updatePowerForm");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/powerforms/{powerFormId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PowerForm> localVarReturnType = new GenericType<PowerForm>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
