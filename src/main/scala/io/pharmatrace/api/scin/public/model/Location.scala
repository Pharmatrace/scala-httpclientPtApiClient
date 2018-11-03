/**
 * PharmaTrace Supply Chain Information Network API
 * The PharmaTrace SCIN API provides network members a resource and process oriented access to the blockchain backed market and inventory information. It represents a layer of abstraction above the Hyperledger network to facilitate a business focused development of clients and integration systems without the need to directly connect to Hyperledger nodes.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: api@pharmatrace.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.pharmatrace.api.scin.public.model


case class Location (
  // GMT, C time format.
  timestamp: Option[Long] = None,
  // Unique identifier for the location.
  uuid: Option[String] = None,
  // longitude.
  longitude: Option[Number] = None,
  // latitude.
  latitude: Option[Number] = None,
  // type of container location, e.g. VESSEL, AIR, STREET, WAREHOUSE, PROCESSING, STORE, WITH_PATIENT, ...
  locationType: Option[String] = None
)

