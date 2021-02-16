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

/** SmsBulkResponse */
public class SmsBulkResponse {
  public static final String SERIALIZED_NAME_SEND_AT = "sendAt";

  @SerializedName(SERIALIZED_NAME_SEND_AT)
  private OffsetDateTime sendAt;

  public static final String SERIALIZED_NAME_BULK_ID = "bulkId";

  @SerializedName(SERIALIZED_NAME_BULK_ID)
  private String bulkId;

  public SmsBulkResponse sendAt(OffsetDateTime sendAt) {

    this.sendAt = sendAt;
    return this;
  }

  /**
   * Get sendAt
   *
   * @return sendAt
   */
  public OffsetDateTime getSendAt() {
    return sendAt;
  }

  public void setSendAt(OffsetDateTime sendAt) {
    this.sendAt = sendAt;
  }

  public SmsBulkResponse bulkId(String bulkId) {

    this.bulkId = bulkId;
    return this;
  }

  /**
   * Get bulkId
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
    SmsBulkResponse smsBulkResponse = (SmsBulkResponse) o;
    return Objects.equals(this.sendAt, smsBulkResponse.sendAt)
        && Objects.equals(this.bulkId, smsBulkResponse.bulkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendAt, bulkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsBulkResponse {\n");
    sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
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