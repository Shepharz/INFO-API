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
import java.util.Objects;

/** WhatsAppDeletedReport */
public class WhatsAppDeletedReport {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_SENT_AT = "sentAt";

  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";

  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;

  public WhatsAppDeletedReport messageId(String messageId) {

    this.messageId = messageId;
    return this;
  }

  /**
   * The ID of the sent message.
   *
   * @return messageId
   */
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public WhatsAppDeletedReport from(String from) {

    this.from = from;
    return this;
  }

  /**
   * Number which sent the message.
   *
   * @return from
   */
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public WhatsAppDeletedReport to(String to) {

    this.to = to;
    return this;
  }

  /**
   * Registered WhatsApp business number.
   *
   * @return to
   */
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public WhatsAppDeletedReport sentAt(OffsetDateTime sentAt) {

    this.sentAt = sentAt;
    return this;
  }

  /**
   * Tells when the message was sent.
   *
   * @return sentAt
   */
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }

  public WhatsAppDeletedReport deletedAt(OffsetDateTime deletedAt) {

    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * Tells when the message was deleted.
   *
   * @return deletedAt
   */
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppDeletedReport whatsAppDeletedReport = (WhatsAppDeletedReport) o;
    return Objects.equals(this.messageId, whatsAppDeletedReport.messageId)
        && Objects.equals(this.from, whatsAppDeletedReport.from)
        && Objects.equals(this.to, whatsAppDeletedReport.to)
        && Objects.equals(this.sentAt, whatsAppDeletedReport.sentAt)
        && Objects.equals(this.deletedAt, whatsAppDeletedReport.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, from, to, sentAt, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppDeletedReport {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
