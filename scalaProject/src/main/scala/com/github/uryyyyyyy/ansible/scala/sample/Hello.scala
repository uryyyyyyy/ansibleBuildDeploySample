package com.github.uryyyyyyy.ansible.scala.sample

import java.io.File

import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory

object Hello {
  val  logger = LoggerFactory.getLogger(classOf[Hello])

  def main(args: Array[String]): Unit = {
//    val conf = ConfigFactory.load("conf/application.conf")
    val conf =  ConfigFactory.parseFile(new File("conf/application.conf"))
    val bar1 = conf.getString("conf")
    logger.info("hello " + bar1)
  }
}

class Hello