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

/** WhatsAppInteractiveButtonsMessage */
public class WhatsAppInteractiveButtonsMessage {
  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_CONTENT = "content";

  @SerializedName(SERIALIZED_NAME_CONTENT)
  private WhatsAppInteractiveButtonsContent content;

  public static final String SERIALIZED_NAME_CALLBACK_DATA = "callbackData";

  @SerializedName(SERIALIZED_NAME_CALLBACK_DATA)
  private String callbackData;

  public WhatsAppInteractiveButtonsMessage from(String from) {

    this.from = from;
    return this;
  }

  /**
   * Registered WhatsApp sender number. Must be in international format and comply with
   * [WhatsApp&#39;s
   * requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
   *
   * @return from
   */
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public WhatsAppInteractiveButtonsMessage to(String to) {

    this.to = to;
    return this;
  }

  /**
   * Message recipient number. Must be in international format and comply with [WhatsApp&#39;s
   * requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
   *
   * @return to
   */
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public WhatsAppInteractiveButtonsMessage messageId(String messageId) {

    this.messageId = messageId;
    return this;
  }

  /**
   * The ID that uniquely identifies the message sent.
   *
   * @return messageId
   */
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public WhatsAppInteractiveButtonsMessage content(WhatsAppInteractiveButtonsContent content) {

    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content
   */
  public WhatsAppInteractiveButtonsContent getContent() {
    return content;
  }

  public void setContent(WhatsAppInteractiveButtonsContent content) {
    this.content = content;
  }

  public WhatsAppInteractiveButtonsMessage callbackData(String callbackData) {

    this.callbackData = callbackData;
    return this;
  }

  /**
   * Custom client data that will be included in a [Delivery
   * Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
   *
   * @return callbackData
   */
  public String getCallbackData() {
    return callbackData;
  }

  public void setCallbackData(String callbackData) {
    this.callbackData = callbackData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage =
        (WhatsAppInteractiveButtonsMessage) o;
    return Objects.equals(this.from, whatsAppInteractiveButtonsMessage.from)
        && Objects.equals(this.to, whatsAppInteractiveButtonsMessage.to)
        && Objects.equals(this.messageId, whatsAppInteractiveButtonsMessage.messageId)
        && Objects.equals(this.content, whatsAppInteractiveButtonsMessage.content)
        && Objects.equals(this.callbackData, whatsAppInteractiveButtonsMessage.callbackData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, messageId, content, callbackData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppInteractiveButtonsMessage {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    callbackData: ").append(toIndentedString(callbackData)).append("\n");
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
