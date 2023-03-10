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

/** EmailReport */
public class EmailReport {
  public static final String SERIALIZED_NAME_BULK_ID = "bulkId";

  @SerializedName(SERIALIZED_NAME_BULK_ID)
  private String bulkId;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_SENT_AT = "sentAt";

  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_DONE_AT = "doneAt";

  @SerializedName(SERIALIZED_NAME_DONE_AT)
  private OffsetDateTime doneAt;

  public static final String SERIALIZED_NAME_MESSAGE_COUNT = "messageCount";

  @SerializedName(SERIALIZED_NAME_MESSAGE_COUNT)
  private Integer messageCount;

  public static final String SERIALIZED_NAME_PRICE = "price";

  @SerializedName(SERIALIZED_NAME_PRICE)
  private EmailPrice price;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private EmailStatus status;

  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private EmailReportError error;

  public EmailReport bulkId(String bulkId) {

    this.bulkId = bulkId;
    return this;
  }

  /**
   * The ID that uniquely identifies bulks of request.
   *
   * @return bulkId
   */
  public String getBulkId() {
    return bulkId;
  }

  public void setBulkId(String bulkId) {
    this.bulkId = bulkId;
  }

  public EmailReport messageId(String messageId) {

    this.messageId = messageId;
    return this;
  }

  /**
   * The ID that uniquely identifies the sent email request.
   *
   * @return messageId
   */
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public EmailReport to(String to) {

    this.to = to;
    return this;
  }

  /**
   * The recipient email address.
   *
   * @return to
   */
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public EmailReport sentAt(OffsetDateTime sentAt) {

    this.sentAt = sentAt;
    return this;
  }

  /**
   * Tells when the email was initiated. Has the following format:
   * &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   *
   * @return sentAt
   */
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }

  public EmailReport doneAt(OffsetDateTime doneAt) {

    this.doneAt = doneAt;
    return this;
  }

  /**
   * Tells when the email request was processed by Infobip
   *
   * @return doneAt
   */
  public OffsetDateTime getDoneAt() {
    return doneAt;
  }

  public void setDoneAt(OffsetDateTime doneAt) {
    this.doneAt = doneAt;
  }

  public EmailReport messageCount(Integer messageCount) {

    this.messageCount = messageCount;
    return this;
  }

  /**
   * Email request count.
   *
   * @return messageCount
   */
  public Integer getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  public EmailReport price(EmailPrice price) {

    this.price = price;
    return this;
  }

  /**
   * Get price
   *
   * @return price
   */
  public EmailPrice getPrice() {
    return price;
  }

  public void setPrice(EmailPrice price) {
    this.price = price;
  }

  public EmailReport status(EmailStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  public EmailStatus getStatus() {
    return status;
  }

  public void setStatus(EmailStatus status) {
    this.status = status;
  }

  public EmailReport error(EmailReportError error) {

    this.error = error;
    return this;
  }

  /**
   * Get error
   *
   * @return error
   */
  public EmailReportError getError() {
    return error;
  }

  public void setError(EmailReportError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailReport emailReport = (EmailReport) o;
    return Objects.equals(this.bulkId, emailReport.bulkId)
        && Objects.equals(this.messageId, emailReport.messageId)
        && Objects.equals(this.to, emailReport.to)
        && Objects.equals(this.sentAt, emailReport.sentAt)
        && Objects.equals(this.doneAt, emailReport.doneAt)
        && Objects.equals(this.messageCount, emailReport.messageCount)
        && Objects.equals(this.price, emailReport.price)
        && Objects.equals(this.status, emailReport.status)
        && Objects.equals(this.error, emailReport.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkId, messageId, to, sentAt, doneAt, messageCount, price, status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailReport {\n");
    sb.append("    bulkId: ").append(toIndentedString(bulkId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    doneAt: ").append(toIndentedString(doneAt)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
