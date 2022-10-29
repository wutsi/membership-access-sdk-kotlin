package com.wutsi.membership.access.dto

import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class Account(
  public val id: Long = 0,
  public val email: String? = null,
  public val phone: Phone = Phone(),
  public val city: Place = Place(),
  public val category: Category = Category(),
  public val pictureUrl: String? = null,
  public val status: String = "",
  public val displayName: String = "",
  public val language: String = "",
  public val country: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val suspended: OffsetDateTime? = null,
  public val superUser: Boolean = false,
  public val business: Boolean = false,
  public val biography: String? = null,
  public val website: String? = null,
  public val whatsapp: String? = null,
  public val street: String? = null,
  public val timezoneId: String? = null,
  public val facebookId: String? = null,
  public val instagramId: String? = null,
  public val twitterId: String? = null,
  public val youtubeId: String? = null,
)
