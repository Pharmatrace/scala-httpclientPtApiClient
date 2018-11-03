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

package io.pharmatrace.api.scin.public.api

import java.text.SimpleDateFormat

import io.pharmatrace.api.scin.public.model.Error
import io.pharmatrace.api.scin.public.model.Locations
import io.pharmatrace.api.scin.public.{ApiInvoker, ApiException}

import collection.mutable
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart
import com.wordnik.swagger.client._
import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import java.net.URI
import java.io.File
import java.util.Date
import java.util.TimeZone
import javax.ws.rs.core.MediaType

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.collection.mutable.HashMap
import scala.util.{Failure, Success, Try}

import org.json4s._

class ContainerApi(
  val defBasePath: String = "https://api.pharmatrace.io/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new ContainerApiAsyncHelper(client, config)

  /**
   * Location History
   * Returns the location history of a container or a individually labeled pharmaceutical
   *
   * @param containerId container id of the tracked container. (optional)
   * @param offset Offset the list of returned results by this amount. Default is zero. (optional)
   * @param limit Number of items to retrieve. Default is 5, maximum is 100. (optional)
   * @return Locations
   */
  def locationHistoryGet(containerId: Option[String] = None, offset: Option[Integer] = None, limit: Option[Integer] = None): Option[Locations] = {
    val await = Try(Await.result(locationHistoryGetAsync(containerId, offset, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Location History asynchronously
   * Returns the location history of a container or a individually labeled pharmaceutical
   *
   * @param containerId container id of the tracked container. (optional)
   * @param offset Offset the list of returned results by this amount. Default is zero. (optional)
   * @param limit Number of items to retrieve. Default is 5, maximum is 100. (optional)
   * @return Future(Locations)
   */
  def locationHistoryGetAsync(containerId: Option[String] = None, offset: Option[Integer] = None, limit: Option[Integer] = None): Future[Locations] = {
      helper.locationHistoryGet(containerId, offset, limit)
  }

}

class ContainerApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def locationHistoryGet(containerId: Option[String] = None,
    offset: Option[Integer] = None,
    limit: Option[Integer] = None
    )(implicit reader: ClientResponseReader[Locations]): Future[Locations] = {
    // create path and map variables
    val path = (addFmt("/locationHistory"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    containerId match {
      case Some(param) => queryParams += "container_id" -> param.toString
      case _ => queryParams
    }
    offset match {
      case Some(param) => queryParams += "offset" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}