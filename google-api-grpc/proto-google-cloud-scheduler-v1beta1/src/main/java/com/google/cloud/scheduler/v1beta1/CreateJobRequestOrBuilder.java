// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

package com.google.cloud.scheduler.v1beta1;

public interface CreateJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.CreateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required.
   * The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required.
   * The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1beta1.Job.name]. [name][google.cloud.scheduler.v1beta1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1beta1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 2;</code>
   */
  boolean hasJob();
  /**
   * <pre>
   * Required.
   * The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1beta1.Job.name]. [name][google.cloud.scheduler.v1beta1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1beta1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 2;</code>
   */
  com.google.cloud.scheduler.v1beta1.Job getJob();
  /**
   * <pre>
   * Required.
   * The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1beta1.Job.name]. [name][google.cloud.scheduler.v1beta1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1beta1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 2;</code>
   */
  com.google.cloud.scheduler.v1beta1.JobOrBuilder getJobOrBuilder();
}
