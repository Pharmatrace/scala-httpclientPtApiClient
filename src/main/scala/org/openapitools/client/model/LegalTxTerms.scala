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


case class LegalTxTerms (
  // GMT, Unix Epoch
  timestampValidFrom: Option[Long] = None,
  // GMT, Unix Epoch
  timestampValidUntil: Option[Long] = None,
  // tolerance window for transactions that begin but do not finish under the governance of these terms (in ms)
  validityTolerance: Option[Long] = None,
  // unique id hash of the transaction terms and conditions
  termsId: Option[String] = None,
  // optional version mark of the terms
  termsVersion: Option[String] = None,
  // optional link to the previous version of these terms
  termsIdPreviousVersion: Option[String] = None,
  // text of the terms and conditions
  termsText: Option[String] = None,
  // ISO language code, e.g. en_us
  language: Option[String] = None,
  // legislation enforcing these terms
  legislation: Option[String] = None
)

