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

/** WhatsAppQuickReplyContent */
public class WhatsAppQuickReplyContent extends WhatsAppInboundMessage {
  public static final String SERIALIZED_NAME_TEXT = "text";

  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";

  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public WhatsAppQuickReplyContent text(String text) {

    this.text = text;
    return this;
  }

  /**
   * Text of the selected button.
   *
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public WhatsAppQuickReplyContent payload(String payload) {

    this.payload = payload;
    return this;
  }

  /**
   * Payload of the selected button.
   *
   * @return payload
   */
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppQuickReplyContent whatsAppQuickReplyContent = (WhatsAppQuickReplyContent) o;
    return Objects.equals(this.text, whatsAppQuickReplyContent.text)
        && Objects.equals(this.payload, whatsAppQuickReplyContent.payload)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, payload, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppQuickReplyContent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
