// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/client.proto
// Protobuf Java Version: 4.28.3

package com.google.api;

public interface GoSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.GoSettings)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1 [json_name = "common"];</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1 [json_name = "common"];</code>
   * @return The common.
   */
  com.google.api.CommonLanguageSettings getCommon();

  /**
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   * go_settings:
   * renamed_services:
   * Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2 [json_name = "renamedServices"];</code>
   */
  int getRenamedServicesCount();
  /**
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   * go_settings:
   * renamed_services:
   * Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2 [json_name = "renamedServices"];</code>
   */
  boolean containsRenamedServices(
      java.lang.String key);
  /**
   * Use {@link #getRenamedServicesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRenamedServices();
  /**
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   * go_settings:
   * renamed_services:
   * Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2 [json_name = "renamedServices"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRenamedServicesMap();
  /**
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   * go_settings:
   * renamed_services:
   * Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2 [json_name = "renamedServices"];</code>
   */

  /* nullable */
java.lang.String getRenamedServicesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   * go_settings:
   * renamed_services:
   * Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2 [json_name = "renamedServices"];</code>
   */

  java.lang.String getRenamedServicesOrThrow(
      java.lang.String key);
}
