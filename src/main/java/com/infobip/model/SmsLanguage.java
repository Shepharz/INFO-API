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

/** SmsLanguage */
public class SmsLanguage {
  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";

  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public SmsLanguage languageCode(String languageCode) {

    this.languageCode = languageCode;
    return this;
  }

  /**
   * Language code for the correct character set. Possible values: &#x60;TR&#x60; for Turkish,
   * &#x60;ES&#x60; for Spanish, &#x60;PT&#x60; for Portuguese, or &#x60;AUTODETECT&#x60; to let
   * platform select the character set based on message content.
   *
   * @return languageCode
   */
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsLanguage smsLanguage = (SmsLanguage) o;
    return Objects.equals(this.languageCode, smsLanguage.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsLanguage {\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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
