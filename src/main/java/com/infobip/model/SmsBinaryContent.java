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

/** SmsBinaryContent */
public class SmsBinaryContent {
  public static final String SERIALIZED_NAME_DATA_CODING = "dataCoding";

  @SerializedName(SERIALIZED_NAME_DATA_CODING)
  private Integer dataCoding;

  public static final String SERIALIZED_NAME_ESM_CLASS = "esmClass";

  @SerializedName(SERIALIZED_NAME_ESM_CLASS)
  private Integer esmClass;

  public static final String SERIALIZED_NAME_HEX = "hex";

  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public SmsBinaryContent dataCoding(Integer dataCoding) {

    this.dataCoding = dataCoding;
    return this;
  }

  /**
   * Binary content data coding. The default value is (&#x60;0&#x60;) for GSM7. Example:
   * (&#x60;8&#x60;) for Unicode data.
   *
   * @return dataCoding
   */
  public Integer getDataCoding() {
    return dataCoding;
  }

  public void setDataCoding(Integer dataCoding) {
    this.dataCoding = dataCoding;
  }

  public SmsBinaryContent esmClass(Integer esmClass) {

    this.esmClass = esmClass;
    return this;
  }

  /**
   * “Esm_class” parameter. Indicate special message attributes associated with the SMS. Default
   * value is (&#x60;0&#x60;).
   *
   * @return esmClass
   */
  public Integer getEsmClass() {
    return esmClass;
  }

  public void setEsmClass(Integer esmClass) {
    this.esmClass = esmClass;
  }

  public SmsBinaryContent hex(String hex) {

    this.hex = hex;
    return this;
  }

  /**
   * Hexadecimal string. This is the representation of your binary data. Two hex digits represent
   * one byte. They should be separated by the space character (Example: &#x60;0f c2 4a bf 34 13
   * ba&#x60;).
   *
   * @return hex
   */
  public String getHex() {
    return hex;
  }

  public void setHex(String hex) {
    this.hex = hex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsBinaryContent smsBinaryContent = (SmsBinaryContent) o;
    return Objects.equals(this.dataCoding, smsBinaryContent.dataCoding)
        && Objects.equals(this.esmClass, smsBinaryContent.esmClass)
        && Objects.equals(this.hex, smsBinaryContent.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCoding, esmClass, hex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsBinaryContent {\n");
    sb.append("    dataCoding: ").append(toIndentedString(dataCoding)).append("\n");
    sb.append("    esmClass: ").append(toIndentedString(esmClass)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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
