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

/** MessageStatus */
public class MessageStatus {
  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";

  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";

  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTION = "action";

  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public MessageStatus groupName(String groupName) {

    this.groupName = groupName;
    return this;
  }

  /**
   * Group name for the status.
   *
   * @return groupName
   */
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public MessageStatus id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Status ID.
   *
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessageStatus groupId(Integer groupId) {

    this.groupId = groupId;
    return this;
  }

  /**
   * Status group ID.
   *
   * @return groupId
   */
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public MessageStatus name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Status name.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MessageStatus action(String action) {

    this.action = action;
    return this;
  }

  /**
   * Action that should be taken to fix the error.
   *
   * @return action
   */
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public MessageStatus description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the status.
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStatus messageStatus = (MessageStatus) o;
    return Objects.equals(this.groupName, messageStatus.groupName)
        && Objects.equals(this.id, messageStatus.id)
        && Objects.equals(this.groupId, messageStatus.groupId)
        && Objects.equals(this.name, messageStatus.name)
        && Objects.equals(this.action, messageStatus.action)
        && Objects.equals(this.description, messageStatus.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, id, groupId, name, action, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatus {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
