/*
 * Infobip Client API Libraries OpenAPI Specification
 * OpenAPI specification containing public endpoints supported in client API libraries.
 *
 * Contact: support@infobip.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.infobip.api;

import com.google.gson.reflect.TypeToken;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.ApiResponse;
import com.infobip.Configuration;
import com.infobip.Pair;
import com.infobip.model.EmailValidationRequest;
import com.infobip.model.EmailValidationResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailValidationApi {
  private ApiClient localVarApiClient;

  public EmailValidationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmailValidationApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for validateEmailAddresses.
   *
   * @param emailValidationRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/email/validation">Learn more about email validation
   *     and use cases</a>
   */
  public okhttp3.Call validateEmailAddressesCall(
      EmailValidationRequest emailValidationRequest, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = emailValidationRequest;

    // create path and map variables
    String localVarPath = "/email/2/validation";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json", "application/xml"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call validateEmailAddressesValidateBeforeCall(
      EmailValidationRequest emailValidationRequest, final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = validateEmailAddressesCall(emailValidationRequest, _callback);
    return localVarCall;
  }

  /**
   * Validate email addresses. Run validation to identify poor quality emails to clean up your
   * recipient list.
   *
   * @param emailValidationRequest (optional)
   * @return EmailValidationResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/email/validation">Learn more about email validation
   *     and use cases</a>
   */
  public EmailValidationResponse validateEmailAddresses(
      EmailValidationRequest emailValidationRequest) throws ApiException {
    ApiResponse<EmailValidationResponse> localVarResp =
        validateEmailAddressesWithHttpInfo(emailValidationRequest);
    return localVarResp.getData();
  }

  /**
   * Validate email addresses. Run validation to identify poor quality emails to clean up your
   * recipient list.
   *
   * @param emailValidationRequest (optional)
   * @return ApiResponse&lt;EmailValidationResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/email/validation">Learn more about email validation
   *     and use cases</a>
   */
  public ApiResponse<EmailValidationResponse> validateEmailAddressesWithHttpInfo(
      EmailValidationRequest emailValidationRequest) throws ApiException {
    okhttp3.Call localVarCall =
        validateEmailAddressesValidateBeforeCall(emailValidationRequest, null);
    Type localVarReturnType = new TypeToken<EmailValidationResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Validate email addresses (asynchronously). Run validation to identify poor quality emails to
   * clean up your recipient list.
   *
   * @param emailValidationRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/email/validation">Learn more about email validation
   *     and use cases</a>
   */
  public okhttp3.Call validateEmailAddressesAsync(
      EmailValidationRequest emailValidationRequest,
      final ApiCallback<EmailValidationResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        validateEmailAddressesValidateBeforeCall(emailValidationRequest, _callback);
    Type localVarReturnType = new TypeToken<EmailValidationResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
