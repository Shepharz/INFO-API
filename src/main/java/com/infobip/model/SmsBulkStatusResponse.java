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

/** SmsBulkStatusResponse */
public class SmsBulkStatusResponse {
  public static final String SERIALIZED_NAME_BULK_ID = "bulkId";

  @SerializedName(SERIALIZED_NAME_BULK_ID)
  private String bulkId;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private SmsBulkStatus status = null;

  /**
   * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages
   * via a single API request.
   *
   * @return bulkId
   */
  public String getBulkId() {
    return bulkId;
  }

  /**
   * The status of the message(s).
   *
   * @return status
   */
  public SmsBulkStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsBulkStatusResponse smsBulkStatusResponse = (SmsBulkStatusResponse) o;
    return Objects.equals(this.bulkId, smsBulkStatusResponse.bulkId)
        && Objects.equals(this.status, smsBulkStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsBulkStatusResponse {\n");
    sb.append("    bulkId: ").append(toIndentedString(bulkId)).append("\n");
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
