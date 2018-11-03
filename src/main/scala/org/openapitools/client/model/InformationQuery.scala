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

package org.openapitools.client.model


case class InformationQuery (
  // GMT, Unix Epoch
  timestamp: Option[Long] = None,
  // unique id hash of the transaction
  txUid: Option[String] = None,
  // id reference to the terms and conditions for this transaction
  termsId: Option[String] = None,
  // hyperledger channel the transaction has been executed in
  transactionChannel: Option[String] = None
)

