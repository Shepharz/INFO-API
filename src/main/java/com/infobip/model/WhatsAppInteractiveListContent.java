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

/** The content object to build a message that will be sent. */
public class WhatsAppInteractiveListContent {
  public static final String SERIALIZED_NAME_BODY = "body";

  @SerializedName(SERIALIZED_NAME_BODY)
  private WhatsAppInteractiveBodyContent body;

  public static final String SERIALIZED_NAME_ACTION = "action";

  @SerializedName(SERIALIZED_NAME_ACTION)
  private WhatsAppInteractiveListActionContent action;

  public static final String SERIALIZED_NAME_HEADER = "header";

  @SerializedName(SERIALIZED_NAME_HEADER)
  private WhatsAppInteractiveListHeaderContent header;

  public static final String SERIALIZED_NAME_FOOTER = "footer";

  @SerializedName(SERIALIZED_NAME_FOOTER)
  private WhatsAppInteractiveFooterContent footer;

  public WhatsAppInteractiveListContent body(WhatsAppInteractiveBodyContent body) {

    this.body = body;
    return this;
  }

  /**
   * Get body
   *
   * @return body
   */
  public WhatsAppInteractiveBodyContent getBody() {
    return body;
  }

  public void setBody(WhatsAppInteractiveBodyContent body) {
    this.body = body;
  }

  public WhatsAppInteractiveListContent action(WhatsAppInteractiveListActionContent action) {

    this.action = action;
    return this;
  }

  /**
   * Get action
   *
   * @return action
   */
  public WhatsAppInteractiveListActionContent getAction() {
    return action;
  }

  public void setAction(WhatsAppInteractiveListActionContent action) {
    this.action = action;
  }

  public WhatsAppInteractiveListContent header(WhatsAppInteractiveListHeaderContent header) {

    this.header = header;
    return this;
  }

  /**
   * Get header
   *
   * @return header
   */
  public WhatsAppInteractiveListHeaderContent getHeader() {
    return header;
  }

  public void setHeader(WhatsAppInteractiveListHeaderContent header) {
    this.header = header;
  }

  public WhatsAppInteractiveListContent footer(WhatsAppInteractiveFooterContent footer) {

    this.footer = footer;
    return this;
  }

  /**
   * Get footer
   *
   * @return footer
   */
  public WhatsAppInteractiveFooterContent getFooter() {
    return footer;
  }

  public void setFooter(WhatsAppInteractiveFooterContent footer) {
    this.footer = footer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppInteractiveListContent whatsAppInteractiveListContent =
        (WhatsAppInteractiveListContent) o;
    return Objects.equals(this.body, whatsAppInteractiveListContent.body)
        && Objects.equals(this.action, whatsAppInteractiveListContent.action)
        && Objects.equals(this.header, whatsAppInteractiveListContent.header)
        && Objects.equals(this.footer, whatsAppInteractiveListContent.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, action, header, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppInteractiveListContent {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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
