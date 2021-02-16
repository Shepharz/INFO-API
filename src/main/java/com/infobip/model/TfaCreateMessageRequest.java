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

/** TfaCreateMessageRequest */
public class TfaCreateMessageRequest {
  public static final String SERIALIZED_NAME_REGIONAL = "regional";

  @SerializedName(SERIALIZED_NAME_REGIONAL)
  private TfaRegionalOptions regional = null;

  public static final String SERIALIZED_NAME_REPEAT_D_T_M_F = "repeatDTMF";

  @SerializedName(SERIALIZED_NAME_REPEAT_D_T_M_F)
  private String repeatDTMF;

  public static final String SERIALIZED_NAME_SPEECH_RATE = "speechRate";

  @SerializedName(SERIALIZED_NAME_SPEECH_RATE)
  private Double speechRate;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT = "messageText";

  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT)
  private String messageText;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";

  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private TfaLanguage language = null;

  public static final String SERIALIZED_NAME_PIN_LENGTH = "pinLength";

  @SerializedName(SERIALIZED_NAME_PIN_LENGTH)
  private Integer pinLength;

  public static final String SERIALIZED_NAME_SENDER_ID = "senderId";

  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_PIN_TYPE = "pinType";

  @SerializedName(SERIALIZED_NAME_PIN_TYPE)
  private TfaPinType pinType = null;

  public TfaCreateMessageRequest regional(TfaRegionalOptions regional) {

    this.regional = regional;
    return this;
  }

  /**
   * Region specific parameters, often specified by local laws. Use this if country or region that
   * you are sending SMS to requires some extra parameters.
   *
   * @return regional
   */
  public TfaRegionalOptions getRegional() {
    return regional;
  }

  public void setRegional(TfaRegionalOptions regional) {
    this.regional = regional;
  }

  public TfaCreateMessageRequest repeatDTMF(String repeatDTMF) {

    this.repeatDTMF = repeatDTMF;
    return this;
  }

  /**
   * In case PIN message is sent by Voice, DTMF code will enable replaying the message.
   *
   * @return repeatDTMF
   */
  public String getRepeatDTMF() {
    return repeatDTMF;
  }

  public void setRepeatDTMF(String repeatDTMF) {
    this.repeatDTMF = repeatDTMF;
  }

  public TfaCreateMessageRequest speechRate(Double speechRate) {

    this.speechRate = speechRate;
    return this;
  }

  /**
   * In case PIN message is sent by Voice, the speed of speech can be set for the message. Supported
   * range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
   *
   * @return speechRate
   */
  public Double getSpeechRate() {
    return speechRate;
  }

  public void setSpeechRate(Double speechRate) {
    this.speechRate = speechRate;
  }

  public TfaCreateMessageRequest messageText(String messageText) {

    this.messageText = messageText;
    return this;
  }

  /**
   * Text of a message that will be sent. It can contain placeholders that will be replaced upon
   * sending. Placeholder format is &#x60;{{placeholderName}}&#x60;. Message text must contain
   * &#x60;{{pin}}&#x60; placeholder.
   *
   * @return messageText
   */
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public TfaCreateMessageRequest language(TfaLanguage language) {

    this.language = language;
    return this;
  }

  /**
   * Language code of language in which message text is written. It is used for reading the message
   * when it is sent via voice. If no language is set, message will be read in &#x60;English&#x60;.
   *
   * @return language
   */
  public TfaLanguage getLanguage() {
    return language;
  }

  public void setLanguage(TfaLanguage language) {
    this.language = language;
  }

  public TfaCreateMessageRequest pinLength(Integer pinLength) {

    this.pinLength = pinLength;
    return this;
  }

  /**
   * PIN code length.
   *
   * @return pinLength
   */
  public Integer getPinLength() {
    return pinLength;
  }

  public void setPinLength(Integer pinLength) {
    this.pinLength = pinLength;
  }

  public TfaCreateMessageRequest senderId(String senderId) {

    this.senderId = senderId;
    return this;
  }

  /**
   * The name that will appear as the sender of the 2FA message (Example: CompanyName).
   *
   * @return senderId
   */
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public TfaCreateMessageRequest pinType(TfaPinType pinType) {

    this.pinType = pinType;
    return this;
  }

  /**
   * Type of PIN code that will be generated and sent as part of 2FA message.
   *
   * @return pinType
   */
  public TfaPinType getPinType() {
    return pinType;
  }

  public void setPinType(TfaPinType pinType) {
    this.pinType = pinType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaCreateMessageRequest tfaCreateMessageRequest = (TfaCreateMessageRequest) o;
    return Objects.equals(this.regional, tfaCreateMessageRequest.regional)
        && Objects.equals(this.repeatDTMF, tfaCreateMessageRequest.repeatDTMF)
        && Objects.equals(this.speechRate, tfaCreateMessageRequest.speechRate)
        && Objects.equals(this.messageText, tfaCreateMessageRequest.messageText)
        && Objects.equals(this.language, tfaCreateMessageRequest.language)
        && Objects.equals(this.pinLength, tfaCreateMessageRequest.pinLength)
        && Objects.equals(this.senderId, tfaCreateMessageRequest.senderId)
        && Objects.equals(this.pinType, tfaCreateMessageRequest.pinType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        regional, repeatDTMF, speechRate, messageText, language, pinLength, senderId, pinType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfaCreateMessageRequest {\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
    sb.append("    repeatDTMF: ").append(toIndentedString(repeatDTMF)).append("\n");
    sb.append("    speechRate: ").append(toIndentedString(speechRate)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    pinLength: ").append(toIndentedString(pinLength)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    pinType: ").append(toIndentedString(pinType)).append("\n");
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
