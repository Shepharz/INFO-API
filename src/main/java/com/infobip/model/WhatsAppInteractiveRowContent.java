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

/**
 * Array of rows sent in the section. Section must contain at least one row. Message can have up to
 * ten rows.
 */
public class WhatsAppInteractiveRowContent {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";

  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public WhatsAppInteractiveRowContent id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Identifier of the row. It must be unique across all sections.
   *
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WhatsAppInteractiveRowContent title(String title) {

    this.title = title;
    return this;
  }

  /**
   * Title of the row.
   *
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public WhatsAppInteractiveRowContent description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Description of the row.
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppInteractiveRowContent whatsAppInteractiveRowContent = (WhatsAppInteractiveRowContent) o;
    return Objects.equals(this.id, whatsAppInteractiveRowContent.id)
        && Objects.equals(this.title, whatsAppInteractiveRowContent.title)
        && Objects.equals(this.description, whatsAppInteractiveRowContent.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppInteractiveRowContent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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