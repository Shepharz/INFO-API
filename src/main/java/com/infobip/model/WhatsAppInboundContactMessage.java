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

/** WhatsAppInboundContactMessage */
public class WhatsAppInboundContactMessage extends WhatsAppInboundMessage {
  public static final String SERIALIZED_NAME_CONTACTS = "contacts";

  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<WhatsAppContact> contacts = null;

  public WhatsAppInboundContactMessage contacts(List<WhatsAppContact> contacts) {

    this.contacts = contacts;
    return this;
  }

  public WhatsAppInboundContactMessage addContactsItem(WhatsAppContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   *
   * @return contacts
   */
  public List<WhatsAppContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<WhatsAppContact> contacts) {
    this.contacts = contacts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppInboundContactMessage whatsAppInboundContactMessage = (WhatsAppInboundContactMessage) o;
    return Objects.equals(this.contacts, whatsAppInboundContactMessage.contacts) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppInboundContactMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
