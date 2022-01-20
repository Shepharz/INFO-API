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

/** WhatsAppTemplatesApiResponse */
public class WhatsAppTemplatesApiResponse {
  public static final String SERIALIZED_NAME_TEMPLATES = "templates";

  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<WhatsAppTemplateApiResponse> templates = null;

  public WhatsAppTemplatesApiResponse templates(List<WhatsAppTemplateApiResponse> templates) {

    this.templates = templates;
    return this;
  }

  public WhatsAppTemplatesApiResponse addTemplatesItem(WhatsAppTemplateApiResponse templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * List of all templates for given sender.
   *
   * @return templates
   */
  public List<WhatsAppTemplateApiResponse> getTemplates() {
    return templates;
  }

  public void setTemplates(List<WhatsAppTemplateApiResponse> templates) {
    this.templates = templates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppTemplatesApiResponse whatsAppTemplatesApiResponse = (WhatsAppTemplatesApiResponse) o;
    return Objects.equals(this.templates, whatsAppTemplatesApiResponse.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppTemplatesApiResponse {\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
