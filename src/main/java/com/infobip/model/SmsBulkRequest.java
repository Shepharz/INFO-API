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

/** SmsBulkRequest */
public class SmsBulkRequest {
  public static final String SERIALIZED_NAME_SEND_AT = "sendAt";

  @SerializedName(SERIALIZED_NAME_SEND_AT)
  private OffsetDateTime sendAt;

  public SmsBulkRequest sendAt(OffsetDateTime sendAt) {

    this.sendAt = sendAt;
    return this;
  }

  /**
   * Date and time when the message is to be sent. Used for scheduled SMS (see [Scheduled SMS
   * endpoints](#channels/sms/get-scheduled-sms-messages) for more details). Has the following
   * format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   *
   * @return sendAt
   */
  public OffsetDateTime getSendAt() {
    return sendAt;
  }

  public void setSendAt(OffsetDateTime sendAt) {
    this.sendAt = sendAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsBulkRequest smsBulkRequest = (SmsBulkRequest) o;
    return Objects.equals(this.sendAt, smsBulkRequest.sendAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsBulkRequest {\n");
    sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
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
