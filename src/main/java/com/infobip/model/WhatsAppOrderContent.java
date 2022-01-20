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

/** WhatsAppOrderContent */
public class WhatsAppOrderContent extends WhatsAppInboundMessage {
  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";

  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private String catalogId;

  public static final String SERIALIZED_NAME_TEXT = "text";

  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_PRODUCT_ITEMS = "productItems";

  @SerializedName(SERIALIZED_NAME_PRODUCT_ITEMS)
  private List<WhatsAppProductItem> productItems = new ArrayList<>();

  public WhatsAppOrderContent catalogId(String catalogId) {

    this.catalogId = catalogId;
    return this;
  }

  /**
   * The ID that uniquely identifies the catalog registered with Facebook, connected to the WABA the
   * sender belongs to.
   *
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public WhatsAppOrderContent text(String text) {

    this.text = text;
    return this;
  }

  /**
   * Text sent with order.
   *
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public WhatsAppOrderContent productItems(List<WhatsAppProductItem> productItems) {

    this.productItems = productItems;
    return this;
  }

  public WhatsAppOrderContent addProductItemsItem(WhatsAppProductItem productItemsItem) {
    this.productItems.add(productItemsItem);
    return this;
  }

  /**
   * An array of selected products.
   *
   * @return productItems
   */
  public List<WhatsAppProductItem> getProductItems() {
    return productItems;
  }

  public void setProductItems(List<WhatsAppProductItem> productItems) {
    this.productItems = productItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppOrderContent whatsAppOrderContent = (WhatsAppOrderContent) o;
    return Objects.equals(this.catalogId, whatsAppOrderContent.catalogId)
        && Objects.equals(this.text, whatsAppOrderContent.text)
        && Objects.equals(this.productItems, whatsAppOrderContent.productItems)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, text, productItems, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppOrderContent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    productItems: ").append(toIndentedString(productItems)).append("\n");
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
