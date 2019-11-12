/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.70.0.156820
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfusionsoftStackTraceElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftStackTraceElement {
  @SerializedName("className")
  private String className = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("lineNumber")
  private Integer lineNumber = null;

  @SerializedName("methodName")
  private String methodName = null;

  @SerializedName("nativeMethod")
  private Boolean nativeMethod = null;

  public InfusionsoftStackTraceElement className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @ApiModelProperty(value = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public InfusionsoftStackTraceElement fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public InfusionsoftStackTraceElement lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public InfusionsoftStackTraceElement methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

   /**
   * Get methodName
   * @return methodName
  **/
  @ApiModelProperty(value = "")
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public InfusionsoftStackTraceElement nativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }

   /**
   * Get nativeMethod
   * @return nativeMethod
  **/
  @ApiModelProperty(value = "")
  public Boolean isNativeMethod() {
    return nativeMethod;
  }

  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftStackTraceElement stackTraceElement = (InfusionsoftStackTraceElement) o;
    return Objects.equals(this.className, stackTraceElement.className) &&
        Objects.equals(this.fileName, stackTraceElement.fileName) &&
        Objects.equals(this.lineNumber, stackTraceElement.lineNumber) &&
        Objects.equals(this.methodName, stackTraceElement.methodName) &&
        Objects.equals(this.nativeMethod, stackTraceElement.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, fileName, lineNumber, methodName, nativeMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftStackTraceElement {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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

