package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserInfoList
 */

public class UserInfoList {
  @JsonProperty("users")
  private java.util.List<UserInfo> users = new java.util.ArrayList<UserInfo>();

  public UserInfoList users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }

  public UserInfoList addUsersItem(UserInfo usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<UserInfo> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoList userInfoList = (UserInfoList) o;
    return Objects.equals(this.users, userInfoList.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoList {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

