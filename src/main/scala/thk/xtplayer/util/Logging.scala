package thk.xtplayer.util

import org.slf4j.LoggerFactory

object Logging extends Logging

trait Logging {
  protected lazy val log = LoggerFactory.getLogger(getClass)

  def info(s: => String) = if (log.isInfoEnabled) log.info(s)
  def debug(s: => String) = if (log.isDebugEnabled) log.debug(s)
  def error(s: => String, any: Throwable) = if (log.isErrorEnabled) log.error(s, any)
}
