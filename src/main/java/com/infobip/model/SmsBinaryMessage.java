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
   * Additional client data that will be sent on the notifyUrl. The maximum value is 4000
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
   * Sets specific scheduling options to send a message within daily or hourly intervals.
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
   * An array of destination objects for where messages are being sent. A valid destination is
   * required.
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
   * Allows for sending a [flash SMS](https://www.infobip.com/docs/sms/message-types#flash-sms) to
   * automatically appear on recipient devices without interaction. Set to &#x60;true&#x60; to
   * enable flash SMS, or leave the default value, &#x60;false&#x60; to send a standard SMS.
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
   * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure
   * you don&#39;t exceed [character
   * limit](https://www.infobip.com/docs/sms/get-started#sender-names).
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
   * The [real-time intermediate delivery
   * report](https://www.infobip.com/docs/api#channels/sms/receive-outbound-sms-message-report)
   * containing GSM error codes, messages status, pricing, network and country codes, etc., which
   * will be sent on your callback server. Defaults to &#x60;false&#x60;.
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
   * Preferred delivery report content type, &#x60;application/json&#x60; or
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
   * Region-specific parameters, often imposed by local laws. Use this, if country or region that
   * you are sending an SMS to requires additional information.
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
   * Date and time when the message is to be sent. Used for [scheduled
   * SMS](https://www.infobip.com/docs/api#channels/sms/get-scheduled-sms-messages). Has the
   * following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. Must be sooner than 180 days
   * from now.
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
