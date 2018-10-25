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


case class Pharmaceutical (
  // Either gtin or synthetical for precision medicine.
  pharmaceuticalId: Option[String] = None,
  // Global trade item number (GS1)
  gtin: Option[String] = None,
  // Manufacturers official name of the pharmaceutical product.
  tradeName: Option[String] = None,
  // EAN code.
  eanCode: Option[String] = None,
  // Manufaturer id
  manufacturerId: Option[String] = None,
  // Image URL representing the product.
  image: Option[String] = None
)

