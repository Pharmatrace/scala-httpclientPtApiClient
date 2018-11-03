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

package org.openapitools.client.api

import java.text.SimpleDateFormat

import org.openapitools.client.model.Error
import org.openapitools.client.model.InformationQuery
import org.openapitools.client.{ApiInvoker, ApiException}

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

class InformationQuerysApi(
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
  val helper = new InformationQuerysApiAsyncHelper(client, config)

  /**
   * 
   * Creates a new informationquery
   *
   * @param informationQuery InformationQuery to create 
   * @return InformationQuery
   */
  def addInformationQuery(informationQuery: InformationQuery): Option[InformationQuery] = {
    val await = Try(Await.result(addInformationQueryAsync(informationQuery), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * Creates a new informationquery
   *
   * @param informationQuery InformationQuery to create 
   * @return Future(InformationQuery)
   */
  def addInformationQueryAsync(informationQuery: InformationQuery): Future[InformationQuery] = {
      helper.addInformationQuery(informationQuery)
  }

  /**
   * 
   * deletes a single informationquery based on the ID supplied
   *
   * @param id ID of informationquery to delete 
   * @return void
   */
  def deleteInformationQuery(id: Long) = {
    val await = Try(Await.result(deleteInformationQueryAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * deletes a single informationquery based on the ID supplied
   *
   * @param id ID of informationquery to delete 
   * @return Future(void)
   */
  def deleteInformationQueryAsync(id: Long) = {
      helper.deleteInformationQuery(id)
  }

  /**
   * 
   * Returns a informationquery based on the ID
   *
   * @param id ID of informationquery to fetch 
   * @return InformationQuery
   */
  def find informationquery by id(id: Long): Option[InformationQuery] = {
    val await = Try(Await.result(find informationquery by idAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * Returns a informationquery based on the ID
   *
   * @param id ID of informationquery to fetch 
   * @return Future(InformationQuery)
   */
  def find informationquery by idAsync(id: Long): Future[InformationQuery] = {
      helper.find informationquery by id(id)
  }

  /**
   * 
   * Returns all informationquerys from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 
   *
   * @param tags tags to filter by (optional, default to new ListBuffer[String]() )
   * @param limit maximum number of results to return (optional)
   * @return List[InformationQuery]
   */
  def findInformationQuerys(tags: Option[List[String]] = Option(new ListBuffer[String]() ), limit: Option[Integer] = None): Option[List[InformationQuery]] = {
    val await = Try(Await.result(findInformationQuerysAsync(tags, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * Returns all informationquerys from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 
   *
   * @param tags tags to filter by (optional, default to new ListBuffer[String]() )
   * @param limit maximum number of results to return (optional)
   * @return Future(List[InformationQuery])
   */
  def findInformationQuerysAsync(tags: Option[List[String]] = Option(new ListBuffer[String]() ), limit: Option[Integer] = None): Future[List[InformationQuery]] = {
      helper.findInformationQuerys(tags, limit)
  }

}

class InformationQuerysApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addInformationQuery(informationQuery: InformationQuery)(implicit reader: ClientResponseReader[InformationQuery], writer: RequestWriter[InformationQuery]): Future[InformationQuery] = {
    // create path and map variables
    val path = (addFmt("/informationquerys"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (informationQuery == null) throw new Exception("Missing required parameter 'informationQuery' when calling InformationQuerysApi->addInformationQuery")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(informationQuery))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteInformationQuery(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/informationquerys/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def find informationquery by id(id: Long)(implicit reader: ClientResponseReader[InformationQuery]): Future[InformationQuery] = {
    // create path and map variables
    val path = (addFmt("/informationquerys/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def findInformationQuerys(tags: Option[List[String]] = Option(new ListBuffer[String]() ),
    limit: Option[Integer] = None
    )(implicit reader: ClientResponseReader[List[InformationQuery]]): Future[List[InformationQuery]] = {
    // create path and map variables
    val path = (addFmt("/informationquerys"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    tags match {
      case Some(param) => queryParams += "tags" -> param.toString
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
