/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.3.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccessStatusDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class AccessStatusDTO {
  @SerializedName("identity")
  private String identity = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

   /**
   * The user identity.
   * @return identity
  **/
  @ApiModelProperty(example = "null", value = "The user identity.")
  public String getIdentity() {
    return identity;
  }

   /**
   * The user access status.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The user access status.")
  public String getStatus() {
    return status;
  }

   /**
   * Additional details about the user access status.
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "Additional details about the user access status.")
  public String getMessage() {
    return message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessStatusDTO accessStatusDTO = (AccessStatusDTO) o;
    return Objects.equals(this.identity, accessStatusDTO.identity) &&
        Objects.equals(this.status, accessStatusDTO.status) &&
        Objects.equals(this.message, accessStatusDTO.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessStatusDTO {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

