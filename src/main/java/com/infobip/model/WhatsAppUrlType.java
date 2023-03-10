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
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Type of the url. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;. */
@JsonAdapter(WhatsAppUrlType.Adapter.class)
public enum WhatsAppUrlType {
  HOME("HOME"),

  WORK("WORK");

  private String value;

  WhatsAppUrlType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WhatsAppUrlType fromValue(String value) {
    for (WhatsAppUrlType b : WhatsAppUrlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WhatsAppUrlType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WhatsAppUrlType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WhatsAppUrlType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WhatsAppUrlType.fromValue(value);
    }
  }
}
