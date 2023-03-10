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

/** MessagePrice */
public class MessagePrice {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";

  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PRICE_PER_MESSAGE = "pricePerMessage";

  @SerializedName(SERIALIZED_NAME_PRICE_PER_MESSAGE)
  private Double pricePerMessage;

  public MessagePrice currency(String currency) {

    this.currency = currency;
    return this;
  }

  /**
   * The currency in which the price is displayed.
   *
   * @return currency
   */
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public MessagePrice pricePerMessage(Double pricePerMessage) {

    this.pricePerMessage = pricePerMessage;
    return this;
  }

  /**
   * The price per individual message.
   *
   * @return pricePerMessage
   */
  public Double getPricePerMessage() {
    return pricePerMessage;
  }

  public void setPricePerMessage(Double pricePerMessage) {
    this.pricePerMessage = pricePerMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePrice messagePrice = (MessagePrice) o;
    return Objects.equals(this.currency, messagePrice.currency)
        && Objects.equals(this.pricePerMessage, messagePrice.pricePerMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, pricePerMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePrice {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    pricePerMessage: ").append(toIndentedString(pricePerMessage)).append("\n");
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
