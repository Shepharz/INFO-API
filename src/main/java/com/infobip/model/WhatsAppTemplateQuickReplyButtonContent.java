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

/** WhatsAppTemplateQuickReplyButtonContent */
public class WhatsAppTemplateQuickReplyButtonContent extends WhatsAppTemplateButtonContent {
  public static final String SERIALIZED_NAME_PARAMETER = "parameter";

  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public WhatsAppTemplateQuickReplyButtonContent parameter(String parameter) {

    this.parameter = parameter;
    return this;
  }

  /**
   * Payload of a &#x60;quick reply&#x60; button.
   *
   * @return parameter
   */
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppTemplateQuickReplyButtonContent whatsAppTemplateQuickReplyButtonContent =
        (WhatsAppTemplateQuickReplyButtonContent) o;
    return Objects.equals(this.parameter, whatsAppTemplateQuickReplyButtonContent.parameter)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppTemplateQuickReplyButtonContent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
