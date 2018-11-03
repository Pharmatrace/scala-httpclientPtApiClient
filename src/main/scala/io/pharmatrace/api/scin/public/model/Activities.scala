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


case class Activities (
  // Position in pagination.
  offset: Option[Integer] = None,
  // Number of items to retrieve (100 max).
  limit: Option[Integer] = None,
  // Total number of items available.
  count: Option[Integer] = None,
  history: Option[List[Activity]] = None
)

