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

/** WhatsAppSingleMessageInfo */
public class WhatsAppSingleMessageInfo {
  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_MESSAGE_COUNT = "messageCount";

  @SerializedName(SERIALIZED_NAME_MESSAGE_COUNT)
  private Integer messageCount;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private WhatsAppSingleMessageStatus status;

  public WhatsAppSingleMessageInfo to(String to) {

    this.to = to;
    return this;
  }

  /**
   * Message destination.
   *
   * @return to
   */
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public WhatsAppSingleMessageInfo messageCount(Integer messageCount) {

    this.messageCount = messageCount;
    return this;
  }

  /**
   * Number of messages required to deliver.
   *
   * @return messageCount
   */
  public Integer getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  public WhatsAppSingleMessageInfo messageId(String messageId) {

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

  public WhatsAppSingleMessageInfo status(WhatsAppSingleMessageStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  public WhatsAppSingleMessageStatus getStatus() {
    return status;
  }

  public void setStatus(WhatsAppSingleMessageStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = (WhatsAppSingleMessageInfo) o;
    return Objects.equals(this.to, whatsAppSingleMessageInfo.to)
        && Objects.equals(this.messageCount, whatsAppSingleMessageInfo.messageCount)
        && Objects.equals(this.messageId, whatsAppSingleMessageInfo.messageId)
        && Objects.equals(this.status, whatsAppSingleMessageInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, messageCount, messageId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppSingleMessageInfo {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
