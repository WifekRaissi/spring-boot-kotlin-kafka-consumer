package com.firstexample.kafkaconsumer.services

import org.springframework.cloud.stream.annotation.StreamListener


interface UtilisateurService{


    @StreamListener(value = "input")
    fun receiveUtilisateur(utilisateur: ByteArray)
}