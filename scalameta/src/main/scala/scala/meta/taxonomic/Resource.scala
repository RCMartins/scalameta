package scala.meta
package taxonomic

import java.io._
import java.net.URI
import org.scalameta.adt._
import org.scalameta.invariants._

final case class Resource(name: String, uri: URI) {
  def open(): InputStream = uri.toURL.openStream()
  override def toString = "Resource(\"" + name + "\", new URI(\"" + uri + "\"))"
}