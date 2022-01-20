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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** WhatsAppBulkMessageInfo */
public class WhatsAppBulkMessageInfo {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";

  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<WhatsAppSingleMessageInfo> messages = null;

  public static final String SERIALIZED_NAME_BULK_ID = "bulkId";

  @SerializedName(SERIALIZED_NAME_BULK_ID)
  private String bulkId;

  public WhatsAppBulkMessageInfo messages(List<WhatsAppSingleMessageInfo> messages) {

    this.messages = messages;
    return this;
  }

  public WhatsAppBulkMessageInfo addMessagesItem(WhatsAppSingleMessageInfo messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Array of sent message objects, one object per every message.
   *
   * @return messages
   */
  public List<WhatsAppSingleMessageInfo> getMessages() {
    return messages;
  }

  public void setMessages(List<WhatsAppSingleMessageInfo> messages) {
    this.messages = messages;
  }

  public WhatsAppBulkMessageInfo bulkId(String bulkId) {

    this.bulkId = bulkId;
    return this;
  }

  /**
   * The ID that uniquely identifies the request. Bulk ID will be received only when you send a
   * message to more than one destination address.
   *
   * @return bulkId
   */
  public String getBulkId() {
    return bulkId;
  }

  public void setBulkId(String bulkId) {
    this.bulkId = bulkId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppBulkMessageInfo whatsAppBulkMessageInfo = (WhatsAppBulkMessageInfo) o;
    return Objects.equals(this.messages, whatsAppBulkMessageInfo.messages)
        && Objects.equals(this.bulkId, whatsAppBulkMessageInfo.bulkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, bulkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppBulkMessageInfo {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    bulkId: ").append(toIndentedString(bulkId)).append("\n");
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
