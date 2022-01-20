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

/** TfaMessage */
public class TfaMessage {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";

  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";

  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private TfaLanguage language = null;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT = "messageText";

  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT)
  private String messageText;

  public static final String SERIALIZED_NAME_PIN_LENGTH = "pinLength";

  @SerializedName(SERIALIZED_NAME_PIN_LENGTH)
  private Integer pinLength;

  public static final String SERIALIZED_NAME_PIN_PLACEHOLDER = "pinPlaceholder";

  @SerializedName(SERIALIZED_NAME_PIN_PLACEHOLDER)
  private String pinPlaceholder;

  public static final String SERIALIZED_NAME_PIN_TYPE = "pinType";

  @SerializedName(SERIALIZED_NAME_PIN_TYPE)
  private TfaPinType pinType = null;

  public static final String SERIALIZED_NAME_REGIONAL = "regional";

  @SerializedName(SERIALIZED_NAME_REGIONAL)
  private TfaRegionalOptions regional = null;

  public static final String SERIALIZED_NAME_REPEAT_D_T_M_F = "repeatDTMF";

  @SerializedName(SERIALIZED_NAME_REPEAT_D_T_M_F)
  private String repeatDTMF;

  public static final String SERIALIZED_NAME_SENDER_ID = "senderId";

  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_SPEECH_RATE = "speechRate";

  @SerializedName(SERIALIZED_NAME_SPEECH_RATE)
  private Double speechRate;

  public TfaMessage applicationId(String applicationId) {

    this.applicationId = applicationId;
    return this;
  }

  /**
   * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing
   * the password, etc.) for which the requested message has been created.
   *
   * @return applicationId
   */
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public TfaMessage language(TfaLanguage language) {

    this.language = language;
    return this;
  }

  /**
   * The language code which message is written in used when sending text-to-speech messages. If not
   * defined, it will default to English (&#x60;en&#x60;).
   *
   * @return language
   */
  public TfaLanguage getLanguage() {
    return language;
  }

  public void setLanguage(TfaLanguage language) {
    this.language = language;
  }

  public TfaMessage messageId(String messageId) {

    this.messageId = messageId;
    return this;
  }

  /**
   * The ID of the message template (message body with the PIN placeholder) that is sent to the
   * recipient.
   *
   * @return messageId
   */
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public TfaMessage messageText(String messageText) {

    this.messageText = messageText;
    return this;
  }

  /**
   * Text of a message that will be sent. Message text must contain &#x60;pinPlaceholder&#x60;.
   *
   * @return messageText
   */
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public TfaMessage pinLength(Integer pinLength) {

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

  public TfaMessage pinPlaceholder(String pinPlaceholder) {

    this.pinPlaceholder = pinPlaceholder;
    return this;
  }

  /**
   * The PIN code placeholder that will be replaced with a generated PIN code.
   *
   * @return pinPlaceholder
   */
  public String getPinPlaceholder() {
    return pinPlaceholder;
  }

  public void setPinPlaceholder(String pinPlaceholder) {
    this.pinPlaceholder = pinPlaceholder;
  }

  public TfaMessage pinType(TfaPinType pinType) {

    this.pinType = pinType;
    return this;
  }

  /**
   * The type of PIN code that will be generated and sent as part of 2FA message. You can set PIN
   * type to numeric, alpha, alphanumeric or hex.
   *
   * @return pinType
   */
  public TfaPinType getPinType() {
    return pinType;
  }

  public void setPinType(TfaPinType pinType) {
    this.pinType = pinType;
  }

  public TfaMessage regional(TfaRegionalOptions regional) {

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

  public TfaMessage repeatDTMF(String repeatDTMF) {

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

  public TfaMessage senderId(String senderId) {

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

  public TfaMessage speechRate(Double speechRate) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaMessage tfaMessage = (TfaMessage) o;
    return Objects.equals(this.applicationId, tfaMessage.applicationId)
        && Objects.equals(this.language, tfaMessage.language)
        && Objects.equals(this.messageId, tfaMessage.messageId)
        && Objects.equals(this.messageText, tfaMessage.messageText)
        && Objects.equals(this.pinLength, tfaMessage.pinLength)
        && Objects.equals(this.pinPlaceholder, tfaMessage.pinPlaceholder)
        && Objects.equals(this.pinType, tfaMessage.pinType)
        && Objects.equals(this.regional, tfaMessage.regional)
        && Objects.equals(this.repeatDTMF, tfaMessage.repeatDTMF)
        && Objects.equals(this.senderId, tfaMessage.senderId)
        && Objects.equals(this.speechRate, tfaMessage.speechRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        language,
        messageId,
        messageText,
        pinLength,
        pinPlaceholder,
        pinType,
        regional,
        repeatDTMF,
        senderId,
        speechRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfaMessage {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    pinLength: ").append(toIndentedString(pinLength)).append("\n");
    sb.append("    pinPlaceholder: ").append(toIndentedString(pinPlaceholder)).append("\n");
    sb.append("    pinType: ").append(toIndentedString(pinType)).append("\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
    sb.append("    repeatDTMF: ").append(toIndentedString(repeatDTMF)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    speechRate: ").append(toIndentedString(speechRate)).append("\n");
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
