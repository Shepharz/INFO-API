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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SmsBinaryMessage */
public class SmsBinaryMessage {
  public static final String SERIALIZED_NAME_BINARY = "binary";

  @SerializedName(SERIALIZED_NAME_BINARY)
  private SmsBinaryContent binary = null;

  public static final String SERIALIZED_NAME_CALLBACK_DATA = "callbackData";

  @SerializedName(SERIALIZED_NAME_CALLBACK_DATA)
  private String callbackData;

  public static final String SERIALIZED_NAME_DELIVERY_TIME_WINDOW = "deliveryTimeWindow";

  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME_WINDOW)
  private SmsDeliveryTimeWindow deliveryTimeWindow = null;

  public static final String SERIALIZED_NAME_DESTINATIONS = "destinations";

  @SerializedName(SERIALIZED_NAME_DESTINATIONS)
  private List<SmsDestination> destinations = null;

  public static final String SERIALIZED_NAME_FLASH = "flash";

  @SerializedName(SERIALIZED_NAME_FLASH)
  private Boolean flash;

  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_INTERMEDIATE_REPORT = "intermediateReport";

  @SerializedName(SERIALIZED_NAME_INTERMEDIATE_REPORT)
  private Boolean intermediateReport;

  public static final String SERIALIZED_NAME_NOTIFY_CONTENT_TYPE = "notifyContentType";

  @SerializedName(SERIALIZED_NAME_NOTIFY_CONTENT_TYPE)
  private String notifyContentType;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notifyUrl";

  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_REGIONAL = "regional";

  @SerializedName(SERIALIZED_NAME_REGIONAL)
  private SmsRegionalOptions regional = null;

  public static final String SERIALIZED_NAME_SEND_AT = "sendAt";

  @SerializedName(SERIALIZED_NAME_SEND_AT)
  private OffsetDateTime sendAt;

  public static final String SERIALIZED_NAME_VALIDITY_PERIOD = "validityPeriod";

  @SerializedName(SERIALIZED_NAME_VALIDITY_PERIOD)
  private Long validityPeriod;

  public SmsBinaryMessage binary(SmsBinaryContent binary) {

    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   *
   * @return binary
   */
  public SmsBinaryContent getBinary() {
    return binary;
  }

  public void setBinary(SmsBinaryContent binary) {
    this.binary = binary;
  }

  public SmsBinaryMessage callbackData(String callbackData) {

    this.callbackData = callbackData;
    return this;
  }

  /**
   * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 200
   * characters.
   *
   * @return callbackData
   */
  public String getCallbackData() {
    return callbackData;
  }

  public void setCallbackData(String callbackData) {
    this.callbackData = callbackData;
  }

  public SmsBinaryMessage deliveryTimeWindow(SmsDeliveryTimeWindow deliveryTimeWindow) {

    this.deliveryTimeWindow = deliveryTimeWindow;
    return this;
  }

  /**
   * Scheduling object that allows setting up detailed time windows in which the message can be
   * sent. Consists of &#x60;from&#x60;, &#x60;to&#x60; and &#x60;days&#x60; properties.
   * &#x60;Days&#x60; property is mandatory. &#x60;From&#x60; and &#x60;to&#x60; properties should
   * be either both included, to allow finer time window granulation or both omitted, to include
   * whole days in the delivery time window.
   *
   * @return deliveryTimeWindow
   */
  public SmsDeliveryTimeWindow getDeliveryTimeWindow() {
    return deliveryTimeWindow;
  }

  public void setDeliveryTimeWindow(SmsDeliveryTimeWindow deliveryTimeWindow) {
    this.deliveryTimeWindow = deliveryTimeWindow;
  }

  public SmsBinaryMessage destinations(List<SmsDestination> destinations) {

    this.destinations = destinations;
    return this;
  }

  public SmsBinaryMessage addDestinationsItem(SmsDestination destinationsItem) {
    if (this.destinations == null) {
      this.destinations = new ArrayList<>();
    }
    this.destinations.add(destinationsItem);
    return this;
  }

  /**
   * Get destinations
   *
   * @return destinations
   */
  public List<SmsDestination> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<SmsDestination> destinations) {
    this.destinations = destinations;
  }

  public SmsBinaryMessage flash(Boolean flash) {

    this.flash = flash;
    return this;
  }

  /**
   * Can be &#x60;true&#x60; or &#x60;false&#x60;. If the value is set to &#x60;true&#x60;, a flash
   * SMS will be sent. Otherwise, a normal SMS will be sent. The default value is &#x60;false&#x60;.
   *
   * @return flash
   */
  public Boolean getFlash() {
    return flash;
  }

  public void setFlash(Boolean flash) {
    this.flash = flash;
  }

  public SmsBinaryMessage from(String from) {

    this.from = from;
    return this;
  }

  /**
   * Represents a sender ID which can be alphanumeric or numeric. Alphanumeric sender ID length
   * should be between 3 and 11 characters (Example: &#x60;CompanyName&#x60;). Numeric sender ID
   * length should be between 3 and 14 characters.
   *
   * @return from
   */
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SmsBinaryMessage intermediateReport(Boolean intermediateReport) {

    this.intermediateReport = intermediateReport;
    return this;
  }

  /**
   * The real-time Intermediate delivery report that will be sent on your callback server. Can be
   * &#x60;true&#x60; or &#x60;false&#x60;.
   *
   * @return intermediateReport
   */
  public Boolean getIntermediateReport() {
    return intermediateReport;
  }

  public void setIntermediateReport(Boolean intermediateReport) {
    this.intermediateReport = intermediateReport;
  }

  public SmsBinaryMessage notifyContentType(String notifyContentType) {

    this.notifyContentType = notifyContentType;
    return this;
  }

  /**
   * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or
   * &#x60;application/xml&#x60;.
   *
   * @return notifyContentType
   */
  public String getNotifyContentType() {
    return notifyContentType;
  }

  public void setNotifyContentType(String notifyContentType) {
    this.notifyContentType = notifyContentType;
  }

  public SmsBinaryMessage notifyUrl(String notifyUrl) {

    this.notifyUrl = notifyUrl;
    return this;
  }

  /**
   * The URL on your call back server on which the Delivery report will be sent.
   *
   * @return notifyUrl
   */
  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  public SmsBinaryMessage regional(SmsRegionalOptions regional) {

    this.regional = regional;
    return this;
  }

  /**
   * Region specific parameters, often specified by local laws. Use this if country or region that
   * you are sending SMS to requires some extra parameters.
   *
   * @return regional
   */
  public SmsRegionalOptions getRegional() {
    return regional;
  }

  public void setRegional(SmsRegionalOptions regional) {
    this.regional = regional;
  }

  public SmsBinaryMessage sendAt(OffsetDateTime sendAt) {

    this.sendAt = sendAt;
    return this;
  }

  /**
   * Date and time when the message is to be sent. Used for scheduled SMS (SMS not sent immediately,
   * but at the scheduled time). Has the following format:
   * &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   *
   * @return sendAt
   */
  public OffsetDateTime getSendAt() {
    return sendAt;
  }

  public void setSendAt(OffsetDateTime sendAt) {
    this.sendAt = sendAt;
  }

  public SmsBinaryMessage validityPeriod(Long validityPeriod) {

    this.validityPeriod = validityPeriod;
    return this;
  }

  /**
   * The message validity period in minutes. When the period expires, it will not be allowed for the
   * message to be sent. Validity period longer than 48h is not supported (in this case, it will be
   * automatically set to 48h).
   *
   * @return validityPeriod
   */
  public Long getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(Long validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsBinaryMessage smsBinaryMessage = (SmsBinaryMessage) o;
    return Objects.equals(this.binary, smsBinaryMessage.binary)
        && Objects.equals(this.callbackData, smsBinaryMessage.callbackData)
        && Objects.equals(this.deliveryTimeWindow, smsBinaryMessage.deliveryTimeWindow)
        && Objects.equals(this.destinations, smsBinaryMessage.destinations)
        && Objects.equals(this.flash, smsBinaryMessage.flash)
        && Objects.equals(this.from, smsBinaryMessage.from)
        && Objects.equals(this.intermediateReport, smsBinaryMessage.intermediateReport)
        && Objects.equals(this.notifyContentType, smsBinaryMessage.notifyContentType)
        && Objects.equals(this.notifyUrl, smsBinaryMessage.notifyUrl)
        && Objects.equals(this.regional, smsBinaryMessage.regional)
        && Objects.equals(this.sendAt, smsBinaryMessage.sendAt)
        && Objects.equals(this.validityPeriod, smsBinaryMessage.validityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        binary,
        callbackData,
        deliveryTimeWindow,
        destinations,
        flash,
        from,
        intermediateReport,
        notifyContentType,
        notifyUrl,
        regional,
        sendAt,
        validityPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsBinaryMessage {\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    callbackData: ").append(toIndentedString(callbackData)).append("\n");
    sb.append("    deliveryTimeWindow: ").append(toIndentedString(deliveryTimeWindow)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    flash: ").append(toIndentedString(flash)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    intermediateReport: ").append(toIndentedString(intermediateReport)).append("\n");
    sb.append("    notifyContentType: ").append(toIndentedString(notifyContentType)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
    sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
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
