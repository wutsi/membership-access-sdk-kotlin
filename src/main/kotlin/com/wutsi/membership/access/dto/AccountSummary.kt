package com.wutsi.membership.access.dto

import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class AccountSummary(
  public val id: Long = 0,
  public val pictureUrl: String? = null,
  public val status: String = "",
  public val displayName: String = "",
  public val language: String = "",
  public val country: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val superUser: Boolean = false,
  public val business: Boolean = false,
  public val cityId: Long = 0,
  public val categoryId: Long? = null,
  public val storeId: Long? = null,
  public val walletId: Long? = null,
)
