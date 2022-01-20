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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** WhatsAppAddress */
public class WhatsAppAddress {
  public static final String SERIALIZED_NAME_STREET = "street";

  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";

  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";

  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";

  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_COUNTRY = "country";

  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";

  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  /** Type of an address. */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HOME("HOME"),

    WORK("WORK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public WhatsAppAddress street(String street) {

    this.street = street;
    return this;
  }

  /**
   * Street name.
   *
   * @return street
   */
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public WhatsAppAddress city(String city) {

    this.city = city;
    return this;
  }

  /**
   * City name.
   *
   * @return city
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public WhatsAppAddress state(String state) {

    this.state = state;
    return this;
  }

  /**
   * State name.
   *
   * @return state
   */
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public WhatsAppAddress zip(String zip) {

    this.zip = zip;
    return this;
  }

  /**
   * Zip value.
   *
   * @return zip
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public WhatsAppAddress country(String country) {

    this.country = country;
    return this;
  }

  /**
   * Country name.
   *
   * @return country
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public WhatsAppAddress countryCode(String countryCode) {

    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code value.
   *
   * @return countryCode
   */
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public WhatsAppAddress type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Type of an address.
   *
   * @return type
   */
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppAddress whatsAppAddress = (WhatsAppAddress) o;
    return Objects.equals(this.street, whatsAppAddress.street)
        && Objects.equals(this.city, whatsAppAddress.city)
        && Objects.equals(this.state, whatsAppAddress.state)
        && Objects.equals(this.zip, whatsAppAddress.zip)
        && Objects.equals(this.country, whatsAppAddress.country)
        && Objects.equals(this.countryCode, whatsAppAddress.countryCode)
        && Objects.equals(this.type, whatsAppAddress.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, state, zip, country, countryCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
