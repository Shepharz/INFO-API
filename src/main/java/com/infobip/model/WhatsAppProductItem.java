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

/** WhatsAppProductItem */
public class WhatsAppProductItem {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";

  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ITEM_PRICE = "itemPrice";

  @SerializedName(SERIALIZED_NAME_ITEM_PRICE)
  private Double itemPrice;

  public static final String SERIALIZED_NAME_PRODUCT_RETAILER_ID = "productRetailerId";

  @SerializedName(SERIALIZED_NAME_PRODUCT_RETAILER_ID)
  private String productRetailerId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";

  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public WhatsAppProductItem currency(String currency) {

    this.currency = currency;
    return this;
  }

  /**
   * Currency of the product.
   *
   * @return currency
   */
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public WhatsAppProductItem itemPrice(Double itemPrice) {

    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * Price of the product.
   *
   * @return itemPrice
   */
  public Double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
  }

  public WhatsAppProductItem productRetailerId(String productRetailerId) {

    this.productRetailerId = productRetailerId;
    return this;
  }

  /**
   * Product&#39;s unique identifier as defined in the catalog.
   *
   * @return productRetailerId
   */
  public String getProductRetailerId() {
    return productRetailerId;
  }

  public void setProductRetailerId(String productRetailerId) {
    this.productRetailerId = productRetailerId;
  }

  public WhatsAppProductItem quantity(Integer quantity) {

    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the ordered product. minimum: 1
   *
   * @return quantity
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppProductItem whatsAppProductItem = (WhatsAppProductItem) o;
    return Objects.equals(this.currency, whatsAppProductItem.currency)
        && Objects.equals(this.itemPrice, whatsAppProductItem.itemPrice)
        && Objects.equals(this.productRetailerId, whatsAppProductItem.productRetailerId)
        && Objects.equals(this.quantity, whatsAppProductItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, itemPrice, productRetailerId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppProductItem {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    productRetailerId: ").append(toIndentedString(productRetailerId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
