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
import java.util.List;
import java.util.Objects;

/** SmsPreviewResponse */
public class SmsPreviewResponse {
  public static final String SERIALIZED_NAME_ORIGINAL_TEXT = "originalText";

  @SerializedName(SERIALIZED_NAME_ORIGINAL_TEXT)
  private String originalText;

  public static final String SERIALIZED_NAME_PREVIEWS = "previews";

  @SerializedName(SERIALIZED_NAME_PREVIEWS)
  private List<SmsPreview> previews = null;

  /**
   * Message content supplied in the request.
   *
   * @return originalText
   */
  public String getOriginalText() {
    return originalText;
  }

  /**
   * Allows for previewing the original message content once additional language configuration has
   * been applied to it.
   *
   * @return previews
   */
  public List<SmsPreview> getPreviews() {
    return previews;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsPreviewResponse smsPreviewResponse = (SmsPreviewResponse) o;
    return Objects.equals(this.originalText, smsPreviewResponse.originalText)
        && Objects.equals(this.previews, smsPreviewResponse.previews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalText, previews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsPreviewResponse {\n");
    sb.append("    originalText: ").append(toIndentedString(originalText)).append("\n");
    sb.append("    previews: ").append(toIndentedString(previews)).append("\n");
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
