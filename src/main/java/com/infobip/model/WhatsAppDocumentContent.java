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
public class WhatsAppDocumentContent {
  public static final String SERIALIZED_NAME_MEDIA_URL = "mediaUrl";

  @SerializedName(SERIALIZED_NAME_MEDIA_URL)
  private String mediaUrl;

  public static final String SERIALIZED_NAME_CAPTION = "caption";

  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_FILENAME = "filename";

  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public WhatsAppDocumentContent mediaUrl(String mediaUrl) {

    this.mediaUrl = mediaUrl;
    return this;
  }

  /**
   * URL of a document sent in a WhatsApp message. Must be a valid URL starting with
   * &#x60;https://&#x60;, &#x60;http://&#x60; or &#x60;ftp://&#x60;. Maximum document size is
   * 100MB.
   *
   * @return mediaUrl
   */
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public WhatsAppDocumentContent caption(String caption) {

    this.caption = caption;
    return this;
  }

  /**
   * Caption of the document.
   *
   * @return caption
   */
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public WhatsAppDocumentContent filename(String filename) {

    this.filename = filename;
    return this;
  }

  /**
   * File name of the document.
   *
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppDocumentContent whatsAppDocumentContent = (WhatsAppDocumentContent) o;
    return Objects.equals(this.mediaUrl, whatsAppDocumentContent.mediaUrl)
        && Objects.equals(this.caption, whatsAppDocumentContent.caption)
        && Objects.equals(this.filename, whatsAppDocumentContent.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUrl, caption, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppDocumentContent {\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
