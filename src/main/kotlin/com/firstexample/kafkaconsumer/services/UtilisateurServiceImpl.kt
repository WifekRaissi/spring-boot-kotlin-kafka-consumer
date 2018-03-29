package com.firstexample.kafkaconsumer.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.firstexample.kafkaconsumer.entities.Utilisateur
import org.slf4j.LoggerFactory
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Service

@Service
open class UtilisateurServiceImpl: UtilisateurService {
    val JSON = jacksonObjectMapper()


    private val logger = LoggerFactory.getLogger(UtilisateurService::class.java)

    @StreamListener("input")
    override fun receiveUtilisateur(utilisateur:ByteArray){

        val parsedMessage = JSON.readValue(utilisateur, String::class.java)
        val u=JSON.readValue(parsedMessage, Utilisateur::class.java)
        logger.info("Kotlin received: " + u)

    }



}