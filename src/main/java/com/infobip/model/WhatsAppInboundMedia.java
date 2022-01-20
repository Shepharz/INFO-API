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

/** WhatsAppInboundMedia */
public class WhatsAppInboundMedia {
  public static final String SERIALIZED_NAME_CAPTION = "caption";

  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public WhatsAppInboundMedia caption(String caption) {

    this.caption = caption;
    return this;
  }

  /**
   * Media Caption.
   *
   * @return caption
   */
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public WhatsAppInboundMedia url(String url) {

    this.url = url;
    return this;
  }

  /**
   * Url for media download.
   *
   * @return url
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppInboundMedia whatsAppInboundMedia = (WhatsAppInboundMedia) o;
    return Objects.equals(this.caption, whatsAppInboundMedia.caption)
        && Objects.equals(this.url, whatsAppInboundMedia.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppInboundMedia {\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
