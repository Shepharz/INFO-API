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

package com.infobip.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** SmsTracking */
public class SmsTracking {
  public static final String SERIALIZED_NAME_BASE_URL = "baseUrl";

  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private String baseUrl;

  public static final String SERIALIZED_NAME_PROCESS_KEY = "processKey";

  @SerializedName(SERIALIZED_NAME_PROCESS_KEY)
  private String processKey;

  public static final String SERIALIZED_NAME_TRACK = "track";

  @SerializedName(SERIALIZED_NAME_TRACK)
  private String track;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public SmsTracking baseUrl(String baseUrl) {

    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Custom base url used for shortening links from SMS text in &#x60;URL&#x60; Conversion rate
   * tracking use-case.
   *
   * @return baseUrl
   */
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public SmsTracking processKey(String processKey) {

    this.processKey = processKey;
    return this;
  }

  /**
   * Key that uniquely identifies Conversion tracking process.
   *
   * @return processKey
   */
  public String getProcessKey() {
    return processKey;
  }

  public void setProcessKey(String processKey) {
    this.processKey = processKey;
  }

  public SmsTracking track(String track) {

    this.track = track;
    return this;
  }

  /**
   * Indicates if the message has to be tracked for Conversion rates. Possible values:
   * &#x60;SMS&#x60; and &#x60;URL&#x60;
   *
   * @return track
   */
  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
  }

  public SmsTracking type(String type) {

    this.type = type;
    return this;
  }

  /**
   * User-defined type of the Conversion tracking process or flow type or message type, etc.
   * Example: &#x60;ONE_TIME_PIN or SOCIAL_INVITES&#x60;.
   *
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsTracking smsTracking = (SmsTracking) o;
    return Objects.equals(this.baseUrl, smsTracking.baseUrl)
        && Objects.equals(this.processKey, smsTracking.processKey)
        && Objects.equals(this.track, smsTracking.track)
        && Objects.equals(this.type, smsTracking.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, processKey, track, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsTracking {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    processKey: ").append(toIndentedString(processKey)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
