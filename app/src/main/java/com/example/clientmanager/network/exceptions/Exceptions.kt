package com.example.clientmanager.network.exceptions

class BadRequestException(message: String?) : Exception(message)

class NotFoundException(message: String?) : Exception(message)

class UnauthorizedException(message: String?) : Exception(message)

class UnknownException(message: String?) : Exception(message)